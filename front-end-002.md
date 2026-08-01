## 호이스팅 (Hoisting)

JS 엔진은 코드 실행 전 메모리 평가 단계를 거치는데, 이로 인해 **변수나 함수의 선언 정보가 메모리에 먼저 등록되는 현상**을 호이스팅(Hoisting)이라고 한다.
⇒ 코드 실행 전에 변수나 함수 선언이 코드의 최상단으로 끌어 올려진 것처럼 먼저 처리되는 것처럼 동작하는 자바 스크립트의 특성이다.

### 1. 변수 선언 키워드

- **`var`** : **선언과 동시에 `undefined`로 초기화**되어 선언 이전에 접근해도 에러가 발생하지 않는다.
    
    ```jsx
    console.log(var1);  // 결과: undefined
    var var1 = "var";
    ```
    
- **`let`**과 **`const`**: 선언은 먼저 처리(메모리에 등록)되지만, 초기화는 선언문을 만났을 때 이루어진다. 먼저 처리된 선언은 **실제로 선언문과 만날 때까지 Temporal Dead Zone(TDZ; 일시적 사각지대)에 머물러 접근이 제한**되는데, 이로 인해 선언 전에 접근을 시도할 경우 `ReferenceError`가 발생한다.
    - **TDZ의 존재 의의**
        1. **안전하고 예측 가능한 코드를 만들기 위해**: 변수 선언 및 초기화 전에 변수에 접근이 가능한 경우 변수 값이 꼬여서 버그가 발생해도 찾기 어렵다. `let`과 `const`는 실제 선언 전에 접근 시 바로 에러를 발생시키므로 개발자가 실수를 찾기 쉽다.
        2. **`const`의 특성 보장**: `const`는 **재할당이 불가능한 상수**인데, `undefined`로 먼저 초기화되어버리면 나중에 실제 초기화식을 만나면 재할당을 시도하는 것이 된다. 따라서 엉뚱한 값으로 초기화되지 않도록 접근을 막고 초기화를 실제 초기화 시점으로 미뤄 두어야 한다.
        `const x;`가 `SyntaxError`를 일으키는 이유도 선언과 초기화가 동시에 일어나야만 TDZ를 탈출하자마자 **딱 한 번만 할당하는 상수의 조건을 만족**할 수 있기 때문이다.
    
    ```jsx
    // console.log(let1);      // TDZ에 접근하므로 ReferenceError
    // console.log(const1);    // TDZ에 접근하므로 ReferenceError
    
    let let1 = "let";
    const const1 = "const";
    ```
    

### 2. 함수 호이스팅

- **선언적 함수**: 함수 정의 전체가 호이스팅 되어 선언 코드보다 먼저 호출 가능하다.
- **함수 표현식**: 함수 표현식은 변수에 익명 함수를 할당한 형태이므로 변수 선언 호이스팅 규칙을 따른다. 따라서 선언 전에 호출 시 `TypeError` 또는 `ReferenceError`가 발생한다.
    
    ```jsx
    homework();   // 함수 전체가 메모리에 등록되어 정상 동작
    
    function homework() {
    	console.log("front-end-002");
    }
    
    // sad();    
    // 변수 sad가 호이스팅 되어 undefined로 초기화됨
    // 이때 익명 함수 function() {}은 아직 변수에 할당되지 않음
    // 변수 sad에 ()를 붙여 함수처럼 호출하려고 해도 undefined를 함수로 인식할 수 없음
    // 따라서 TypeError: sad is not a function 발생
    var sad = function() {
    	console.log("I'll be sad if this function gets executed");
    }
    
    // angry();
    // lazy();
    // 변수 angry와 상수 lazy는 TDZ에 있어서 접근조차 할 수 없음
    // ReferenceError 발생
    let angry = function() {
    	console.log("I'll get angry if this function gets executed");
    }
    const lazy = function() {
    	console.log("I'll be lazy today if this function gets executed");
    }
    ```
    

---

## 클로저 (Closure)

내부 함수가 외부 함수의 변수를 기억하고 계속 접근 및 사용할 수 있는 기능. 외부 함수의 실행이 종료되어 메모리에서 사라지더라도 내부함수만 살아 있으면 필요한 데이터가 유지되는데, 이는 함수가 자신이 만들어질 당시의 변수를 기억하는 상태이므로 가능하다.

Java의 private 접근 제한자처럼 외부에서 특정 데이터에 직접 접근하는 것을 막고, 전역 변수의 오염 없이 상태 변화를 유지할 때 유용하다. 

#### 활용 분야

- **모듈 패턴** : 데이터 은닉을 통한 안전한 프로그램 구조 작성
카운터, 상태 관리기처럼 외부 접근을 막고 정해진 메서드만 노출할 때 사용
- **이벤트 핸들러 상태 기억** : 비동기 처리(비동기 콜백)나 이벤트 실행 시 고유 상태 유지
클릭 이벤트가 발생할 때마다 이전 클릭 횟수를 기억하거나 특정 클릭 시점의 ID값 유지 등에 사용

```jsx
 function getCounter() {    // 외부함수
	 let count = 0;
	 // count 변수는 외부에서 직접 접근할 수 없다. (데이터 은닉)
	
	function addCount() {    // 내부함수 (클로저)
		count++;
		return count;
	};
	return addCount;    // 외부함수에서 자신의 내부함수를 반환
}

const counter1 = getCounter();  // getCounter()가 실행되고 addCount()가 반환됨
console.log(counter1());    // result: 1
console.log(counter1());    // result: 2
// 외부함수 실행이 종료되었으나 count 변수가 메모리에 유지됨 (클로저 형성)
console.log(counter1());    // result: 3
// 클로저가 기억하는 count 변수를 참조하여 내부함수 실행

const counter2 = getCounter();
console.log(counter2());    // result: 1
// 외부함수 getCounter()를 호출할 때마다 새로이 독립적인 렉시컬 환경이 생성됨
// => counter1, counter2의 count는 서로 영향을 주지 않음
// Lexical Envrionment: 자신이 생성될 당시의 환경
```
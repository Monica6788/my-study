

public class PointPay extends PaymentMethod {
	// [1] 공통 부분 제거
	// [2] 상속 관계 적용
	// [3] getter, setter 생성자 등을 활용하여 원래 기능까지 동작 처리
	
	// 포인트 결제 방식에서만 사용되는 데이터
	private int myPoint;		// 포인트 점수
	
	public PointPay() {}
	
	public PointPay(String payName, int payAmount, int myPoint) {
		super(payName, payAmount);
		this.myPoint = myPoint;
	}


	public int getMyPoint() {
		return myPoint;
	}
	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	
	/**
	 * 결제 정보 출력
	 */
	@Override		// 어노테이션
	// 오버라이딩 된 메소드를 명시적으로 표시
	// 컴파일 단계에서 (구조를)잘못 작성했을 경우 오류로 노티 해줌.
	public void processPay() {
		System.out.println(" ===== 포인트 결제 정보 =====");
		System.out.println("- 결제 금액:" + getPayAmount());
		System.out.println("- 내 포인트 잔액:" + myPoint);
		
		// 결제 금액 < 포인트 잔액 => "결제 성공" 출력
		// 결제 금액 > 포인트 잔액 = > "결제 실패(잔액 부족)
		
		if (getPayAmount() >= myPoint) {
			System.out.println("결제 성공");
			myPoint -= getPayAmount();
			System.out.println("- 내 포인트 잔액:" + myPoint);
		} else {
			System.out.println("포인트 잔액이 부족합니다.");
		}
		/*
		  System.out.println((getPayAmount > myPoint? 
		  				"포인트 잔액이 부족합니다." : "결제 성공"));
		*/
	}
	
	

}

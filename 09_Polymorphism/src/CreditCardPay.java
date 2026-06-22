

// 카드 결제 방식
// 상속 관계 적용: extends
public class CreditCardPay extends PaymentMethod {
	// 카드 결제 방식에서만 사용되는 데이터
	private String cardNumber;	// 카드 번호
	private int installment;	// 할부 개월수
	
	public CreditCardPay() {}
	
	public CreditCardPay(String payName, int payAmount,
			String cardNumber, int installment) {
		// this.payName = payName;
		// PaymentMethod에서 private로 선언된 필드이므로 접근 불가
		
		// [1] setter 메소드를 통해 부모 클래스로부터 물려받은 필드에 대입(저장)
//		setPayName(payName);
//		setPayAmount(payAmount);
		
		// [2] 부모 클래스의 생성자 사용(호출) 
		// 이 방법이 더 보편적이다.
		super(payName, payAmount);
		// super();의 괄호 안에 있는 애들은 이 생성자의 매개변수
		// 생성자를 호출할 때는 항상 첫 줄에 작성!!!
		// 생성자가 this.변수 = 매개변수;보다 아랫줄에 있으면 오류.
		this.cardNumber = cardNumber;
		this.installment = installment;
	}


	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getInstallment() {
		return installment;
	}
	public void setInstallment(int installment) {
		this.installment = installment;
	}
	
	// 결제 정보 출력
	@Override
	public void processPay() {
		System.out.println(" ===== 카드 결제 정보 =====");
		System.out.println("- 결제 금액:" + getPayAmount());
		System.out.println("- 카드 번호:" + cardNumber);
		System.out.println("- 할부 개월 수: "
			+ (installment == 0? "일시불" : installment + "개월"));
		/*
		 if (installment == 0) {
		 	System.out.println("- 할부 개월 수: 일시불");
		 } else {
		 	System.out.println("-할부 개월 수: " + installment + "개월");
		 } 
		 */
	}
	

	

}

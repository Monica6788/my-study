

// 공통되는 결제 정보를 관리하기 위한 클래스
// payName, payAmount, 결제정보 출력(내용은 다르지만 public void 매개변수 없음)
public class PaymentMethod {
	// 모든 클래스는 부모 클래스가 존재!!!
	// 모든 클래스는 Object 클래스의 자식 클래스
	private String payName;
	private int payAmount;
	
	public PaymentMethod() {
		super();
	}
	
	public PaymentMethod(String payName, int payAmount) {
		super();
		this.payName = payName;
		this.payAmount = payAmount;
	}

	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}

	public int getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}
		
	public void processPay() {
		System.out.println("========== 결제 정보 ==========");
		System.out.println("- 결제명: " + payName);
		System.out.println("- 결제 금액: " + payAmount);
	}

}

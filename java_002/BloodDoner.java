package java_002;

public class BloodDoner {
	// --------------- 필드 ---------------
	private String name;
	private int age;
	private char gender;
	private String bloodType;	// 예시: Rh+ O형
	private int giftNumber;
	private String[] giftList = {"문화상품권", "기부권", "편의점 교환권", 
										"여행용 세트", "커피 교환권"};
	private String gift;
	private boolean enoughTime;	// true: 성분헌혈, false: 전혈헌혈
	private String donateType;
	private boolean goodCondition;
	private int amountOfBlood;	// 헌혈량
	
	// ------------- 생성자 ------------------
	public BloodDoner() {
		
	}
	
	// ------------- 메소드 -------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public int getGiftNumber() {
		return giftNumber;
	}

	public void setGiftNumber(int giftNumber) {
		this.giftNumber = giftNumber;
	}
	
	public String getGift() {
		return gift;
	}
	
	public void setGift(int giftNumber) {
		this.gift = this.giftList[this.giftNumber - 1];
	}

	public boolean isEnoughTime() {
		return enoughTime;
	}

	public void setEnoughTime(boolean enoughTime) {
		this.enoughTime = enoughTime;
	}
	
	public String getDonateType(boolean enoughTime) {
		return this.donateType;
	}
	
	public void setDonateType(boolean enoughTime) {
		if(this.enoughTime == true) {
			this.donateType = "혈장성분헌혈";
		}
		else {
			this.donateType = "전혈헌혈";
		}
	}

	public boolean isGoodCondition() {
		return goodCondition;
	}

	public void setGoodCondition(boolean goodCondition) {
		this.goodCondition = goodCondition;
	}

	public void setAmountOfBlood(boolean enoughTime, boolean goodCondition) {
		if(enoughTime == true) {
			this.amountOfBlood = 500;
		}
		else {
			if(goodCondition == true) {
				this.amountOfBlood = 400;
			}
			else {
				this.amountOfBlood = 320;
			}
		}
	}
	
	public int getAmountOfBlood() {
		return this.amountOfBlood;
	}

	public void receiveGift(String gift) {
		System.out.printf("선택하신 기념품은 %s입니다.\n", this.gift);
	}
	public void inform() {
		System.out.printf("%s %s님(%d세, %c)의 %s(%dml)에 감사드립니다.\n",
							bloodType ,name, age, gender, 
							donateType, amountOfBlood);
		System.out.println("제공된 음료와 함께 10분간 지혈하시고,"
							+ " 헌혈 당일 격한 운동은 삼가주십시오.");
	}

}

package java_002;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BloodDoner doner = new BloodDoner();
		
		System.out.print("이름을 입력해주세요: ");
		doner.setName(sc.next());
		
		System.out.print("성별을 입력해주세요(남, 여): ");
		doner.setGender(sc.next().charAt(0));

		System.out.print("나이를 입력해주세요: ");
		doner.setAge(sc.nextInt());
		sc.nextLine();

		System.out.print("예시: Rh+ O형\n");
		System.out.print("위 예시처럼 혈액형을 입력해주세요: ");
		doner.setBloodType(sc.nextLine());

		System.out.print("1. 문화상품권\n2. 기부권\n3. 편의점 교환권\n"
						+ "4. 여행용 세트\n5. 커피 교환권\n");
		System.out.print("선택하실 기념품 번호를 입력해주세요: ");
		doner.setGiftNumber(sc.nextInt());
		doner.setGift(doner.getGiftNumber());

		System.out.print("시간이 오래 걸려도 괜찮으십니까?(true, false): ");
		doner.setEnoughTime(sc.nextBoolean());
		doner.setDonateType(doner.isEnoughTime());

		System.out.print("컨디션은 괜찮으십니까?(true, false): ");
		doner.setGoodCondition(sc.nextBoolean());
		doner.setAmountOfBlood(doner.isEnoughTime(), doner.isGoodCondition());

		doner.receiveGift(doner.getGift());
		doner.inform();
		
		sc.close();
	}

}

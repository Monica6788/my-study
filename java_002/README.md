# 클래스 다이어그램

| **BloodDoner** |
| --- |
| - name: String
- age: int
- gender: char
- bloodType: String
- giftNumber: int
- giftList: String[]
- gift: String
- enoughTime: boolean
- donateType: String
- goodCondition: boolean
- amountOfBlood: int |
| + BloodDoner()
+ getName(): String
+ setName(name: String): void
+ getAge(): int
+ setAge(age: int): void
+ getGender(): char
+ setGender(gender: char): voif
+ getBloodType(): String
+ setBloodType(bloodType: String): void
+ getGiftNumber(): int
+ setGiftNumber(giftNumber: int): void
+ getGift(): String
+ setGift(giftNumber: int): void
+ isEnoughTime(): boolean
+ setEnoughTime(enoughTime: boolean): void
+ getDonateType(enoughTime: boolean): String
+ setDonateType(enoughTime: boolean): void
+ isGoodCondition(): boolean
+ setGoodCondition(goodCondition: boolean): void
+ getAmountOfBlood(): int
+ setAmountOfBlood(goodCondition: boolean): void
+ receiveGife(gift: String): void
+ inform(): void |

# 설계 내용 정리

스캐너로 이름, 나이, 성별, 혈액형, 수령할 기념품, 시간이 오래 걸려도 괜찮은지 여부와 컨디션이 괜찮은지 여부를 입력받습니다.

기념품은 주어진 리스트에서 번호로 고를 수 있습니다.

시간이 오래 걸려도 괜찮다면 혈장성분헌혈, 괜찮지 않다면 전혈헌혈을 헌혈 종류로 정합니다.

전혈헌혈을 할 경우에 컨디션이 괜찮다면 400ml, 괜찮지 않다면 320ml만큼 채혈합니다. 혈장성분헌혈은 500ml로 고정됩니다.

번호로 고른 기념품을 배열인덱스로 추출한 문자열을 포함하여 다음 예시와 같은 안내를 출력합니다.

(입력: 2 → 출력: 선택하신 기념품은 기부권입니다.)

헌혈자의 이름, 나이, 성별, 혈액형, 진행한 헌혈의 종류와 헌혈량을 다음 예시와 같은 안내를 출력합니다.

(Rh+ O형 이고은님(28세, 여)의 혈장성분헌혈(500ml)에 감사드립니다.
제공된 음료와 함께 10분간 지혈하시고, 헌혈 당일 격한 운동은 삼가주십시오.)
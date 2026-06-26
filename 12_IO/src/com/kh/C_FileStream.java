package com.kh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.model.Person;

public class C_FileStream {

	public static void main(String[] args) {
//		fileSave();
//		fileRead();
//		objectSave();
		objectRead();
	}
	
	//파일 출력: 프로그램 ---> 파일	 
	public static void fileSave() {
		/*
		 * 기반 스트림: 외부 매체와 직접 연결되는 통로
		 * 		FileWriter. 파일을 직접적으로 연결하여 2바이트씩 출력하는 스트림.
		 * 보조 스트림: 기반 스트림의 보조 역할. 개발자가 사용하기 편하게~
		 * 		BufferedWriter. 속도 향상을 도와주는 보조 스트림.
		 */
		
		System.out.println("***** fileSave *****");
//		BufferedWriter bw = null;
		
//		try {
//			// 1. 기반 스트림 생성
//			fw  = new FileWriter("file1.txt");
//			
//			// 2. 보조 스트림 생성
//			/* BufferedWriter */ bw = new BufferedWriter(fw);		// fw 주소 전달.
//			
//			// 3. 파일에 데이터 쓰기 (출력)
//			bw.write("파일에 데이터 쓰기!");	// 보조 스트림을 통해 작성.
//			bw.write("즐겁다 마참내!");			// 줄바꿈 처리!
//			
//			bw.newLine();
//			
//			bw.write("드디어 금요일!");
//			bw.flush();
//			
//			bw.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(bw != null) {
//					bw.close();
//					// bw는 위 try {} 안에 선언된 변수이므로 finally {} 안에 있는 것은 못 읽는다.
//					// => try {} 밖, 즉 메소드 시작부에서 변수를 선언하고, try{} 내에서는 생성 및 할당.
//					// 근데 또 선언만 하면 bw를 여기서 닫을 수가 없으므로 선언 시 일단 null로 할당.
//				}
//				
//			} catch (IOException e) {
//				
//			}
//		}
		
		// try~with~resources 구문으로 변경해보기.
		
		try (FileWriter fw = new FileWriter("file1.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			
			bw.write("파일에 데이터 쓰기!!! ");
			bw.write(" 재밌다!");
			
			bw.newLine();
			
			bw.write("금요일이당~");
			bw.flush();
			
			// bw.close();를 이 구문에서는 안 써도 된다~!
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 파일 입력: 프로그램 <--- 파일
	public static void fileRead() {
		// 기반 스트림: FileReader
		// 보조 스트림: BufferedReader
		//			한 줄씩 데이터를 읽어오도록 도와주는 보조 스트림.
		
		System.out.println("*** fileRead ***");
		
		try (FileReader fr = new FileReader("file1.txt");
				BufferedReader br = new BufferedReader(fr)) {
//			// 파일 내용을 읽어오기
//			System.out.println(br.readLine());
//			// .read()와 달리 .readLine()은 한 줄씩 읽어줌.
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());	// 두 줄밖에 작성 안 한 파일이므로 null로 출력됨.
//			
//			// => 파일이 몇 줄짜리인지 확인하고 돌리지는 않음.
//			// 반복문을 통해 끝까지 읽어주는 코드 구현 가능.
//			
//			while(true) {
//				String line = br.readLine();
//				if (line == null) {break;}
//				System.out.println(line);
//			}
			
			String line2;
			while((line2 = br.readLine()) != null) {	// 이런 형태의 while문이 더 자주 쓰임.
													// 근데 솔직히 나도 이게 더 이뻐 보임...ㅋㅋㅋ
				System.out.println(line2);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 파일 출력: 프로그램 ---> 파일. 객체에 저장된 데이터
	public static void objectSave() {
		// 객체 데이터 생성(출력할 데이터)
		Person p1 = new Person("홍길동", 20, 178.7);
		Person p2 = new Person("이고은", 28, 165.3);
		Person p3 = new Person("단테", 39, 185.4);
		
		// 파일에 데이터 저장
		// 보조 스트림: ObjectOutputStream. 객체 단위로 출력을 도와주는 보조 스트림.
		// 이것만으로 객체와 연결된 건 아님!!! 직접 연결은 항상 기반 스트림.
		// 기반 스트림: FileOutputStream. 1바이트 단위로 파일에 출력하는 스트림.
		
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("file2.txt"))) {
//			oos.writeObject(p1);
//			NotSerializableException 예외 발생: 직렬화 불가능하다는 뜻!!!
//			Person 클래스가 Serializable 인터페이스를 상속해야 함.
//			입출력이 필요한 모델 클래스는 Serializable 클래스를 상속할 것!
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3.toString());
			
			// 객체 배열 생성해서 반복문 돌면서 출력도 가능!
			
			// 저장된 파일을 열어 보면 사람이 읽을 수 없는 내용이 있음.
			// 컴퓨터가 읽을 수 있는 언어로 저장되어 있다고 보면 됨.
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

	// 객체 데이터 입력: 프로그램 <--- 파일. 프로그램으로 데이터가 들어온다.
	public static void objectRead() {
		// 보조 스트림: ObjectInputStream.
		// 기반 스트림: FileInputStream.
		
		try(ObjectInputStream ois = new ObjectInputStream(
									new FileInputStream("file2.txt"))){
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			// => EOFException 발생
			// 더 이상 읽어올 데이터가 없을 때 EOFException이 발생한다.
		} catch(EOFException e) {
			System.out.println("데이터 로드 완료");
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 예외 클래스끼리 상속관계가 없을 때에는 |를 이용해서 여러 개 나열도 가능!
	}
}

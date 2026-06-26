package com.kh.view;

import java.util.Scanner;
import com.kh.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****\n"
							+ "1. 노트 새로 만들기\n" 
							+ "2. 노트 열기\n" 
							+ "3. 노트 열어서 수정하기\n" 
							+ "9. 끝내기");
			System.out.print("메뉴 번호: ");
			int n = sc.nextInt();
			sc.nextLine();

			switch (n) {
			case 1: fileSave();		break;
			case 2: fileOpen();		break;
			case 3: fileEdit();		break;
			case 9 : System.out.println("프로그램을 종료합니다.");	return;
			default : System.out.println("잘못 누르셨습니다.");		break;
			}
		}

	}

	public void fileSave() {
		String s = "";
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.\n"
					+ "ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용: ");
			String content = sc.nextLine();
			if(content.equals("ex끝it")) {
				break;
			}
			s += content + "\n";
		}
		
		while(true) {
			System.out.print("저장할 파일명을 입력해주세요.(ex: myFile.txt)");
			String fileName = sc.nextLine();
			
			if(fc.checkName(fileName)) {
				System.out.println("이미 존재하는 파일명입니다. 덮어 쓰시겠습니까? (y/n)");
				char yn = sc.next().charAt(0);
				if (yn == 'n' || yn == 'N') {
					continue;		// 반복문의 나머지 코드를 무시하고 즉시 다음 루프 회차로 넘어감.
				} else if (yn == 'y' || yn == 'Y') {
					fc.fileSave(fileName, s);
					break;		// 자신을 감싼 가장 가까운 반복문이나 switch문을 즉시 전면 종료.
				} else {System.out.println("잘못 누르셨습니다.");}
			}
			fc.fileSave(fileName, s);
			break;
		}
		
		
	}

	public void fileOpen() {
		System.out.print("열 파일명: ");
		String fileName = sc.nextLine();
		if(fc.checkName(fileName)) {
			System.out.println(fc.fileOpen(fileName));
		} else {System.out.println("존재하지 않는 파일입니다.");}
		

	}

	public void fileEdit() {
		System.out.print("수정할 파일명: ");
		String fileName = sc.nextLine();
		if (fc.checkName(fileName)) {
			String s = "";
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.\n"
									+ "ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용: ");
				String content = sc.nextLine();
				if(content.equals("ex끝it")) {
					break;
				}
				s += content + "\n";
			}
			fc.fileEdit(fileName, s);
		} else {System.out.println("존재하지 않는 파일입니다.");}
		
	}

}

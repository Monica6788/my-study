package com.kh;

import java.io.File;
import java.io.IOException;

public class A_File {
	/*
	 * File: 파일을 다루는 객체 (경로: java.util)
	 */
	public static void main(String[] args) {
		method2();
	}

	public static void method1() {
		// File 객체 생성
		File f1 = new File("test1.txt");
		// => 존재하지 않는 파일 이름만 가지고 생성.
		File f2 = new File("D:\\test2.txt");
		// => 존재하는 파일의 경로 포함 이름을 가지고 생성.
		File f3 = new File("D:\\test3.txt");
		// => 특정 경로의 존재하지 않는 파일 이름만 가지고 객체 생성.
//		File f4 = new File("D:\\temp\\test4.txt");
		// => 존재하지 않는 경로의 파일 이름으로 객체 생성.
		
		File f4_folder = new File("D:\\temp");		// 폴더 경로까지만 작성.
		File f4 = new File("D:\\temp\\test4.txt");
		
		File f5 = new File("test5.txt");
		
		try {
			f1.createNewFile();
			// => 프로젝트 최상위 경로에 해당 파일 생성.
			f2.createNewFile();
			// => 존재하는 파일의 경우 따로 처리하는 내용이 없다.
			f3.createNewFile();
			// => 특정 경로(지정한 경로)에 해당 파일 생성.
//			f4.createNewFile();
			// => 존재하지 않는 경로에 파일을 생성하려고 하는 겨우 예외 발생.
			// => 폴더가 존재하는지 확인하고, 없으면 폴더 생성 후 파일을 생성하도록 처리.
			// 폴더 생성: mkdir / mkdirs
			f4_folder.mkdir();
			f4.createNewFile();
			
			// 파일이 존재하는지 확인: exists(): boolean
			System.out.println("test1.txt가 존재하는가? " + f1.exists());
			System.out.println("test5.txt가 존재하는가? " + f5.exists());
			
			// 파일인지 확인: isFile(): boolean
			System.out.println("f4는 파일인가? " + f4.isFile());
			System.out.println("f4_folder는 파일인가? " + f4_folder.isFile());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		// => test1.txt 생성!
		
		
	}
	
	/**
	 * sample 폴더 생성 후 myDiary.txt 파일 생성하기
	 */
	public static void method2() {
		// sample 폴더가 없는 경우, 폴더 생성.
		File folder = new File("sample");
		
		try {
			if(!folder.exists()) {
				folder.mkdir();
			}
			File file = new File("sample\\myDiary.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			
			// File 객체를 통해 파일 정보 조회
			System.out.println("파일명: " + file.getName());
			System.out.println("파일경로: " + file.getAbsolutePath());
			System.out.println("파일용량: " + file.length());
			System.out.println("파일상위폴더: " + file.getParent());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

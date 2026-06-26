package com.kh.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	/**
	 * @param file 경로
	 * @return 존재하면 true, 존재하지 않으면 false
	 */
	public boolean checkName(String file) {
		return new File(file).exists();
	}
	
	/**
	 * 매개변수로 들어온 파일명을 사용해 물리 파일을 생성하고, String 내용을 파일에 기로(Output)하여 저장.
	 * @param file 파일 경로
	 * @param s 저장 내용
	 */
	public void fileSave(String file, String s) {
		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter(file))) {
			
			bw.write(s);
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 매개변수로 들어온 파일명으로 파일을 찾아 내부에 저장된 데이터를 읽어와 하나의 String으로 반환.
	 * @param file 파일 경로
	 * @return 읽어온 내용
	 */
	public String fileOpen(String file) {
		if(!checkName(file)) {
			return "파일이 존재하지 않습니다.";
		}
		
		String s = "";
		try (BufferedReader br = new BufferedReader(
					new FileReader(file))) {
			while(true) {
				String content = br.readLine();
				if (content == null) {
					break;
				}
				s += content;
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		
		return s;
	}
	
	/**
	 * 해당 파일명으로 파일을 찾고, 기존 내용 뒤에 새로운 String 내용이 이어서 저장.
	 * @param file 파일 경로
	 * @param s 새로운 내용(추가될 내용)
	 */
	public void fileEdit(String file, String s) {
		// 파일 스트림 Append(이어 쓰기)
		// FileWriter("test.txt", true)로 작성하면 기존 파일에 이어서 작성됨.
					
		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter(file, true))) {
			
			bw.write(s);
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

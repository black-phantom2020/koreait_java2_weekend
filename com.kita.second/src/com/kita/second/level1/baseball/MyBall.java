package com.kita.second.level1.baseball;

import java.util.Scanner;

public class MyBall {
	// 내가 숫자값 입력하고 예외 처리하는 클래스
	// 필드
	private int[] myArr;
	private Scanner scan;
	
	public MyBall(int gameCnt) {
		myArr = new int[gameCnt];
		scan = new Scanner(System.in);
	}
	
	// 메소드
	// 숫자를 입력받기 setNumbers()
	// 내 배열 안의 숫자값 뽑기 getMyNum()
	void setNumbers() {
		for() { // myArr의 길이만큼
			// scanner 사용해서 값 입력받기
		}
	}
	
	
	int getMyNum(int idx) {
		return myArr[idx];
	}

}

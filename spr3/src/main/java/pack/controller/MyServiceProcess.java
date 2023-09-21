package pack.controller;

import java.util.Scanner;

import pack.model.MoneyInter;

public class MyServiceProcess implements MyServiceInter{
	private MoneyInter inter;  // 클래스의 포함관계,,, 다형성을 위해
	private int re[];
	
	public MyServiceProcess(MoneyInter inter) { // 이게 생성자 주입
		this.inter = inter;
	}
	
	@Override
	public void inputMoney() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("금액 입력 : ");
			int myMoney = scanner.nextInt();
			re = inter.calcMoney(myMoney);
		} catch (Exception e) {
			System.out.println("inputMoney err : " +e.getMessage());
		}
	}
	
	@Override
	public void showMoney() {
		StringBuffer sb = new StringBuffer();  //문자열 더하기는 StringBuffer or StringBuilder를 사용
		sb.append("만원 : " + re[0] + "\n");
		sb.append("천원 : " + re[1] + "\n");
		sb.append("백원 : " + re[2] + "\n");
		sb.append("십원 : " + re[3] + "\n");
		sb.append("알원 : " + re[4] + "\n");
		System.out.println(sb.toString());  //빠져나오기
	}
}

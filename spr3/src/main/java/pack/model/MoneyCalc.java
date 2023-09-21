package pack.model;

public class MoneyCalc implements MoneyInter{
	@Override
	public int[] calcMoney(int money) {
		// money가 45678원이 들어온다고 가정
		int [] result = new int[5];
		result[0] = money / 10000;  //몫만 취하기
		result[1] = money % 10000 / 1000;  // 나머지를 다시 1000으로 나눠 몫만 취하기
		result[2] = money % 10000 % 1000 / 100;
		result[3] = money % 10000 % 1000 % 100 / 10;
		result[4] = money % 10000 % 1000 % 100 % 10; // 마지막 10으로 나눈 나머지
		
		return result;
	}
}

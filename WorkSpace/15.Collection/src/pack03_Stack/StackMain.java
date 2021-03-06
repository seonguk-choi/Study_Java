package pack03_Stack;

import java.util.Stack;

public class StackMain {
	//인스턴스화 멤버의 규칠 : 인스턴스화 하지않으면 접근 불가능.
	//STATIC은 : 인스턴스화 하지않아도 접근이 가능
	public static void main(String[] args) {
		int a = 0;
		//받아오고싶음(coin의 값을)
		//받아온 다음에 바로 출력하고 싶음
		//Coin <- 인스턴스화 해서 객체로 만들기
		StackMain s = new StackMain();
		//Coin coin1 = s.new Coin(100);
		//Coin coin2 = new StackMain().new Coin(100);
		Stack<Coin> coinBoxSt = new Stack<>();
		coinBoxSt.push(s.new Coin(100));
		coinBoxSt.push(s.new Coin(50));
		coinBoxSt.push(s.new Coin(500));
		coinBoxSt.push(s.new Coin(10));
		//Lifo구조 Last In First Out
		System.out.println(coinBoxSt.pop());
		while(!coinBoxSt.isEmpty()) {
			Coin coin = coinBoxSt.pop();
			System.out.println(coin.value);
		}		
	}//main
	
	public class Coin{
		private int value;
		
		public Coin(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
}

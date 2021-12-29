package pack03_Stack;

import java.util.LinkedList;
import java.util.Queue;

import pack03_Stack.StackMain.Coin;

public class QueueMain {
	public static void main(String[] args) {
		Queue<Coin> coinBoxQ = new LinkedList<>();//List, Queue...
		//Stack push, queue offrer
		//코인객체 넣기! 코인? StackMain
		//Coin이라는 객체를 단독으로 인스턴스화 해보기.
		StackMain sm = new StackMain();
		Coin c = sm.new Coin(10);
		coinBoxQ.offer(sm.new Coin(100));
		coinBoxQ.offer(sm.new Coin(50));
		coinBoxQ.offer(sm.new Coin(500));
		coinBoxQ.offer(sm.new Coin(10));
		//coinBoxQ.offer(new StackMain().new Coin(100));
		while(!coinBoxQ.isEmpty()) {
			Coin coin = coinBoxQ.poll();//<-> Stack pop
			System.out.println(" " + coin.getValue());
		}
	}
}

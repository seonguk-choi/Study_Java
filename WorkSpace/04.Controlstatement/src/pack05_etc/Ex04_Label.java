package pack05_etc;

public class Ex04_Label {
	public static void main(String[] args) {
		//중요도 매우 낮음, 사용빈도 매우 낮음
		//break만 있어도 된다.
		int i = 0;
		LABEL:
		while(true) {
			i++;
			System.out.println(i);
			if( i == 10) {
				break LABEL;
				//LABEL은 세트로 사용
				//LABEL :
				//break LABEL; 세트, break 라벨이름을 사용하면 미리 지정해놓은
				//라벨 구역으로 이동
				//단 이미 실행된 반복문은 실행하지 않는다.
			}//탈출을 break LABEL에서 LABEL로 돌아감.(반복문 실행 안함)
		}
		System.out.println("라벨로 빠져나옴");
	}
}

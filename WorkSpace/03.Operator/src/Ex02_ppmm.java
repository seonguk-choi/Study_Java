
public class Ex02_ppmm {
	public static void main(String[] args) {
		//증감연산자
		int x = 1;
		int y = 1; //변수 x, y에 각각 값을 주고 초기화
		System.out.println("x++ : " + (x++)); //x 뒤에 ++붙음
		System.out.println("++y : " + (++y)); //y 앞에 붙음
		System.out.println("x-- : " + (x--));
		//++ 앞에 붙은 경우 : 1 증가 시킨 후 출력
		//++ 뒤에 붙은 경우 : 출력 후 1 증가
		x = y++;
		System.out.println("x에 y의 값을 ++시킨 후 담음 : " + x);
		System.out.println("y의 y++ 증감연산이 된 결과 : " + y);
		//x = ++y ; == x = (y+1)
		//x = y++ ; == x = y;
		//y = y + 1;
		
		
	}
}

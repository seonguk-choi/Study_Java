package pack01_if;

public class Ex06_if_esif {
	public static void main(String[] args) {
		//다중 if 문 : 여러개의 조건을 판단하여, 해당 조건을 만족할 경우 실행
		//기존 ex) if(조건식){만족했을때 실행if(조건식){ } }
		//		else {만족하지 못한 경우 실행}
		//다중 if 문
		//if(조건식1) {
		// 조건식 1을 만족하는 경우에 실행부
		//}else if(조건식 2){
		//// 조건식 2을 만족하는 경우에 실행부
		//}else if(조건식 3){
		//
		//}else{
		//  모든 조건식을 만족하지 못한 경우 실행부.
		//} if (else if) ...... else
		int score = 50; //int형 변수 score에 값 87을 주고 초기화
		if(score > 90) { //score는 87이기 때문에 조건식 1을 만족하지 않음 -> 출력X
			System.out.println("A학점");
		}else if(score >= 80) {
			System.out.println("B학점");
		}else if(score > 70) {
			System.out.println("C학점");
		}else {
			System.out.println("70점 미만입니다. F학점");
			//위에 모든 조건식 if와 else if 를 만족하지 못한 경우 출력
		}
		
	}
}


public class Ex06_String {
	public static void main(String[] args) {
		String str1 = "choi" + 6.0; // choi6.0
		String str2 = str1 + "0525"; // choi6.00525
		System.out.println(str1);
		System.out.println(str2);
		//String은 어떤 데이터는 더해도 String이다.
		
		String str3 = "문자열" + 3 + 6; // 문자열36
		String str4 = 3 + 6 + "문자열";	// 9문자열
		System.out.println(str3);
		System.out.println(str4);
	}
}

package pack02_OOP;

public class PrinterMain {
	public static void main(String[] args) {
		//인스턴스화를 절대 하지말것.(static)
		PrinterKYM.println(8.0);
		PrinterKYM.println(3);
		PrinterKYM.println("dd");
		PrinterKYM.println(60.0);
		String[] arr = new String[3];
		PrinterKYM.println(arr);
	}
}

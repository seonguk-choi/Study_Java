package pack05_override_final;

public class AirMain {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = sa.SUPERSONIC;
		sa.fly();//flyMonde == 1 일반모드 flyMode==2 음속모드
		sa.land();
	}
}

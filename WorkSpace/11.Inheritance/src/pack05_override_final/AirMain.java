package pack05_override_final;

public class AirMain {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.tackOff();
		sa.fly();
		sa.flyMode = sa.SUPERSONIC;
		sa.fly();
		sa.flyMode = sa.NORMAL;
		sa.fly();
		sa.flyMode = 0;
		sa.fly();
		sa.land();
	}
}

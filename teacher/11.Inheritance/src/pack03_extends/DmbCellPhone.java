package pack03_extends;

public class DmbCellPhone extends CellPhone {
	//이미 기능이 완성되어있는 1세대(CellPhone)을 이용해서
	//+ 방송을 볼수있는기능을 추가하고 2세대 (DbmCellPhone)을 구현
	int channel;//방송의 채널

	public DmbCellPhone(String model , String color ,int channel) {
		super();
		this.channel = channel;
		//부모클래스에 있는 필드를 가지고와서 사용할수있게함.
		//상속이라는것은 멤버를 전부다 사용하는것
		this.model = model;//CellPhone에 있는 필드
		this.color = color;//CellPhone에 있는 필드
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "을 시청시작(DMB)");
	}
	//setter ↓
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "로 변경 됨");
	}
	void turnOffDmb() {
		System.out.println("채널 " + channel + "을 시청종료(DMB)");
	}
	
	
}

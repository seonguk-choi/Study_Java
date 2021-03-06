package pack02_interface;

public class NewTv implements RemoteController{
	private int volume; //<-외부에서는 바로 필드에 접근이 불가능
	private int channel;
	private String order;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOL) {
			this.volume = MAX_VOL;
		} else if(volume < MIN_VOL) {
			this.volume = MIN_VOL;
		} else if(volume >=MIN_VOL && volume <=MAX_VOL) {
			this.volume = volume;
		}
		System.out.println("TV현재 볼륨 : " + this.volume);
		setTest();
	}
	public int getVolume() {
		return volume;
	}
	public void setTest() {
		System.out.println("테스트 중입니다.");
	}

	@Override
	public void setChannel(int channel) {
		if(channel > MAX_CHA) {
			this.channel = MAX_CHA;
		} else if(channel < MIN_CHA) {
			this.channel = MIN_CHA;
		} else if(channel >=MIN_CHA && channel <= MAX_CHA) {
			this.channel = channel;
		}
		System.out.println("현재 채널 : " + this.channel);
	}

	@Override
	public void setOs(String order) {
		if(order.equals("Siri")){
			this.order = order;
			setOs();
			System.out.println("무엇을 도와드릴까요?");
		} else {
			System.out.println("다시 불러주세요");
		}
	}
	public void setOs() {
		System.out.println("Siri를 작동합니다.");
	}

	@Override
	public void setPlay(String play) {
		if(play.equals("뽀로로")) {
			System.out.println("노는게 제일 좋아. 친구들 모여라");
		} else {
			System.out.println("why so serious?");
		}
	}
}

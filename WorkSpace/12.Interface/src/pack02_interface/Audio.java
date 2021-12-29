package pack02_interface;

//Audio의 리모콘을 개발한다.(설계도를 이용해서)
public class Audio implements RemoteController{
	private int volume; //<-외부에서는 바로 필드에 접근이 불가능
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
		System.out.println("현재 볼륨 : " + this.volume);
	}
	public int getVolume() {
		return volume;
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOs(String order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlay(String play) {
		// TODO Auto-generated method stub
		
	}
}

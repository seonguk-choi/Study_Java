package pack02_Anonymous;

public class Button {
	//background, img, id....
	//button을 클릭했을 때 어떤 처리를 할 것 인지
	public OnClickListner listner;//Button 객체의 필드
	
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	void click() {
		listner.onClick();
	}
	
	//static interface를 중첩. (button객체 안에 interface를 넣는다)
	//interface 라는 것은 메소드 만드는 것을 강제한다(abstracts)
	static interface OnClickListner {
		void onClick(); //OnClickListner라는 애를 사용하기위해서는
						//onClick  이벤트가 반드시 있어야한다.
	}
}

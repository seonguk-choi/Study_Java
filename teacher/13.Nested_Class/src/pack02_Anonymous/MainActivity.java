package pack02_Anonymous;

//어플리케이션이 시작되면 맨처음 시작되는 화면.
public class MainActivity extends AppCompatActivity{
	@Override
	protected void onCreate() {
		//화면을 초기화하는 단계(반드시 있어야한다)
		Button login_btn = new Button();//버튼 객체를 초기화한다.
		Button a = new Button();
		a.setOnclickListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				
			}
		});
		login_btn.setOnclickListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("로그인이 되었습니다.");
			}
		});
	}
}

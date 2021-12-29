package pack03_sendemail;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSend {
	public static void main(String[] args) {
		EmailSend send = new EmailSend();
		//send.sendEmailSimple();
		send.attachMail();
		//send.htmlMail();
		
	}
	
	public void htmlMail() {
		HtmlEmail mail = new HtmlEmail();
		mail.setHostName("smtp.naver.com");
		mail.setCharset("UTF-8");
		mail.setDebug(true);

		mail.setAuthentication("in2thefree", "Su^^2351");
		mail.setSSLOnConnect(true);
		try {

			
			mail.setFrom("in2thefree@naver.com", "최성욱");
			//mail.addTo("youngmoon525@naver.com", "최성욱");
			mail.addTo("in2thefree@naver.com", "최성욱");
			
			mail.setSubject("사진");
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<header>");
			msg.append("<h1>최성욱</h1>");
			msg.append("<h2>hmtl로 보내기<h2/>");
			msg.append("</header>");
			msg.append("<body>");
			msg.append("<section id=\"section1\">");
			msg.append("<figure>");
			msg.append("<img src = \"https://picsum.photos/200/300\" >");
			msg.append("<figcaption>\"증명사진\"</figcaption>");
			msg.append("</figure>");
			msg.append("</section>");
			msg.append("<section id=\"section2\">");
			msg.append("<figure>");
			msg.append("<img src = \"https://picsum.photos/200/300\" >");
			msg.append("<figcaption>\"증명사진\"</figcaption>");
			msg.append("</figure>");
			msg.append("</section>");			
			msg.append("</body>");
			msg.append("</a>");
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg(msg.toString());
			
			//mail.setMsg("사진");
			
			//전송파일 추가
			EmailAttachment file = new EmailAttachment();
			//file.setPath("‪‪C:\\Users\\hanul\\Desktop\\410-200x300.jpg");
			//EmailAttachment라는 객체를 이용해서 여기에 파일패스를 지정해서 파일을 추가함.(EmainAttachment에 추가됨)
			
			//mail.attach(file); //<-이메일 객체에 파일이 추가됨.
			
			file = new EmailAttachment();
			file.setURL(new URL("https://picsum.photos/200/300"));
			
			mail.attach(file);
			
			
			mail.send();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void attachMail() {
		MultiPartEmail mail = new MultiPartEmail();
		mail.setHostName("smtp.naver.com");
		mail.setCharset("UTF-8");
		mail.setDebug(true);

		mail.setAuthentication("in2thefree", "Su^^2351");
		mail.setSSLOnConnect(true);
		try {

			
			mail.setFrom("in2thefree@naver.com", "최성욱");
			mail.addTo("youngmoon525@naver.com", "최성욱");
			mail.addTo("in2thefree@naver.com", "최성욱");
			
			mail.setSubject("사진");
			mail.setMsg("사진");
			
			//전송파일 추가
			EmailAttachment file = new EmailAttachment();
			file.setPath("‪‪‪D:\\df\\410-200x300.jpg");
			//EmailAttachment라는 객체를 이용해서 여기에 파일패스를 지정해서 파일을 추가함.(EmainAttachment에 추가됨)
			
			//mail.attach(file); //<-이메일 객체에 파일이 추가됨.
			
			//file = new EmailAttachment();
			//file.setURL(new URL("https://picsum.photos/200/300"));
			
			mail.attach(file);
			
			
			mail.send();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//글씨만 있는 이메일, 파일첨부가 있는 이메일, html태그가 있는 이메일
	public void sendEmailSimple() {
		SimpleEmail mail = new SimpleEmail();//<-파라메터를 입력받는 생성자 메소드가 없음.
		mail.setHostName("smtp.naver.com");//naver 서버를 통하기 때문에 naver에서 지정하는 SMTP서버를 넣어준다.
		mail.setCharset("UTF-8");
		mail.setDebug(true);//디버깅을 허용. 버그났을 때
		
		//네이버 2차 인증이 걸려있을 경우 SSLConnect
		//mail.setAuthentication("로그인하기 위한 naver id", "naver pw");
		mail.setAuthentication("in2thefree", "Su^^2351");
		mail.setSSLOnConnect(true);
		//이메일 전송을 위한 SimpleEmail 초기화를 완료함
		try {
			//메일을 보내는 사람 <- 자신의 이메일
			//메일을 받는 사람 <- 받는 사람의 이메일
			//메일의 제목, 메일의 내용
			//mail.setFrom("나의 이메일", "상대방 이메일에 표시 될 이름"); //메일 송신인 지정
			//mail.addTo("받는 사람 이메일", "송신인 이메일에 표시 될 이름"); //메일 송신인 지정
			
			//mail.setSubject("회원가입 축하 메세지");
			//mail.setMsg("실제 내용부 하고 싶은말");
			
			mail.setFrom("in2thefree@naver.com", "최성욱"); //메일 송신인 지정
			mail.addTo("youngmoon525@naver.com", "최성욱");
			mail.addTo("in2thefree@naver.com", "최성욱");
			
			mail.setSubject("감사합니다.");
			mail.setMsg("곧 협곡에서 뵙겠습니다.");
			
			mail.send();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

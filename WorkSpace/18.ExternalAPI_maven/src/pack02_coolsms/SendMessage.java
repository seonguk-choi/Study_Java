package pack02_coolsms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SendMessage {
	public static void main(String[] args) {
		//API_KEY를 final 상수로 쓰는 이유는 중간에 API키를 수정 못하게 하기 위함
		//final String api_key = "발급받은 api_key를 넣으세요.";
		//final String api_secret = "발급받은 api_secret를 넣으세요.";
		final String api_key = "NCSEN8NVEUEDE0BP";
		final String api_secret = "CALHB9OD8Y87OXJZJZSML07H6SAR56UJ";
		Message coolsms = new Message(api_key, api_secret);
		
		//문자를 보내기위해서는 CoolSMS서버를 이용한다.
		//CoolSMS 서버에서 요구하는 param를 보내주기만 하면
		//문자 전송은 알아서함. (HashMap) <- 중복된 값을 넣을 수 없음.
		//params.put("to", "받는 번호");
		//params.put("from", "보내는 번호");
		//params.put("type", "SMS");
		//params.put("text", "문자내용 입력.");
		//params.put("app_version", "JAVA SDK v1.2");
		HashMap<String, String> params = new HashMap<>();
		params.put("to", "01038652153");
		params.put("from", "01038652153");
		params.put("type", "SMS");//type (SMS, LMS, MMS, AT)
		params.put("text", "문자테스트 중입니다.");
		params.put("app_version", "JAVA SDK v1.2");//APP NAME <- CoolSMS
		
		try {
			JSONObject obj = coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}
}

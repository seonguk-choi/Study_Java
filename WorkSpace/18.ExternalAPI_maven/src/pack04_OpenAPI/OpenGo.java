package pack04_OpenAPI;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class OpenGo {
	public static void main(String[] args) {
		//1.Url 인터넷 주소.
		//2.Url을 호출 할 때 넘겨줘야할 값들이 필요
		//https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816
		//? 기준으로 앞은 주소 뒤는 파라메타
		//?page=1
		//&perPage=10	    
		//&serviceKey=y0zHbCZwKcAvgWWOaARY373ZDbZjz60OF6Zw5hqLbPRWR%2FWa7aCIxR32Y3qpYuTYoQdAIa%2FeQXH6eEdLPGXAXg%3D%3D
		// ↓ 이거 오류나는 이유 decoding key로 받았는데 주소창에는 incoding key로 나와있기 때문에 
		//다시 decoding key를 입력해야된다.
		//3.Json형태로 받아서 사용하기.
		//Json은 Key와 Value 가 중괄호 블럭으로 { , } 안에서 표현이 되고, 대괄호 [ , ]
		//는 하나의 리스트라고 생각하면 된다.
		//{} <- Object(String, int) [] <- Array
		String url = "https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816";
						  
		//javacode에서 html주소로 request 응답을 받기위한 처리 ↓
		try {			  	
			String doc = Jsoup.connect(url).data("page", "1").data("perpage", "10")
					     .data("serviceKey","y0zHbCZwKcAvgWWOaARY373ZDbZjz60OF6Zw5hqLbPRWR/Wa7aCIxR32Y3qpYuTYoQdAIa/eQXH6eEdLPGXAXg==")
					     .timeout(4000).userAgent("chrome").ignoreContentType(true)
					     .execute().body();
		    System.out.println(doc);
		    JSONParser jsonparser = new JSONParser();
		    try {
				JSONObject jsonObj = (JSONObject) jsonparser.parse(doc);
				System.out.println(jsonObj.get("currentCount"));
				JSONArray jarr = (JSONArray) jsonObj.get("data");
				//String[] arr = new String[3]
			    ArrayList<GoDTO> list = new ArrayList<>();
				for (int i = 0; i < jarr.size(); i++) {
					JSONObject obj = (JSONObject) jarr.get(i);
					GoDTO dto = new GoDTO(obj.get("상 호")+""
										, obj.get("소재지")+""
										, obj.get("연락처")+""
										, Integer.parseInt(obj.get("연번")+"")
										, obj.get("주메뉴")+"");
					list.add(dto);
//					list.add(new GoDTO(obj.get("상 호")+""
//							, obj.get("소재지")+""
//							, obj.get("연락처")+""
//							, Integer.parseInt(obj.get("연번")+"")
//							, obj.get("주메뉴")+""));
				}
				for(GoDTO dtos : list) {
					System.out.println(dtos.getMutual() + " " + dtos.getAdrr() + " " + dtos.getTel() + " " + dtos.getNum() + " " + dtos.getMenu());
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

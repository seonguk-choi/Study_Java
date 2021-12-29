package pack02_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex02_HashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 30);
		map.put("임꺽정", 40);
		System.out.println(map.get("홍길동"));
		//↑ 여기까지가 중요 밑에서부턴 알아두기만 함.
		map.put("성춘향", 50);
		map.put("이몽룡", 60);
		map.put("이몽룡", 60);
		//1.맵의 지금 현재 데이터 담은 크기(총크기는 몇일까?)
		//2.맵에 있는 데이터를 어떻게 가져올 수 있을까?
		System.out.println(map.size());
		System.out.println(map.get("홍길동"));
		map.remove("이몽룡");
		//Map자체는 여러건의 데이터를 담는 용도가 아니다.
		//Employees = employee_id (10, 20, 30)
		Set<String> keySet = map.keySet(); // 맵에서 key만 set으로 뺌
		Iterator<String> keyIterator = keySet.iterator();//index 오류가 절대 없다.
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key " + key + " value " + value);
		}
		//객체를 하나씩 처리하는 방법(안중요함)
		Set<Map.Entry<String, Integer>> etrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = etrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = map.get(key);
			System.out.println("key " + key + " value " + value);
		}
	}
}

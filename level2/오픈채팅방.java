import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public String[] solution(String[] record) {
		HashMap<String, String> userMap = new HashMap<String, String> ();
		StringBuilder sb;
		StringTokenizer st;
		String[] answer;
		String[] uids = new String[record.length];
		String order, uid, uname;
		int idx = 0;
		boolean[] orders = new boolean[record.length];
		
		for(int i = 0; i < record.length; i++) {
			st = new StringTokenizer(record[i]);
			
			order = st.nextToken();
			uid = st.nextToken();
			
			switch(order.charAt(0)) {
			case 'E':
				uname = st.nextToken();
				uids[idx] = uid;
				orders[idx++] = true;
				userMap.put(uid, uname);
				break;
			case 'L':
				uids[idx] = uid;
				orders[idx++] = false;
				break;
			case 'C':
				uname = st.nextToken();
				userMap.put(uid, uname);
				break;
			}
		}
		
		answer = new String[idx];
		
		for(int i = 0; i < idx; i++) {
			sb = new StringBuilder();
			sb.append(userMap.get(uids[i]));
			sb.append("님이 ");
			
			if(orders[i])
				sb.append("들어왔습니다.");
			else
				sb.append("나갔습니다.");
			
			answer[i] = sb.toString();
		}
		
		return answer;
	}
}
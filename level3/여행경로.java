import java.util.*;

class Solution {
	static ArrayList<ArrayList<Integer>> linkList;
	static String[] airports;

	public void setAirports(String[][] tickets) {
		ArrayList<String> tmp = new ArrayList<>();
		int size = 0;

		for (int i = 0; i < tickets.length; i++) {
			boolean isThere = false;

			for (int j = 0; j < size; j++) {
                if (tickets[i][0].compareTo(tmp.get(j)) == 0) {
                    isThere = true;
                    break;
                }
            }

			if (!isThere) {
				tmp.add(tickets[i][0]);
				size++;
			}

			isThere = false;

			for (int j = 0; j < size; j++) {
                if (tickets[i][1].compareTo(tmp.get(j)) == 0) {
                    isThere = true;
                    break;
                }
            }

			if (!isThere) {
				tmp.add(tickets[i][1]);
				size++;
			}
		}

		Collections.sort(tmp);

		airports = new String[size];

		for (int i = 0; i < size; i++)
			airports[i] = tmp.get(i);
	}

	public void setLinkList(String[][] tickets) {
		linkList = new ArrayList<>();

		for (int i = 0; i < airports.length; i++)
			linkList.add(new ArrayList<Integer>());

		for (int i = 0; i < tickets.length; i++) {
			int from = getIdx(tickets[i][0]);
			int to = getIdx(tickets[i][1]);

			linkList.get(from).add(to);
		}
	}

	public int getIdx(String airport) {
		int ret = -1;

		for (int i = 0; i < airports.length; i++)
			if (airports[i].compareTo(airport) == 0)
				return i;

		return ret;
	}

	public void getRoutes(int now, int cnt, int log[], ArrayList<int[]> routes) {
		if (cnt == log.length) {
			int tmp[] = new int[log.length];

			for (int i = 0; i < log.length; i++)
				tmp[i] = log[i];

			routes.add(tmp);
			return;
		}

		int len = linkList.get(now).size();

		for (int i = 0; i < len; i++) {
			if (0 <= linkList.get(now).get(i)) {
				int to = linkList.get(now).get(i);
				linkList.get(now).set(i, -1);
				log[cnt] = to;
				getRoutes(to, cnt + 1, log, routes);
				linkList.get(now).set(i, to);
			}
		}
	}

	public String[] solution(String[][] tickets) {
		String[] answer = {};

		setAirports(tickets);
		setLinkList(tickets);

		ArrayList<int[]> routes = new ArrayList<>();
		int log[] = new int[tickets.length + 1];
        int start = getIdx("ICN");
		log[0] = start;

		getRoutes(start, 1, log, routes);

		Collections.sort(routes, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {

				for (int i = 0; i < tickets.length; i++) {
					if (o1[i] < o2[i]) {
						return -1;
					} else if (o2[i] < o1[i]) {
						return 1;
					}
				}

				return -1;
			}
		});
		
		answer = new String[tickets.length + 1];
		
		for(int i = 0; i < tickets.length + 1; i++) {
			answer[i] = airports[routes.get(0)[i]];
		}

		return answer;
	}
}
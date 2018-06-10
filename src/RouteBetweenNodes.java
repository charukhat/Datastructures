import java.util.*;

public class RouteBetweenNodes {
		public static void main(String[] args){
			HashMap<String, ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
			addEdge(map,"a","b");
			addEdge(map,"a","c");
			addEdge(map,"b","d");
			addEdge(map,"b","e");
			addEdge(map,"d","e");
			addEdge(map,"e","f");
			System.out.println(map);
			boolean route = checkRoute(map,"a","f");
			System.out.println(route);
		}
		
		public static void addEdge(HashMap<String, ArrayList<String>> map, String source, String destination){
			if(map.containsKey(source)){
				ArrayList<String> list = map.get(source);
				list.add(destination);
			}
			else
			{
				ArrayList<String> destList = new ArrayList<String>();
				destList.add(destination);
				map.put(source, destList);
			}
		}
		static boolean checkRoute(HashMap<String, ArrayList<String>> map, String source,String destination){
			if(map.containsKey(source))
			{
				ArrayList<String> pathList = map.get(source);
				if(pathList.contains(destination)){
					return true;
				}
				else{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		
}

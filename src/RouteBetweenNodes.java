import java.util.*;

public class RouteBetweenNodes {
		public static void main(String[] args){
			HashMap<String, ArrayList<String>> map = new HashMap<>();
            HashMap<String,Boolean> visit = new HashMap<>();
			addEdge(map,"a","b",visit);
			addEdge(map,"a","c",visit);
			addEdge(map,"b","d",visit);
			addEdge(map,"b","e",visit);
			addEdge(map,"d","e",visit);
			addEdge(map,"e","f",visit);
			System.out.println(map);

			checkRoute(map,visit,"a","f");

		}
		
		public static void addEdge(HashMap<String, ArrayList<String>> map, String source, String destination, HashMap<String,Boolean>  visit){
            visit.put(source,false);
            visit.put(destination,false);
			if(map.containsKey(source)){
				ArrayList<String> list = map.get(source);
				list.add(destination);
			}
			else
			{
				ArrayList<String> destList = new ArrayList<>();
				destList.add(destination);
				map.put(source, destList);
			}
		}
		static void checkRoute(HashMap<String, ArrayList<String>> map,HashMap<String,Boolean> visit, String source,String destination){
			boolean flag=false;
			if (map.containsKey(source) && flag==false && !visit.get(source))
			{

				ArrayList<String> pathList = map.get(source);
				for(String dest : pathList){

				    System.out.println("Destination "+dest);
					if(dest == destination && visit.get(dest)==false){
                        visit.put(dest,true);
					    System.out.println("Route exists");
                        break;
                    }
                    else{
					    checkRoute(map,visit,dest,destination);
					}

				}
			}

		}
		
		
}

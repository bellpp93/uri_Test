
public class UriPathTest {

	public static void main(String[] args) {
		// String url = "http://localhost:8080/220405_Model2_Board/login.do";
		String uri = "/220405_Model2_Board/login.do";
		
		int lastPosition = uri.lastIndexOf("/");
		// System.out.println(lastPosition);  // 41 출력
		// System.out.println(lastPosition);  // 20 출력
		
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);  // "/login.do" 출력됨!!
	}
}

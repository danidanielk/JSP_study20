import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class M {
	public static void makeSecondData(HttpServletRequest req, HttpServletResponse res) {
		int c = 3000;
		req.setAttribute("cc", c);
		
		int d = 40000;
		HttpSession hs = req.getSession();
		hs.setMaxInactiveInterval(15);
		hs.setAttribute("d", d);
		
		String e = "500000";
		Cookie ck = new Cookie("e",e);
		ck.setMaxAge(15);
		res.addCookie(ck);
		
	
		
	}
	public static void printSecondDataNew(HttpServletRequest req) {
		
		try {
			HttpSession hs = req.getSession();
			int d= (Integer) hs.getAttribute("d");
			System.out.println(d);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Cookie[] cks=req.getCookies();
		for(Cookie ck:cks) {
			if(ck.getName().equals("e")) {
				System.out.println(ck.getValue());
			}
		}
		
	}
	public static void printSecondData(HttpServletRequest req) {
		
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		int c=  (Integer) req.getAttribute("cc");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}

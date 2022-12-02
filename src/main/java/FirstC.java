

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//jsp 환경에서 상황 판단을 해야하는데 이게
//get방식 인지 post 인지 확인하기위에서는 서블릿이 적합
// 		계산,기능적인면 을 해야하면 M(model)으로
//		뭔가를 보여줘야한다면 V(view)로
//		흐름제어
//아래 어노테이션 webservlet("FirstC")는 이 파일을 톰캣에 등록하겠다는뜻
//이 프로젝트에는 main 메소드가 없음 톰캣이 실행하면서 main은 톰캣내부에있어서 알아서 FirstC 객체를 만들어내고 돌림
//그래서 이 프로젝트가 처음시작할때ㅔ 이 생성자에 의해 객체가 생성이되고 기본생성자라 없어도 되기는하는데 


@WebServlet("/FirstC")
public class FirstC extends HttpServlet {
	public FirstC() {
		super();
		//처음 실행했을 때 사과 데이터 총 개수를 받아오기 위해 사용했음.
	}
	
	
	//여기서 웹사이트의 페이지 전환이 일어난다. 일반적인흐름으로는 C로 요청 -> M에가서 작업 -> 결과를V로 포워딩해서 활용
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//사이트에 처음들어오면
	//FirstC에 요청파라미터 하나도없이GET 방식으로 요청을 하면,
	//firstV.jsp로 지금 일어난 요청을 제보해주는 객체
		if(!request.getParameterNames().hasMoreElements()) {
			RequestDispatcher rd= request.getRequestDispatcher("firstV.jsp");
		rd.forward(request, response);//firstV를 포워딩을 하게된다.
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

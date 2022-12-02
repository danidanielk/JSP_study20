

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//jsp ȯ�濡�� ��Ȳ �Ǵ��� �ؾ��ϴµ� �̰�
//get��� ���� post ���� Ȯ���ϱ��������� ������ ����
// 		���,������θ� �� �ؾ��ϸ� M(model)����
//		������ ��������Ѵٸ� V(view)��
//		�帧����
//�Ʒ� ������̼� webservlet("FirstC")�� �� ������ ��Ĺ�� ����ϰڴٴ¶�
//�� ������Ʈ���� main �޼ҵ尡 ���� ��Ĺ�� �����ϸ鼭 main�� ��Ĺ���ο��־ �˾Ƽ� FirstC ��ü�� ������ ����
//�׷��� �� ������Ʈ�� ó�������Ҷ��� �� �����ڿ� ���� ��ü�� �����̵ǰ� �⺻�����ڶ� ��� �Ǳ���ϴµ� 


@WebServlet("/FirstC")
public class FirstC extends HttpServlet {
	public FirstC() {
		super();
		//ó�� �������� �� ��� ������ �� ������ �޾ƿ��� ���� �������.
	}
	
	
	//���⼭ ������Ʈ�� ������ ��ȯ�� �Ͼ��. �Ϲ������帧���δ� C�� ��û -> M������ �۾� -> �����V�� �������ؼ� Ȱ��
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//����Ʈ�� ó��������
	//FirstC�� ��û�Ķ���� �ϳ�������GET ������� ��û�� �ϸ�,
	//firstV.jsp�� ���� �Ͼ ��û�� �������ִ� ��ü
		if(!request.getParameterNames().hasMoreElements()) {
			RequestDispatcher rd= request.getRequestDispatcher("firstV.jsp");
		rd.forward(request, response);//firstV�� �������� �ϰԵȴ�.
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

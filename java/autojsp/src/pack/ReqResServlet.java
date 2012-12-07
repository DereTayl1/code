package pack;

import java.io.*;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqResServlet
 */
public class ReqResServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReqResServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("gb2312");
		response.setContentType("text/html;charset=gb2312");
		
		PrintWriter out = response.getWriter();
		out.println("<h3><br>�ͻ�ʹ�õ�Э����:");
		out.println("request.getProtocol()");
		out.println("<br>�ͻ��ύ��Ϣ�ķ�ʽ��");
		out.println(request.getMethod());
		out.println("<br>��ȡHTTPͷ�ļ���Host��ֵ��");
		out.println(request.getHeader("Host"));
		out.println("<br>��ȡ�ͻ��������ƣ�");
		out.println(request.getRemoteHost()); 
		out.println("<br>��ȡ�ͻ���IP��ַ��");
		out.println(request.getRemoteAddr());
		out.println("<br>��ȡ�����������ƣ�");
		out.println(request.getServerName());
		out.println("<br>��ȡ�������Ķ˿ںţ�");
		out.println(request.getServerPort()); 
		out.println("</h3>"); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}

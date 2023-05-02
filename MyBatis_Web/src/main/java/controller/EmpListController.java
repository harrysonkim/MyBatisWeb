package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Emp;
import service.face.EmpService;
import service.impl.EmpServiceImpl;

@WebServlet("/emp/list")
public class EmpListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpService empService = new EmpServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/emp/list [GET]");
		
		List<Emp> emplist = empService.getList();
		
//		for( Emp e : emplist) System.out.println(e);
		
		request.setAttribute("emplist", emplist);
		
		request.getRequestDispatcher("/WEB-INF/views/emp/list.jsp").forward(request, response);
	
	}


}

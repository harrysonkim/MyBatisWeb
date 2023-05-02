package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;

import dao.face.MapUnderscoreDao;
import dto.Underscore;
import mybatis.MyBatisConnectionFactory;

@WebServlet("/main/underscore")
public class MapUnderScore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSeesionFactory();
	private MapUnderscoreDao mapUnderscoreDao;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/map/underscore [GET]");
		
		mapUnderscoreDao = sqlSessionFactory.openSession().getMapper(MapUnderscoreDao.class);

		List<Underscore> list = mapUnderscoreDao.selectAll();
		
		for( Underscore u : list ) {
			System.out.println(u);
		}
		
		
	}


}

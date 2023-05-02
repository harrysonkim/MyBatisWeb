package service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dao.face.EmpDao;
import dto.Emp;
import mybatis.MyBatisConnectionFactory;
import service.face.EmpService;

public class EmpServiceImpl implements EmpService {

	private SqlSessionFactory factory = MyBatisConnectionFactory.getSqlSeesionFactory();
	
	private EmpDao empDao;
	
	@Override
	public List<Emp> getList() {

		// 마이바티스 수행 객체
		SqlSession sqlSession = factory.openSession();

		// 매퍼를 이용한 DAO객체 연결
		empDao = sqlSession.getMapper(EmpDao.class);
		
		// 전체리스트 조회
		List<Emp> emplist = empDao.selectAll();
		
		sqlSession.close();
		
		return emplist;
	}

	@Override
	public Emp getEmp(HttpServletRequest request) {
		
		SqlSession sqlSession = factory.openSession();

		empDao = sqlSession.getMapper(EmpDao.class);

		int empno = Integer.parseInt(request.getParameter("empno"));
		
		Emp emp = empDao.selectByEmpno(empno);
		System.out.println("조회된 사원 : " + emp);

		sqlSession.close();
		
		return emp;
	}

}

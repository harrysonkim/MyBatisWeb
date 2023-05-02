package service.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dto.Emp;

public interface EmpService {

	/**
	 * 전체 사원 정보를 조회
	 * 
	 * @return 조회된 사원 목록
	 */
	public List<Emp> getList();

	public Emp getEmp(HttpServletRequest request);
	
	
}

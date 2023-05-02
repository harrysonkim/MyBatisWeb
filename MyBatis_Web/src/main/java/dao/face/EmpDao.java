package dao.face;

import java.util.List;

import dto.Emp;

public interface EmpDao {
	
	/**
	 * 전체 조회하기
	 * 
	 * @return 조회된 전체 사원 목록
	 */
	public List<Emp> selectAll();

	public Emp selectByEmpno(int empno);
	
}

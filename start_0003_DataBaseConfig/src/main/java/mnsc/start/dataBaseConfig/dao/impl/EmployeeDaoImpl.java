package mnsc.start.databaseconfig.dao.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mnsc.start.databaseconfig.dao.EmployeeDao;
import mnsc.start.databaseconfig.dto.EmployeeDto;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SqlSession sqlSession;

	String nameSpace = "Employee.";

	@Override
	public List<EmployeeDto> getAllEmployee() {
		List<EmployeeDto> list = sqlSession.selectList(nameSpace + "allEmployee");
		return list;
	}

}

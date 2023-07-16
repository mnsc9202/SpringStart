package mnsc.start.dataBaseConfig.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mnsc.start.dataBaseConfig.dao.EmployeeDao;
import mnsc.start.dataBaseConfig.dto.EmployeeDto;
import mnsc.start.dataBaseConfig.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	
}

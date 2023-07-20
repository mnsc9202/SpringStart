package mnsc.start.databaseconfig.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mnsc.start.databaseconfig.dao.EmployeeDao;
import mnsc.start.databaseconfig.dto.EmployeeDto;
import mnsc.start.databaseconfig.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	
}

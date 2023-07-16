package mnsc.start.dataBaseConfig.dao;

import java.util.List;
import mnsc.start.dataBaseConfig.dto.EmployeeDto;

public interface EmployeeDao {
	List<EmployeeDto> getAllEmployee();
}

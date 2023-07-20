package mnsc.start.databaseconfig.dao;

import java.util.List;
import mnsc.start.databaseconfig.dto.EmployeeDto;

public interface EmployeeDao {
	List<EmployeeDto> getAllEmployee();
}

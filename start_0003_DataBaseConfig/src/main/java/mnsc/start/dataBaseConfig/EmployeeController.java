package mnsc.start.dataBaseConfig;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import mnsc.start.dataBaseConfig.dto.EmployeeDto;
import mnsc.start.dataBaseConfig.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "employee.do", method = RequestMethod.GET)
	public String getEmployees(Model model) {
		
		List<EmployeeDto> list = employeeService.getAllEmployee();
		model.addAttribute("employeeList", list);
		
		return "employeeList";
	}
}
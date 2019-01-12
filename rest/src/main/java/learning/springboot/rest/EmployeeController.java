package learning.springboot.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private static Map<UUID, Employee> myEmployeeMap = new HashMap<>();

	/*static {
		myEmployeeMap.put(UUID.randomUUID(), new Employee("1001", "John", 3453));
		myEmployeeMap.put(1002, new Employee("1002", "Peter", 4453));
		myEmployeeMap.put(1003, new Employee("1003", "Thomas", 5453));

	} */

	@RequestMapping(value = "/employees/{employeeId}", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	public Employee getEmployee(@PathVariable UUID employeeId) {
		return myEmployeeMap.get(employeeId);

	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	public List<Employee> listAll() {
		return myEmployeeMap.values().stream().collect(Collectors.toList());

	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST, produces = { "application/json",
			"application/xml" }, consumes = { "application/json", "application/xml" })
	public Employee createEmployee(@RequestBody Employee employee) {

		/*Integer maxValue = myEmployeeMap.keySet().stream().max(Comparator.naturalOrder()).get();

		Employee newEmployee = new Employee(String.valueOf(maxValue + 1), employee.getName(), employee.getSalary());

		myEmployeeMap.put(maxValue + 1, newEmployee);*/
		
		UUID newUUID = UUID.randomUUID();
		
		Employee newEmployee = new Employee(newUUID, employee.getName(), employee.getSalary());
		myEmployeeMap.put(newUUID, newEmployee);
		
		return newEmployee;

	}

}

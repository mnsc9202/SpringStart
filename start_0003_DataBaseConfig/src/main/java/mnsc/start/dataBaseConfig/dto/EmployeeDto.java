package mnsc.start.dataBaseConfig.dto;

public class EmployeeDto {

	/** 이름 */
	private String firstName;
	/** 성 */
	private String lastName;
	/** 직업 */
	private String jobId;
	/** 급여 */
	private int salary;

	public EmployeeDto() {
	}

	public EmployeeDto(String firstName, String lastName, String jobId, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobId = jobId;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDto [firstName=" + firstName + ", lastName=" + lastName + ", jobId=" + jobId + ", salary="
				+ salary + "]";
	}

}

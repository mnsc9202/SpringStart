package mnsc.start.useMethod.dto;

public class PersonSaveRequestDto {

	/** 이름 */
	private String name;
	
	/** 나이 */
	private Integer age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
}

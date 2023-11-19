package mnsc.start.useMethod.dto;

public class PersonSaveTemplateRequestDto {
	
	/** 번호 */
	private Integer seq;
	
	/** 이름 */
	private String name;
	
	/** 나이 */
	private Integer age;

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSeq() {
		return seq;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "PersonSaveTemplateRequestDto [seq=" + seq + ", name=" + name + ", age=" + age + "]";
	}
}

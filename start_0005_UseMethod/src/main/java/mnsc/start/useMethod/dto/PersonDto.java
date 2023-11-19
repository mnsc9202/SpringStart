package mnsc.start.useMethod.dto;

public class PersonDto {
	
	/** 번호 */
	private Integer seq;
	
	/** 이름 */
	private String name;
	
	/** 나이 */
	private Integer age;

	public PersonDto() {
	}

	public PersonDto(Integer seq, String name, Integer age) {
		super();
		this.seq = seq;
		this.name = name;
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
}

package mnsc.start.useMethod.dto;

public class PersonUpdateRequestDto {

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
}

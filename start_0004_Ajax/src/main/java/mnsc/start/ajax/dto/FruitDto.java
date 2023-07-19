package mnsc.start.ajax.dto;

public class FruitDto {
	/** 과일이름(국문) */
	private String korName;

	/** 과일이름(영문) */
	private String engName;

	/** 과일색상 */
	private String color;

	public FruitDto(String korName, String engName, String color) {
		super();
		this.korName = korName;
		this.engName = engName;
		this.color = color;
	}

	public String getKorName() {
		return korName;
	}

	public String getEngName() {
		return engName;
	}

	public String getColor() {
		return color;
	}

}

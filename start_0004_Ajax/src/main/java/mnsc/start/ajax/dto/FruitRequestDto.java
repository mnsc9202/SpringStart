package mnsc.start.ajax.dto;

public class FruitRequestDto {
	/** 과일이름을 나타낼 언어 */
	private String language;
	
	/** 과일색상 */
	private String color;

	public FruitRequestDto(String language, String color) {
		super();
		this.language = language;
		this.color = color;
	}

	public String getLanguage() {
		return language;
	}

	public String getColor() {
		return color;
	}
}

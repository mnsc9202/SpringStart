package mnsc.start.ajax.dto;

public class FruitResponseDto {
	/** 과일이름을 나타낼 언어 */
	private String language;
	
	/** 과일이름 */
	private String fruitName;
	
	/** 과일색상 */
	private String color;

	public FruitResponseDto(String language, String fruitName, String color) {
		super();
		this.language = language;
		this.fruitName = fruitName;
		this.color = color;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

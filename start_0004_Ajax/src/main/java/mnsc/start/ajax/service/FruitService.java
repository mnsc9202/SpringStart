package mnsc.start.ajax.service;

import java.util.List;
import mnsc.start.ajax.dto.FruitRequestDto;
import mnsc.start.ajax.dto.FruitResponseDto;


public interface FruitService {
	public List<FruitResponseDto> getFruitList(FruitRequestDto requestDto);
	public String getFruitName(String language, String name);
}

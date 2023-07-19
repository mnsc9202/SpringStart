package mnsc.start.ajax;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import mnsc.start.ajax.dto.FruitRequestDto;
import mnsc.start.ajax.dto.FruitResponseDto;
import mnsc.start.ajax.service.FruitService;


@Controller
public class FruitController {

	/**
	 * 과일 service
	 */
	@Autowired
	FruitService fruitService;

	
	/**
	 * 과일 목록가져오기
	 * @param requestDto 요청dto
	 * @return List<FruitResponseDto> 응답dto
	 */
	@ResponseBody
	@RequestMapping(value = "getFruitList.do", method = RequestMethod.GET)
	public List<FruitResponseDto> getFruitList(FruitRequestDto requestDto) {
		return fruitService.getFruitList(requestDto);
	}
	
	/**
	 * 과일이름 언어 변경하기
	 * @param language 현재언어
	 * @param name 과일이름
	 * @return String 현재언어와 반대언어의 과일이름
	 */
	@ResponseBody
	@RequestMapping(value = "getFruitName.do", method = RequestMethod.GET,
			produces = "application/String; charset=UTF-8") /* String 한글 처리 */
	public String getFruitName(String language, String name) {
		return fruitService.getFruitName(language, name);
	}
}

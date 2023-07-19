package mnsc.start.ajax.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import mnsc.start.ajax.dto.FruitDto;
import mnsc.start.ajax.dto.FruitRequestDto;
import mnsc.start.ajax.dto.FruitResponseDto;
import mnsc.start.ajax.service.FruitService;

@Service
public class FruitServiceImpl implements FruitService {
	
	/** 
	 * 과일목록
	 * DB연결이 없으므로 데이터 셋팅을 위함*/
	List<FruitDto> fruitList = null;

	/** 과일목록 초기화*/
	public void initFruitList() {
		if (fruitList == null) {
			fruitList = new ArrayList<>();
			fruitList.add(new FruitDto("사과", "apple", "red"));
			fruitList.add(new FruitDto("포도", "grape", "purple"));
			fruitList.add(new FruitDto("배", "pear", "lightBrown"));
			fruitList.add(new FruitDto("복숭아", "peach", "red"));
			fruitList.add(new FruitDto("딸기", "strawberry", "red"));
		}
	}

	@Override
	public List<FruitResponseDto> getFruitList(FruitRequestDto requestDto) {
		// 과일목록 생성
		initFruitList();

		// 반환할 과일목록
		List<FruitResponseDto> arrangeFruitList = new ArrayList<>();

		// 요청사항 (언어, 색상)
		String language = requestDto.getLanguage();
		String color = requestDto.getColor();

		// 과일목록에서 요청사항에 맞는 과일 찾기
		for (FruitDto fruitDto : fruitList) {
			if (fruitDto.getColor().equals(color)) {
				if (language.equals("kor")) {
					arrangeFruitList.add(new FruitResponseDto(language, fruitDto.getKorName(), color));
				} else {
					arrangeFruitList.add(new FruitResponseDto(language, fruitDto.getEngName(), color));
				}
			}
		}
		return arrangeFruitList;
	}

	@Override
	public String getFruitName(String language, String name) {
		// 반환할 과일이름
		String fruitName = "";
		
		// 과일목록에서 언어와 반대되는 과일이름 찾기
		for (FruitDto fruitDto : fruitList) {
			if (language.equals("kor")) {
				if (fruitDto.getKorName().equals(name)) {
					fruitName = fruitDto.getEngName();
				}
			} else {
				if (fruitDto.getEngName().equals(name)) {
					fruitName = fruitDto.getKorName();
				}
			}
		}		
		return fruitName;
	}
}

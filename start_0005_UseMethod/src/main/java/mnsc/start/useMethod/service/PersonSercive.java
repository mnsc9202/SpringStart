package mnsc.start.useMethod.service;

import java.util.List;
import mnsc.start.useMethod.dto.PersonDto;
import mnsc.start.useMethod.dto.PersonSaveRequestDto;
import mnsc.start.useMethod.dto.PersonSaveTemplateRequestDto;
import mnsc.start.useMethod.dto.PersonUpdateRequestDto;

public interface PersonSercive {
	
	
	
	/**
	 * person 단건 조회
	 * 
	 * @param name 이름
	 * @return PersonDto personDTO
	 */
	PersonDto findPerson(String name);

	/**
	 * person 목록 조회
	 * 
	 * @return List<PersonDto> person DTO
	 */
	List<PersonDto> findAllPerson();
	
	/**
	 * person 등록
	 * 
	 * @param requestDto person 저장요청 DTO
	 * @return Integer 저장 개수
	 */
	Integer savePerson(PersonSaveRequestDto requestDto);
	
	
	/**
	 * person 등록 (템플릿)
	 * 
	 * @param requestDto person 템플릿 저장요청 DTO
	 * @return Integer 저장 개수
	 */
	Integer savePersonTemplate(PersonSaveTemplateRequestDto requestDto);
	
	/**
	 * person 수정
	 * 
	 * @param requestDto person 수정요청 DTO
	 * @return Integer 수정 개수
	 */
	Integer updatePerson(PersonUpdateRequestDto requestDto);
	
	/**
	 * person 삭제
	 * 
	 * @param seq 번호
	 * @return Integer 삭제 개수
	 */
	Integer deletePerson(Integer seq);
}

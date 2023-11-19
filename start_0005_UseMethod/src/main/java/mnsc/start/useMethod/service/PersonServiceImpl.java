package mnsc.start.useMethod.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mnsc.start.useMethod.dao.PersonDao;
import mnsc.start.useMethod.dto.PersonDto;
import mnsc.start.useMethod.dto.PersonSaveRequestDto;
import mnsc.start.useMethod.dto.PersonSaveTemplateRequestDto;
import mnsc.start.useMethod.dto.PersonUpdateRequestDto;

@Service
public class PersonServiceImpl implements PersonSercive{

	/** person 데이터 접근객체 */
	@Autowired
	PersonDao personDao;
	
	// person 단건 조회
	@Override
	public PersonDto findPerson(String name) {
		return personDao.findPerson(name);
	}

	// person 목록 조회
	@Override
	public List<PersonDto> findAllPerson() {
		return personDao.findAllPerson();
	}

	// person 등록
	@Override
	public Integer savePerson(PersonSaveRequestDto requestDto) {
		return personDao.savePerson(requestDto);
	}
	
	// person 등록 (템플릿)
	@Override
	public Integer savePersonTemplate(PersonSaveTemplateRequestDto requestDto) {
		return personDao.savePersonTemplate(requestDto);
	}

	// person 수정
	@Override
	public Integer updatePerson(PersonUpdateRequestDto requestDto) {
		return personDao.updatePerson(requestDto);
	}

	// person 삭제
	@Override
	public Integer deletePerson(Integer seq) {
		return personDao.deletePerson(seq);
	}
}

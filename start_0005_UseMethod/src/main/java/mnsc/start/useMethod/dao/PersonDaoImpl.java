package mnsc.start.useMethod.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mnsc.start.useMethod.dto.PersonDto;
import mnsc.start.useMethod.dto.PersonSaveRequestDto;
import mnsc.start.useMethod.dto.PersonSaveTemplateRequestDto;
import mnsc.start.useMethod.dto.PersonUpdateRequestDto;

@Repository
public class PersonDaoImpl implements PersonDao{

	/** sql 세션 */
	@Autowired
	SqlSession sqlSession;
	
	String nameSpace = "Person.";
	
	// person 단건 조회
	@Override
	public PersonDto findPerson(String name) {
		return sqlSession.selectOne(nameSpace + "findPerson", name);
	}

	// person 목록 조회
	@Override
	public List<PersonDto> findAllPerson() {
		return sqlSession.selectList(nameSpace + "findAllPerson");
	}

	// person 등록
	@Override
	public Integer savePerson(PersonSaveRequestDto requestDto) {
		// 등록 정보 설정
		Map<String, Object> request = new HashMap<>();
		request.put("dto", requestDto);
		request.put("arrangeName", "".equals(requestDto.getName()) ? "미입력" : requestDto.getName());
		return sqlSession.insert(nameSpace + "savePerson", request);
	}
	
	// person 등록 (템플릿)
	@Override
	public Integer savePersonTemplate(PersonSaveTemplateRequestDto requestDto) {
		return sqlSession.insert(nameSpace + "savePersonTemplate", requestDto);
	}

	// person 수정
	@Override
	public Integer updatePerson(PersonUpdateRequestDto requestDto) {
		return sqlSession.update(nameSpace + "updatePerson", requestDto);
	}

	// person 삭제
	@Override
	public Integer deletePerson(Integer seq) {
		return sqlSession.delete(nameSpace + "deletePerson", seq);
	}	
}
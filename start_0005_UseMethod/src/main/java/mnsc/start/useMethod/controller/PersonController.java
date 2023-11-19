package mnsc.start.useMethod.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import mnsc.start.useMethod.dto.PersonDto;
import mnsc.start.useMethod.dto.PersonSaveRequestDto;
import mnsc.start.useMethod.dto.PersonSaveTemplateRequestDto;
import mnsc.start.useMethod.dto.PersonUpdateRequestDto;
import mnsc.start.useMethod.service.PersonSercive;

@Controller
public class PersonController {
	
	/**
	 * person 서비스
	 */
	@Autowired
	PersonSercive personService;
	
	/****************************** 목차(시작) ******************************/
	
	/**
	 * 목차(index)
	 * 
	 * @return content.jsp
	 */
 	@RequestMapping(value = "content" , method = RequestMethod.GET)
	public String content() {
		return "content";
	}
	
 	
 	/****************************** 조회 ******************************/
	
	/**
	 * person 단건 조회
	 * 
	 * @param model 모델
	 * @param request 서블릿
	 * @param name 이름
	 * @return person.jsp
	 */
	@RequestMapping(value = "person" , method = RequestMethod.GET)
	public String person(Model model, HttpServletRequest request, String name) {
		if(name != null) {
			PersonDto person = personService.findPerson(name);
			
			// 모델 저장
			model.addAttribute("person", person);
			
			// 세션 저장
			request.getSession().setAttribute("searchName", name);
		}
		return "person";
	}
	
	/**
	 * person 목록 조회
	 * 
	 * @param model 모델
	 * @return person.jsp
	 */
	@RequestMapping(value = "personList" , method = RequestMethod.GET)
	public String personList(Model model) {
		List<PersonDto> personList = personService.findAllPerson();
		model.addAttribute("personList", personList);
		return "personList";
	}
	
	
	/****************************** 등록 ******************************/
	
	/**
	 * person 등록
	 * 
	 * @return savePerson.jsp
	 */
	@RequestMapping(value = "savePerson", method = RequestMethod.GET)
	public String savePerson() {
		return "savePerson";
	}
	
	/**
	 * person 등록
	 * 
	 * @param requestDto person 저장요청 DTO
	 * @return savePerson.jsp
	 */
	@RequestMapping(value = "savePerson", method = RequestMethod.POST)
	public String savePerson(PersonSaveRequestDto requestDto) {
		personService.savePerson(requestDto);
		return "savePerson";
	}
	
	/**
	 * person 등록 (템플릿)
	 * 
	 * @return savePersonTemplate.jsp
	 */
	@RequestMapping(value = "savePersonTemplate", method = RequestMethod.GET)
	public String savePersonTemplate() {
		return "savePersonTemplate";
	}
	
	/**
	 * person 등록 (템플릿)
	 * 
	 * @param requestDto person 템플릿 저장요청 DTO
	 * @return requestDto person 템플릿 저장요청 DTO
	 */
	@RequestMapping(value = "savePersonTemplate", method = RequestMethod.POST)
	@ResponseBody
	public PersonSaveTemplateRequestDto savePersonTemplate(PersonSaveTemplateRequestDto requestDto) {
		personService.savePersonTemplate(requestDto);
		return requestDto;
	}
	
	
	/****************************** 수정 ******************************/
	
	/**
	 * person 수정
	 * 
	 * @param model 모델
	 * @return updatePerson.jsp
	 */
	@RequestMapping(value = "updatePerson", method = RequestMethod.GET)
	public String updatePerson(Model model) {
		List<PersonDto> personList = personService.findAllPerson();
		model.addAttribute("personList", personList);
		return "updatePerson";
	}
	
	/**
	 * person 수정
	 * 
	 * @param requestDto person 수정요청 DTO
	 * @return updatePerson 컨트롤러
	 */
	@RequestMapping(value = "updatePerson", method = RequestMethod.PUT)
	public String updatePerson(PersonUpdateRequestDto requestDto) {
		personService.updatePerson(requestDto);
		return "redirect:/updatePerson";
	}
	
	
	/****************************** 삭제 ******************************/
	
	/**
	 * person 삭제
	 * 
	 * @param model 모델
	 * @return deletePerson.jsp
	 */
	@RequestMapping(value = "deletePerson", method = RequestMethod.GET)
	public String deletePerson(Model model) {
		List<PersonDto> personList = personService.findAllPerson();
		model.addAttribute("personList", personList);
		return "deletePerson";
	}
	
	/**
	 * person 삭제
	 * 
	 * @param seq 번호
	 * @return deletePerson 컨트롤러
	 */
	@RequestMapping(value = "deletePerson", method = RequestMethod.DELETE)
	public String deletePerson(Integer seq) {
		personService.deletePerson(seq);
		return "redirect:/deletePerson";
	}	
}

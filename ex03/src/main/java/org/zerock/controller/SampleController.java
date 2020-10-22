package org.zerock.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample")
@Log4j
public class SampleController {
	
	@GetMapping(value = "/getTest", produces = "text/plain; charset=UTF-8")
	public String getText() {
		
		log.info("MIME TYPE : " + MediaType.TEXT_PLAIN_VALUE);
		
		return "안녕하세여"; 
		
		// 기존 Controller 는 return 값을 "redirect:/board/list" 와 같은 문자열로 반환했다.
		// REST 방식은 "안녕하세여" 같은 순수한 데이터가 반환
		
		
	}
	
	@GetMapping(value = "/getSample",
			produces = { 
					MediaType.APPLICATION_JSON_UTF8_VALUE, 
					MediaType.APPLICATION_XML_VALUE
			})
	public SampleVO getSample() {
		
		return new SampleVO(112, "스타", "로드");
	}
	
	// produces 속성을 없애도 상관없다. 반드시 필요한 것은 아님
	@GetMapping(value = "/getSample2")
	public SampleVO getSample2() {
		return new SampleVO(113,"로켓", "라쿤");
	}
}

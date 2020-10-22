package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleVO { // JSON, XML로 전달된 객체를 생산하기 위한 클래스
	
	private Integer mno;
	private String firstName;
	private String lastName;
	
}

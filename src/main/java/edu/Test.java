package edu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@RequestMapping(path="test",method=RequestMethod.GET)
	String test(){
		return "test1";
	}
}

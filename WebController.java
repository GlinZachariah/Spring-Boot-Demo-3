package com.demo.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@Autowired
	StateService customerService;
	
	@RequestMapping("/states")
	public List<States> getList(){
		return customerService.getStateList();
	}
	@RequestMapping("/states/{id}")
	public States getStates(@PathVariable String id ){
		return customerService.getStates(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/states")
	public void addStates(@RequestBody States s) {
		customerService.addStates(s);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value = "/states/{id}")
	public void updateState(@RequestBody States s,@PathVariable String id){
		customerService.updateState(s,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/states/{id}")
	public void deleteState(@PathVariable String id) {
		customerService.deleteState(id);
	}
		

}

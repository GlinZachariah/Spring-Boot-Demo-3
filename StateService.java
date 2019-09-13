package com.demo.sample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {
	
	@Autowired
	StateRepository sr;
	
	public List<States> getStateList() {
		List<States> ls = new ArrayList<States>();
		sr.findAll().forEach(ls::add);
		return ls;
	}
	
	public States getStates(String id) {
		return sr.findById(id).orElse(null);
	}
	
	public void addStates(States s) {
		sr.save(s);
	}
	
	public void updateState(States s,String id) {
		sr.save(s);
	}
	
	public void deleteState(String id) {
		sr.deleteById(id);
	}
}

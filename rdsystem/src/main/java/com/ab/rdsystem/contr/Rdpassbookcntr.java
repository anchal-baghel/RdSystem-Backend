package com.ab.rdsystem.contr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ab.rdsystem.DTOpassbook.UserPassbookDTO;
import com.ab.rdsystem.modal.Rdpassbook;
import com.ab.rdsystem.repo.Rdpassbookrepo;
import com.ab.rdsystem.service.PassbookService;


@RestController
public class Rdpassbookcntr {
	@Autowired
	private Rdpassbookrepo prepo;
	@Autowired
	 private PassbookService service;
	@GetMapping("/passbook")
	public List<Rdpassbook>pb(){
		List<Rdpassbook> lst=prepo.findAll();
		return lst;
	}
	
	@GetMapping("/ttl")
	public Map<String,Object> getSummary(){
		Long total =prepo.getTotalamt();
				Map<String,Object>result =new HashMap<>();
				result .put("total",total);
				return result ;
	}
	
	@GetMapping("/passbookById/{id}")
	public List<Rdpassbook>getpassbbokByRid(@PathVariable("id") int id){
		List<Rdpassbook> lst=prepo.getAllByRid(id);
		return lst;
	}
	
	

	@GetMapping("/passbookdetails/{rid}")
	public List<UserPassbookDTO>getUserPassbookDetaill(@PathVariable("rid") int rid){
		List<UserPassbookDTO> lst=service.getpassbookdetaill(rid);
		return lst;
	}
	
	
	@GetMapping("/details")
	 public List<Object[]> getDetails() {
	 return prepo.getUserPassbookDetails();
	 }
	 @GetMapping("/detail")
	 public List<UserPassbookDTO> getDetail() {
	 return service.getDetail();
	 }
	 
	
	@PostMapping("/passbooksave")
	public Rdpassbook Saverd(@RequestBody Rdpassbook p) {
		return prepo.save(p);
	}


	@PutMapping("/passbookupdt")
	public Rdpassbook updaterd(@RequestBody Rdpassbook p) {
		return prepo.save(p);
	}

	@DeleteMapping("/passbookdel/{id}")
	public String delteuser(@PathVariable("id")int id){
		prepo.deleteById(id);
		return "Record deleted succesfully...!";
	} 
	
	
}

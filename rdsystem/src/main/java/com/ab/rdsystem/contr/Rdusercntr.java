package com.ab.rdsystem.contr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ab.rdsystem.modal.Rduser;
import com.ab.rdsystem.repo.Rduserrepo;

@RestController
public class Rdusercntr {
@Autowired
private Rduserrepo repo;
@GetMapping("/rduser")
public List<Rduser>pb(){
	List<Rduser> lst=repo.findAll();
	return lst;
}

@PostMapping("/save")
public Rduser Saverd(@RequestBody Rduser p) {
	return repo.save(p);
}


@PutMapping("/updt")
public Rduser updaterd(@RequestBody Rduser p) {
	return repo.save(p);
}

@DeleteMapping("/del/{id}")
public String delteuser(@PathVariable("id")int id){
	repo.deleteById(id);
	return "Record deleted succesfully...!";
} 
}

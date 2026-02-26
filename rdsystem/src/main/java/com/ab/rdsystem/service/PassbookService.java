package com.ab.rdsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.ab.rdsystem.DTOpassbook.UserPassbookDTO;
import com.ab.rdsystem.repo.Rdpassbookrepo;

@Service
public class PassbookService {
	@Autowired
	private Rdpassbookrepo prepo;
	public List<UserPassbookDTO> getDetail() {
		 return prepo.getUserPassbookDetail();
		 }
	

    public List<UserPassbookDTO> getpassbookdetaill(@Param("rid") int rid) {
    	List<UserPassbookDTO> lst=prepo.getUserPassbookDetaill(rid);
		return lst;
	}
    	
	
	
}

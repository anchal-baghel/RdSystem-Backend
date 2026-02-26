package com.ab.rdsystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ab.rdsystem.DTOpassbook.UserPassbookDTO;
import com.ab.rdsystem.modal.Rdpassbook;

public interface Rdpassbookrepo extends JpaRepository<Rdpassbook, Integer>{
	@Query(value = "SELECT sum(rdamt)from rdpassbook",nativeQuery = true)
	Long getTotalamt();
	
	@Query(value= "SELECT *from rdpassbook where rid=:rid",nativeQuery = true)
	List<Rdpassbook>getAllByRid(@Param("rid")int rid);

	@Query(value= "select name,account_no,rdamt,rddate from rduser INNER JOIN rdpassbook on rduser.rid =rdpassbook.pid",nativeQuery = true)
	List<Object[]>getUserPassbookDetails();

	@Query(value= "select name,account_no,rdamt,rddate from rduser INNER JOIN rdpassbook on rduser.rid =rdpassbook.pid",nativeQuery = true)
	List<UserPassbookDTO>getUserPassbookDetail();
	
	@Query(value= "select rduser.name, rduser.account_no, rdpassbook.rdamt, rdpassbook.rddate from rduser INNER JOIN rdpassbook on rduser.rid = rdpassbook.pid where rduser.rid =:rid",nativeQuery = true)
	List<UserPassbookDTO>getUserPassbookDetaill(@Param("rid")int rid);

}

package com.ab.rdsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ab.rdsystem.modal.Rduser;

public interface Rduserrepo extends JpaRepository<Rduser, Integer>{

}

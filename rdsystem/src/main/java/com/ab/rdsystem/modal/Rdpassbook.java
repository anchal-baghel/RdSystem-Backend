package com.ab.rdsystem.modal;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rdpassbook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
	
    private int rid;
@Column(name ="rddate")
private LocalDate rddate;
private int rdamt;
private int lastday;
private int fineamt;
private int flag;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}

public LocalDate getRddate() {
	return rddate;
}
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public void setRddate(LocalDate rddate) {
	this.rddate = rddate;
}
public int getRdamt() {
	return rdamt;
}
public void setRdamt(int rdamt) {
	this.rdamt = rdamt;
}
public int getLastday() {
	return lastday;
}
public void setLastday(int lastday) {
	this.lastday = lastday;
}
public int getFineamt() {
	return fineamt;
}
public void setFineamt(int fineamt) {
	this.fineamt = fineamt;
}
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}

}

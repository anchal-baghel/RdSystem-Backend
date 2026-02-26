package com.ab.rdsystem.modal;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rduser {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Rid;
@Column(length = 100)
private String Name;
@Column(length = 10)
private String MobileNo;
@Column(length = 100)
private String Addr;
@Column(name ="DOB")
private LocalDate DOB;
@Column(length = 10)
private String Gender;
@Column(name ="RdDate")
private LocalDate RdDate;
private int RdAmt;
@Column(length = 100)
private String Occupation;
@Column(length = 30)
private String AccountNo;
@Column(length = 20)
private String AdharNo;
@Column(length = 20)
private String panNo;
@Column(length = 100)
private String NomineeName;
@Column(length = 100)
private String NomineeAddr;
@Column(length = 20)
private String NomineeAdharNo;
@Column(length = 20)
private String NomineePanNo;
private boolean agree;
public int getRid() {
	return Rid;
}
public void setRid(int rid) {
	Rid = rid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getMobileNo() {
	return MobileNo;
}
public void setMobileNo(String mobileNo) {
	MobileNo = mobileNo;
}
public String getAddr() {
	return Addr;
}
public void setAddr(String addr) {
	Addr = addr;
}
public LocalDate getDOB() {
	return DOB;
}
public void setDOB(LocalDate dOB) {
	DOB = dOB;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public LocalDate getRdDate() {
	return RdDate;
}
public void setRdDate(LocalDate rdDate) {
	RdDate = rdDate;
}
public int getRdAmt() {
	return RdAmt;
}
public void setRdAmt(int rdAmt) {
	RdAmt = rdAmt;
}
public String getOccupation() {
	return Occupation;
}
public void setOccupation(String occupation) {
	Occupation = occupation;
}
public String getAccountNo() {
	return AccountNo;
}
public void setAccountNo(String accountNo) {
	AccountNo = accountNo;
}
public String getAdharNo() {
	return AdharNo;
}
public void setAdharNo(String adharNo) {
	AdharNo = adharNo;
}
public String getPanNo() {
	return panNo;
}
public void setPanNo(String panNo) {
	this.panNo = panNo;
}
public String getNomineeName() {
	return NomineeName;
}
public void setNomineeName(String nomineeName) {
	NomineeName = nomineeName;
}
public String getNomineeAddr() {
	return NomineeAddr;
}
public void setNomineeAddr(String nomineeAddr) {
	NomineeAddr = nomineeAddr;
}
public String getNomineeAdharNo() {
	return NomineeAdharNo;
}
public void setNomineeAdharNo(String nomineeAdharNo) {
	NomineeAdharNo = nomineeAdharNo;
}
public String getNomineePanNo() {
	return NomineePanNo;
}
public void setNomineePanNo(String nomineePanNo) {
	NomineePanNo = nomineePanNo;
}
public boolean isAgree() {
	return agree;
}
public void setAgree(boolean agree) {
	this.agree = agree;
}
}

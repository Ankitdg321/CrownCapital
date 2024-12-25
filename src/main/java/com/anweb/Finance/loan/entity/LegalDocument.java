package com.anweb.Finance.loan.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class LegalDocument {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Lob
	private byte[] aadharCard;
	
	@Lob
	private byte[] pancard;
	
	@Lob
	private byte[] salarySlip;
	
	@Lob
	private byte[] bankStatement; 
	
	@Lob
	private byte[] lightBill;
	
	@Lob
	private byte[] rentAgreement;
	
	@Lob
	private byte[] joiningLetter;
	
	@Lob
	private byte[] photo;
	
	@Lob
	private byte[] sign;
	
	@Lob
	private byte[] bankPassbook;
	
	@Lob
	private byte[] idCard;
	
	@Lob
	private byte[] gasReceipt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(byte[] aadharCard) {
		this.aadharCard = aadharCard;
	}

	public byte[] getPancard() {
		return pancard;
	}

	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}

	public byte[] getSalarySlip() {
		return salarySlip;
	}

	public void setSalarySlip(byte[] salarySlip) {
		this.salarySlip = salarySlip;
	}

	public byte[] getBankStatement() {
		return bankStatement;
	}

	public void setBankStatement(byte[] bankStatement) {
		this.bankStatement = bankStatement;
	}

	public byte[] getLightBill() {
		return lightBill;
	}

	public void setLightBill(byte[] lightBill) {
		this.lightBill = lightBill;
	}

	public byte[] getRentAgreement() {
		return rentAgreement;
	}

	public void setRentAgreement(byte[] rentAgreement) {
		this.rentAgreement = rentAgreement;
	}

	public byte[] getJoiningLetter() {
		return joiningLetter;
	}

	public void setJoiningLetter(byte[] joiningLetter) {
		this.joiningLetter = joiningLetter;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public byte[] getSign() {
		return sign;
	}

	public void setSign(byte[] sign) {
		this.sign = sign;
	}

	public byte[] getBankPassbook() {
		return bankPassbook;
	}

	public void setBankPassbook(byte[] bankPassbook) {
		this.bankPassbook = bankPassbook;
	}

	public byte[] getIdCard() {
		return idCard;
	}

	public void setIdCard(byte[] idCard) {
		this.idCard = idCard;
	}

	public byte[] getGasReceipt() {
		return gasReceipt;
	}

	public void setGasReceipt(byte[] gasReceipt) {
		this.gasReceipt = gasReceipt;
	}

	@Override
	public String toString() {
		return "LegalDocument [id=" + id + ", aadharCard=" + Arrays.toString(aadharCard) + ", pancard="
				+ Arrays.toString(pancard) + ", salarySlip=" + Arrays.toString(salarySlip) + ", bankStatement="
				+ Arrays.toString(bankStatement) + ", lightBill=" + Arrays.toString(lightBill) + ", rentAgreement="
				+ Arrays.toString(rentAgreement) + ", joiningLetter=" + Arrays.toString(joiningLetter) + ", photo="
				+ Arrays.toString(photo) + ", sign=" + Arrays.toString(sign) + ", bankPassbook="
				+ Arrays.toString(bankPassbook) + ", idCard=" + Arrays.toString(idCard) + ", gasReceipt="
				+ Arrays.toString(gasReceipt) + "]";
	}
	
	

}

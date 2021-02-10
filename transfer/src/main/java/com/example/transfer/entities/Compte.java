package com.example.transfer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compte {
	@Id
private String num;
private long montant;

public Compte() {
	super();
	// TODO Auto-generated constructor stub
}
public Compte(String num, long montant) {
	super();
	this.num = num;
	this.montant = montant;
	
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public long getMontant() {
	return montant;
}
public void setMontant(long montant) {
	this.montant = montant;
}

}




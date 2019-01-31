package com.overnet.interfaces.listener;

import java.util.ArrayList;

public class Account {
	private ArrayList<Observer> observers;
	
	private static int contatore = 0; 
	private int numero;    // numero c/c
	private int saldo;
	
	public void addObserver(Observer o) {
		this.observers.add(o);
	}
	
	public void notifica() {
		for (Observer o : observers) {
			o.update(this.saldo);
		}
	}
	
	public Account(int saldo) {
		this.saldo = saldo;
		this.numero = contatore++;
		this.observers = new ArrayList<Observer>();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(int somma) {
		this.saldo = this.saldo + somma;
		notifica();
	}
	
	public void preleva(int somma) {
		this.saldo = this.saldo - somma;
		notifica();
	}
}

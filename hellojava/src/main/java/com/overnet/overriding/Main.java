package com.overnet.overriding;

public class Main {

	public static void main(String[] args) {
		Account a = new Account(100);
		a.setSaldo(100);
		System.out.println("Il saldo è = " + a.getSaldo());
		
		InterestAccount ia = new InterestAccount(100,10);
		ia.setSaldo(100);
		System.out.println("Il saldo è = " + ia.getSaldo());
		
		// I tipi derivati sono di tipo derivato e di tipo ancestor
		Account aa = new InterestAccount(100,20);
		Account fia2 = new FixedInterestAccount(100);
		
		FixedInterestAccount fia = new FixedInterestAccount(10);
		fia.setSaldo(100);
		System.out.println("Il saldo è = " + fia.getSaldo());
		
		Cliente mario = new Cliente(a);
		System.out.println("Patrimonio: " + mario.getPatrimonio());
		
		Cliente giuseppe = new Cliente(ia);
		System.out.println("Patrimonio: " + giuseppe.getPatrimonio());
		
		Cliente elena = new Cliente(fia);
		System.out.println("Patrimonio: " + elena.getPatrimonio());
		
	}

}

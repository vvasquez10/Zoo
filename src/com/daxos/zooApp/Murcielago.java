package com.daxos.zooApp;

public class Murcielago extends Mamifero{
	
	public Murcielago() {
		setNivelDeEnergia(300);
	}
	
	public void volar() {
		System.out.println("Está volando!! Aaahh!!!");
		this.setNivelDeEnergia(getNivelDeEnergia()-50);
	}

	public void comerHumanos() {
		System.out.println("Está devorando a todos!! Aaaaahhhhh!!!");
		this.setNivelDeEnergia(getNivelDeEnergia()+25);
	}
	
	public void atacarPueblo() {
		System.out.println("Todo está perdido!! Aaaaaaaaaaaaahhhhhhh!!!");
		this.setNivelDeEnergia(getNivelDeEnergia()-100);
	}

}

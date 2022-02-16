package com.daxos.zooApp;

public class Gorila extends Mamifero {

	public void escalar() {
		System.out.println("El gorila escala con gran velocidad.");
		this.setNivelDeEnergia(getNivelDeEnergia()-10);
	}
	
	public void lanzarAlgo() {			
		System.out.println("Ha lanzado algo pesado.");
		this.setNivelDeEnergia(getNivelDeEnergia()-5);
	}
	
	public void comerBananas() {
		System.out.println("El gorila come bananas.");
		this.setNivelDeEnergia(getNivelDeEnergia()+10);

	}

}

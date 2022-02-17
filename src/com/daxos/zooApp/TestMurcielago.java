package com.daxos.zooApp;

public class TestMurcielago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Murcielago felipe = new Murcielago();
		
		felipe.atacarPueblo();
		felipe.atacarPueblo();
		
		felipe.comerHumanos();
		felipe.comerHumanos();
		
		felipe.volar();
		
		System.out.println(felipe.getNivelDeEnergia());
	}

}

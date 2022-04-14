package com.desafiocartas.models;

import java.util.Arrays;
import java.util.List;

public class Baralho {

	private List<String> cartas = Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K");
	private List<String> naipe = Arrays.asList("Ouros", "Espadas", "Copas", "Paus");

	public void setCartas(List<String>cartas) {
		cartas = this.cartas;
	}
	
	public List<String> getCartas() {
		return cartas;
	}

	public List<String> getNaipe() {
		return naipe;
	}

	public void setNaipe(List<String> naipe) {
		this.naipe = naipe;
	}

}

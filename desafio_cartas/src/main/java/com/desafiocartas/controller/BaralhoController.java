package com.desafiocartas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiocartas.models.Baralho;

@RestController
public class BaralhoController {

	@RequestMapping("/cartas")
	public List<String> listaCartas() {
		Baralho b = new Baralho();
		return b.getCartas();
	}
	@RequestMapping("/naipe")
	public List<String> listaNaipe() {
		Baralho b = new Baralho();
		return b.getNaipe();
	}
}

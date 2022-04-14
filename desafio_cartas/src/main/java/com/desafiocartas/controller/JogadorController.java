package com.desafiocartas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafiocartas.models.Baralho;
import com.desafiocartas.models.Jogador;
import com.desafiocartas.repository.JogadorRepository;

@RestController
public class JogadorController {

	@Autowired
	private JogadorRepository jr;

	
	@RequestMapping(path = { "/{nome}" })
	public String setJogador(@PathVariable String nome) {
		Jogador j = new Jogador();
		j.setName(nome);
		jr.save(j);
		return nome;
	}

	@RequestMapping(value = "/jogadores", method = RequestMethod.GET)
	public Iterable<Jogador> getJogador(Jogador nome) {
		return jr.findAll();
	}

	@RequestMapping(value = "/mao")
	public List<String> cartasParaOsJogadores(Baralho cartas) {
		Jogador j = new Jogador();

		for (int i = 0; i <= j.getMaos().size(); i++) {
			ArrayList<String> lista = new ArrayList<String>(cartas.getCartas());
			j.setMaos(lista);
		}
		return j.getMaos();
	}
}

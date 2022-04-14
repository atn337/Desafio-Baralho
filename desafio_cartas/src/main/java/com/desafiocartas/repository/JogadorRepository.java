package com.desafiocartas.repository;

import org.springframework.data.repository.CrudRepository;

import com.desafiocartas.models.Jogador;

public interface JogadorRepository extends CrudRepository<Jogador, String> {
}

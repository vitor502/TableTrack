package com.trabalho.Restaurante.core.repository;

import java.util.List;
import java.util.Optional;

import com.trabalho.Restaurante.core.entity.Funcionario;

public interface UserRepository {

	List<Funcionario> findAll();

	Optional<Funcionario> findById(Long id);

	Funcionario save(Funcionario user);

	void deleteById(Long id);

}

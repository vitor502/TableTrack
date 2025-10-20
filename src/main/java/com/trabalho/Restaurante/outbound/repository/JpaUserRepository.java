package com.trabalho.Restaurante.outbound.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.Restaurante.core.entity.Funcionario;
import com.trabalho.Restaurante.core.repository.UserRepository;

@Profile("!test")
public interface JpaUserRepository extends UserRepository, JpaRepository<Funcionario, Long> {

}

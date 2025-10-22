package com.trabalho.crud.core.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;

import com.trabalho.Restaurante.core.entity.Funcionario;
import com.trabalho.Restaurante.core.repository.UserRepository;

@ActiveProfiles("test")
@Repository
public class UserRepositoryMemo implements UserRepository {

	private final List<Funcionario> users = new ArrayList<Funcionario>();

	@Override
	public List<Funcionario> findAll() {
		return users;
	}

	@Override
	public Optional<Funcionario> findById(Long id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst();
	}

	@Override
	public Funcionario save(Funcionario user) {
		var id = users.size() + 1;
		user.setId((long) id);
		users.add(user);
		return user;
	}

	@Override
	public void deleteById(Long id) {
		users.removeIf(user -> user.getId() == id);
	}

}

package com.trabalho.Restaurante.core.mapper;

import org.springframework.stereotype.Component;

import com.trabalho.Restaurante.core.dto.UserDto;
import com.trabalho.Restaurante.core.entity.Funcionario;

@Component
public class UserMapper {

	public Funcionario toEntity(UserDto dto) {
		// provide manual mapping or return null for now
		return null;
	}

	public UserDto toDto(Funcionario entity) {
		// provide manual mapping or return null for now
		return null;
	}

}

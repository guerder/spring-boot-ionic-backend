package com.guerder.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guerder.cursomc.domain.Cliente;
import com.guerder.cursomc.repositories.ClienteRepository;
import com.guerder.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
}

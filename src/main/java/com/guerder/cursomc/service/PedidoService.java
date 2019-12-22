package com.guerder.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guerder.cursomc.domain.Pedido;
import com.guerder.cursomc.repositories.PedidoRepository;
import com.guerder.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
}

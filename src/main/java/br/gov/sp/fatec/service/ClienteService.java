package br.gov.sp.fatec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.domain.entity.Cliente;
import br.gov.sp.fatec.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Transactional(readOnly = true)
    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Cliente> buscarTodosClientes() {
        return clienteRepository.findAll();
    }

    public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
        clienteAtualizado.setId(id); 
        return clienteRepository.save(clienteAtualizado);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}



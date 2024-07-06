package br.gov.sp.fatec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.domain.entity.Aluguel;
import br.gov.sp.fatec.repository.AluguelRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    public Aluguel criarAluguel(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public Aluguel atualizarAluguel(Long id, Aluguel aluguelAtualizado) {
        aluguelAtualizado.setId(id); 
        return aluguelRepository.save(aluguelAtualizado);
    }

    @Transactional(readOnly = true)
    public Optional<Aluguel> buscarAluguelPorId(Long id) {
        return aluguelRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Aluguel> buscarTodosAlugueis() {
        return aluguelRepository.findAll();
    }

    public void finalizarAluguel(Long id) {
        aluguelRepository.deleteById(id);
    }
}

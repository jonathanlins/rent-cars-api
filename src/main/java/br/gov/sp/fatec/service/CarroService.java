package br.gov.sp.fatec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.domain.entity.Carro;
import br.gov.sp.fatec.repository.CarroRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Carro salvarCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    @Transactional(readOnly = true)
    public Optional<Carro> buscarCarroPorId(Long id) {
        return carroRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Carro> buscarTodosCarros() {
        return carroRepository.findAll();
    }

    public Carro atualizarCarro(Long id, Carro carroAtualizado) {
        carroAtualizado.setId(id); 
        return carroRepository.save(carroAtualizado);
    }

    public void deletarCarro(Long id) {
        carroRepository.deleteById(id);
    }
}

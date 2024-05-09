package br.edu.utfpr.apiserviceiot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.apiserviceiot.dto.LeituraDTO;
import br.edu.utfpr.apiserviceiot.exception.NotFoundException;
import br.edu.utfpr.apiserviceiot.model.Leitura;
import br.edu.utfpr.apiserviceiot.repository.LeituraRepository;

@Service
public class LeituraService {

    @Autowired
    private LeituraRepository leituraRepository;

    public Leitura create(LeituraDTO dto) {
        Leitura leitura = new Leitura();
        BeanUtils.copyProperties(dto, leitura);
        return leituraRepository.save(leitura);
    }

    public List<Leitura> getAll() {
        return leituraRepository.findAll();
    }

    public Optional<Leitura> getById(long id) {
        return leituraRepository.findById(id);
    }

    public Leitura update(long id, LeituraDTO dto) throws NotFoundException {
        Optional<Leitura> optionalLeitura = leituraRepository.findById(id);
        Leitura Leitura = optionalLeitura.orElseThrow(() -> new NotFoundException("Leitor não encontrado"));
        BeanUtils.copyProperties(dto, Leitura, "id");
        return leituraRepository.save(Leitura);
    }

    public void delete(long id) throws NotFoundException {
        if (!leituraRepository.existsById(id)) {
            throw new NotFoundException("Leitor não encontrado");
        }
        leituraRepository.deleteById(id);
    }
}
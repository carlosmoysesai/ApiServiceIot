package br.edu.utfpr.apiserviceiot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.apiserviceiot.dto.AtuadorDTO;
import br.edu.utfpr.apiserviceiot.exception.NotFoundException;
import br.edu.utfpr.apiserviceiot.model.Atuador;
import br.edu.utfpr.apiserviceiot.repository.AtuadorRepository;

@Service
public class AtuadorService {

    @Autowired
    private AtuadorRepository AtuadorRepository;

    public Atuador create(AtuadorDTO dto) {
        Atuador Atuador = new Atuador();
        BeanUtils.copyProperties(dto, Atuador);
        return AtuadorRepository.save(Atuador);
    }

    public List<Atuador> getAll() {
        return AtuadorRepository.findAll();
    }

    public Optional<Atuador> getById(long id) {
        return AtuadorRepository.findById(id);
    }

    public Atuador update(long id, AtuadorDTO dto) throws NotFoundException {
        Optional<Atuador> optionalAtuador = AtuadorRepository.findById(id);
        Atuador Atuador = optionalAtuador.orElseThrow(() -> new NotFoundException("Atuador não encontrado"));
        BeanUtils.copyProperties(dto, Atuador, "id");
        return AtuadorRepository.save(Atuador);
    }

    public void delete(long id) throws NotFoundException {
        if (!AtuadorRepository.existsById(id)) {
            throw new NotFoundException("Atuador não encontrado");
        }
        AtuadorRepository.deleteById(id);
    }
}

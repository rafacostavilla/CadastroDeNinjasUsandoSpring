package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Service;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaEntity;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaEntity> findAll() {
        return ninjaRepository.findAll();
    }

    public Optional<NinjaEntity> findById(Long id) {
        return ninjaRepository.findById(id);
    }

    public void deleteNinjaById(Long id) {
        ninjaRepository.deleteById(id);
//        ninjaRepository.
//                findById(id).
//                ifPresent(ninjaEntity -> ninjaRepository.delete(ninjaEntity));
    }

    public NinjaEntity createNinja(NinjaEntity ninjaEntity) {
        return ninjaRepository.save(ninjaEntity);
    }
}

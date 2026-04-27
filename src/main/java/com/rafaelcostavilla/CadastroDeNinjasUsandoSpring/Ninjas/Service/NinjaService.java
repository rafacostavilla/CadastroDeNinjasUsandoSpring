package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Service;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaEntity;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaEntity> findAll() {
        return ninjaRepository.findAll();
    }
}

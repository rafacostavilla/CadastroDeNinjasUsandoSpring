package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Service;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaEntity;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaRepository;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.NinjaDTO;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.NinjaMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
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

    public NinjaDTO createNinja(NinjaDTO ninjaDTO)
    {
        NinjaEntity ninjaEntity  = ninjaMapper.map(ninjaDTO);
        return ninjaMapper.map(ninjaRepository.save(ninjaEntity));
    }

    public NinjaEntity updateNinjaById(Long id, NinjaEntity ninjaEntity) {
        return ninjaRepository.existsById(id)? ninjaRepository.save(ninjaEntity):null;
    }
}

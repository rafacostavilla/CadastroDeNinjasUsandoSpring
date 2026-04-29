package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Service;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaEntity;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaRepository;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.NinjaDTO;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.NinjaMapper;
import org.hibernate.boot.models.annotations.spi.AttributeMarker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> findAll() {
        List<NinjaEntity> ninjaEntities = ninjaRepository.findAll();
        List<NinjaDTO> ninjaDTOs = ninjaEntities.stream()
                .map(ninjaMapper::map)
                .toList();
        return ninjaDTOs;
    }

    public Optional<NinjaDTO> findById(Long id) {
        NinjaEntity ninjaEntity = ninjaRepository.findById(id).orElse(null);
        NinjaDTO ninjaDTO = ninjaEntity != null? ninjaMapper.map(ninjaEntity) : null;
        return Optional.ofNullable(ninjaDTO);
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

    public NinjaDTO updateNinjaById(Long id, NinjaDTO ninjaDTO) {
        NinjaEntity ninjaEntity = ninjaMapper.map(ninjaDTO);
        ninjaEntity.setId(id);
        return ninjaRepository.existsById(id)?
                ninjaMapper.map(ninjaRepository.save(ninjaEntity)):
                null;
    }
}

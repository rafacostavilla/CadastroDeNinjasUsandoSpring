package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaEntity;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaEntity map(NinjaDTO ninjaDTO) {
        NinjaEntity ninjaEntity = new NinjaEntity();
        ninjaEntity.setId(ninjaDTO.getId());
        ninjaEntity.setNome(ninjaDTO.getNome());
        ninjaEntity.setEmail(ninjaDTO.getEmail());
        ninjaEntity.setImgUrl(ninjaDTO.getImgUrl());
        ninjaEntity.setIdade(ninjaDTO.getIdade());
        ninjaEntity.setMissao(ninjaDTO.getMissao());
        ninjaEntity.setRanking(ninjaDTO.getRanking());
        return ninjaEntity;
    }

    public NinjaDTO map(NinjaEntity ninjaEntity) {
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaEntity.getId());
        ninjaDTO.setNome(ninjaEntity.getNome());
        ninjaDTO.setEmail(ninjaEntity.getEmail());
        ninjaDTO.setImgUrl(ninjaEntity.getImgUrl());
        ninjaDTO.setIdade(ninjaEntity.getIdade());
        ninjaDTO.setMissao(ninjaEntity.getMissao());
        ninjaDTO.setRanking(ninjaEntity.getRanking());
        return ninjaDTO;
    }
}

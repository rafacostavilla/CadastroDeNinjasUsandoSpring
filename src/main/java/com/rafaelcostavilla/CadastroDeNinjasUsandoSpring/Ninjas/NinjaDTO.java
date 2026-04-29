package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Missoes.Model.MissaoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    private Long id;
    private String nome;
    private String email;
    private String imgUrl;
    private int idade;
    private MissaoEntity missao;
    private String ranking;
}

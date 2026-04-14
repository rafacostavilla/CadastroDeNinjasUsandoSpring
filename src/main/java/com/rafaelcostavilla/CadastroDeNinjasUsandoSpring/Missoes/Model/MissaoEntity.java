package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Missoes.Model;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<NinjaEntity> ninjas;
}

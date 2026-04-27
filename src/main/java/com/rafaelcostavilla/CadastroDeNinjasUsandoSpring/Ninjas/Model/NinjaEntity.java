package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Missoes.Model.MissaoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro_de_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    private int idade;
    //TODO: String cla;
    //TODO: RANK rank;
    //TODO: List<String> tecnicas;

    @ManyToOne
    @JoinColumn(name = "missao_id")
    private MissaoEntity missao;

}

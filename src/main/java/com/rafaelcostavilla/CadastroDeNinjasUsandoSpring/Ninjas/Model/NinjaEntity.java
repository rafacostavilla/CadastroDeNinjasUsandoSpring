package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Missoes.Model.MissaoEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //TODO: String cla;
    //TODO: RANK rank;
    //TODO: List<String> tecnicas;
    @ManyToOne
    @JoinColumn(name = "missao_id")
    private MissaoEntity missao;

    public MissaoEntity getMissao() {
        return missao;
    }

    public void setMissao(MissaoEntity missao) {
        this.missao = missao;
    }


    public NinjaEntity() {
    }

    public NinjaEntity(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

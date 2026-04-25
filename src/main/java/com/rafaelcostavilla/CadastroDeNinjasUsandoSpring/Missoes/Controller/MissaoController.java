package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Missoes.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("missoes")
public class MissaoController {

    //Criar Missao
    @PostMapping("/criarMissao")
    public String createMissao() {
        return "Missao criada com sucesso!";
    }

    //Atualizar Missao
    @PostMapping("/atualizarMissaoPorID")
    public String updateMissaoByID() {
        return "Missao atualizada com sucesso!";
    }

    //Retornar todas as missoes
    @RequestMapping("/todas")
    public String readAllMissoes() {
        return "Todas as missoes retornadas com sucesso!";
    }

    //Retornar missao por ID
    @RequestMapping("/retornarMissaoPorID")
    public String readMissaoByID() {
        return "Retorna missao por ID";
    }

    //Deletar missao
    @DeleteMapping("/deletarPorID")
    public String deleteMissaoByID() {
        return "Deleta missao por ID";
    }


}

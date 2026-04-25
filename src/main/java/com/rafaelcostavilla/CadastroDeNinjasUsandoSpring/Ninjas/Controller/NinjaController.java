package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Bem vindo ao Spring Boot! Essa é a primeira rota criada.";
    }

    // Create Ninja
    @GetMapping("/criarNinja")
    public String createNinja() {
        return "Ninja criado com sucesso!";
    }

    // Update Ninja by ID
    @GetMapping("/atualizarNinjaPorID")
    public String updateNinjaByID() {
        return "Ninja atualizado com sucesso!";
    }

    // READ all Ninjas
    @GetMapping("/todos")
    public String showAllNinjas() {
        return "Mostrar todos os ninjas";
    }

    // READ Ninja by ID
    @GetMapping("/mostrarNinjaPorID")
    public String showNinjaByID() {
        return "Mostrar ninja por ID";
    }

    // Delete Ninja By ID
    @GetMapping("/deletarNinjaPorID")
    public String deleteNinjaByID() {
        return "Deletar ninja por ID";
    }
}

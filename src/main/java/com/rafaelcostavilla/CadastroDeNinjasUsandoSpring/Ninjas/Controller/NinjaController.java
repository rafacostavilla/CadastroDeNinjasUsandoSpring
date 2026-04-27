package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Controller;

import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model.NinjaEntity;
import com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Bem vindo ao Spring Boot! Essa é a primeira rota criada.";
    }

    // Create Ninja
    @PostMapping("/criar")
    public NinjaEntity createNinja(@RequestBody NinjaEntity ninjaEntity)
    {
        return ninjaService.createNinja(ninjaEntity);
    }

    // Update Ninja by ID
    @GetMapping("/atualizarNinjaPorID")
    public String updateNinjaByID() {
        return "Ninja atualizado com sucesso!";
    }

    // READ all Ninjas
    @GetMapping("/todos")
    public List<NinjaEntity> showAllNinjas() {
        return ninjaService.findAll();
    }

    // READ Ninja by ID
    @GetMapping("/{id}")
    public NinjaEntity showNinjaByID(@PathVariable Long id) {
        return ninjaService.findById(id).orElse(null);
    }

    // Delete Ninja By ID
    @DeleteMapping("/deletar/{id}")
    public void deleteNinjaByID(@PathVariable Long id) {
        ninjaService.deleteNinjaById(id);
    }
}

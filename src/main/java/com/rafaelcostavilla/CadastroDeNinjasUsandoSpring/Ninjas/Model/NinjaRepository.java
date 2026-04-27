package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Ninjas.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaEntity, Long> {
}

package com.rafaelcostavilla.CadastroDeNinjasUsandoSpring.Missoes.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<MissaoEntity, Long> {
}

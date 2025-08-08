package br.com.fiap.super_poderes.poderes;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperPoderRepository extends JpaRepository<SuperPoder, Long> {
    List<SuperPoder> findAllByOrderByNivelInutilidadeDesc();
}

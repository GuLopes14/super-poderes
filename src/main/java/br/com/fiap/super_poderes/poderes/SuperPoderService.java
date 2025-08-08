package br.com.fiap.super_poderes.poderes;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SuperPoderService {
    private final SuperPoderRepository superPoderRepository;

    public SuperPoderService(SuperPoderRepository superPoderRepository) {
        this.superPoderRepository = superPoderRepository;
    }

    public List<SuperPoder> getAllSuperPoderes() {
        List<SuperPoder> superPoderes = superPoderRepository.findAllByOrderByNivelInutilidadeDesc();
        return superPoderes;
    }
}

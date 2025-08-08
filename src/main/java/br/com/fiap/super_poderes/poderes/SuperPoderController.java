package br.com.fiap.super_poderes.poderes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/superpoder")
public class SuperPoderController {
    private final SuperPoderService superPoderService;

    public SuperPoderController(SuperPoderService superPoderService) {
        this.superPoderService = superPoderService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("superPoderes", superPoderService.getAllSuperPoderes());
        return "index";
    }
}

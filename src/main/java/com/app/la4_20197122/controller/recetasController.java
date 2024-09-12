package com.app.la4_20197122.controller;

import com.app.la4_20197122.entity.Categoria;
import com.app.la4_20197122.entity.Receta;
import com.app.la4_20197122.repository.CategoriaRepository;
import com.app.la4_20197122.repository.RecetaRepository;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recetas")
public class recetasController {
    final RecetaRepository recetaRepository;
    final CategoriaRepository categoriaRepository;

    public recetasController(RecetaRepository recetaRepository, CategoriaRepository categoriaRepository) {
        this.recetaRepository = recetaRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/lista")
    public String viewRecetas(Model model) {
        //Lista de Recetas
        List<Receta> receta = recetaRepository.findAll();
        //Enviar a la vista
        model.addAttribute("recetas", receta);
        return "lista";
    }

    @GetMapping("/formNew")
    public String formNewReceta(Model model) {
        List<Categoria> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "create";
    }
    @PostMapping("/create")
    public String createReceta(Receta receta) {
        recetaRepository.save(receta);
        return "redirect:/recetas/lista";
    }

}

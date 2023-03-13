package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/bsm/objetivo")
public class HelloController {
    @GetMapping
    public String helloworld() {
        return "Alo Mundo";
    }

    @GetMapping("/bsm")
    public String bsm() {
        return "BSMs da Generation Brasil " +
                "- Persistência " +
                "- Mentalidade de Crescimento " +
                "- Orientação ao Futuro " +
                "- Responsabilidade Pessoal " +
                "- Trabalho em Equipe " +
                "- Comunicação " +
                "- Comunicação Não Violenta " +
                "- Atenção para Detalhes " +
                "- Proatividade";
    }

    @GetMapping("/objetivo")
    public String objetivo() {
        return "Objetivos de Aprendizagem " +
                "Gestão do tempo " +
                "Organização " +
                "Vídeos da Plataforma " +
                "Exercícios e Projeto integrador";
    }
}
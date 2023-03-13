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
        return "BSMs da Generation Brasil\n" +
                "- Persistência\n" +
                "- Mentalidade de Crescimento\n" +
                "- Orientação ao Futuro\n" +
                "- Responsabilidade Pessoal\n" +
                "- Trabalho em Equipe\n" +
                "- Comunicação\n" +
                "- Comunicação Não Violenta\n" +
                "- Atenção para Detalhes\n" +
                "- Proatividade";
    }

    @GetMapping("/objetivo")
    public String objetivo() {
        return "Objetivos de Aprendizagem\n" +
                "Gestão do tempo\n" +
                "Organização\n" +
                "Vídeos da Plataforma\n" +
                "Exercícios e Projeto integrador";
    }
}
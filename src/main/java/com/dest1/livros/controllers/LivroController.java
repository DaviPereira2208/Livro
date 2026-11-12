package com.dest1.livros.controllers;

import com.dest1.livros.entities.Livro;
import com.dest1.livros.respositories.LivroRespository;

@RestController
public class LivroController {

    @Autowured
    LivroRespository respository;

    @PostMapping
    public Livro m(@RequestBody Livro l){
        return respository.save;
    }

    @GetMapping
    public List<Livro mostrar(){
        return respository.finAll();
}


}

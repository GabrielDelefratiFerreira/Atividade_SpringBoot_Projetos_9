package com.example.projetos.Controller;

import com.example.projetos.Model.ProjetoModel;
import com.example.projetos.Service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<ProjetoModel> findAll(){
        return projetoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ProjetoModel> buscarPorId(@PathVariable Long id){
        return projetoService.buscarPorId(id);
    }

    @PostMapping
    public ProjetoModel criarProjeto(@RequestBody ProjetoModel projeto){
        return projetoService.criarProjeto(projeto);
    }

    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable Long id){
        projetoService.deletarProjeto(id);
    }
}
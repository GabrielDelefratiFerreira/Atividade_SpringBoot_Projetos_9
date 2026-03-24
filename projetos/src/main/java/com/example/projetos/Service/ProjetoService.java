package com.example.projetos.Service;

import com.example.projetos.Model.ProjetoModel;
import com.example.projetos.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<ProjetoModel> findAll(){
        return projetoRepository.findAll();
    }

    public Optional<ProjetoModel> buscarPorId(Long id){
        return projetoRepository.findById(id);
    }

    public ProjetoModel criarProjeto(ProjetoModel projeto){
        return projetoRepository.save(projeto);
    }

    public void deletarProjeto(Long id){
        projetoRepository.deleteById(id);
    }
}
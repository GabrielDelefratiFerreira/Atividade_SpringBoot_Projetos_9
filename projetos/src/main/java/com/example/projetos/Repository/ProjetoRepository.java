package com.example.projetos.Repository;

import com.example.projetos.Model.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}

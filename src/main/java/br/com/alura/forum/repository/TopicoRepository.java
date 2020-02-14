package br.com.alura.forum.repository;

import br.com.alura.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

//    Consulta por query
    List<Topico> findByCursoNome(String nomeCurso);
//    Consulta por query em caso de ambiguidade
//    List<Topico> findByCurso_Nome(String nomeCurso);


}

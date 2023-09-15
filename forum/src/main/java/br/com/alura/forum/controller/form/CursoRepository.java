package br.com.alura.forum.controller.form;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.forum.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}

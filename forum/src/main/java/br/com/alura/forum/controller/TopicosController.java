package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository repository;

	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(String nomeCurso) {
		if (nomeCurso == null) {
            List<Topico> topicos = repository.findAll();
            return TopicoDTO.converter(topicos);
     } else {
         List<Topico> topicos = repository.findByCursoNome(nomeCurso);
             return TopicoDTO.converter(topicos);
     }
	}
}

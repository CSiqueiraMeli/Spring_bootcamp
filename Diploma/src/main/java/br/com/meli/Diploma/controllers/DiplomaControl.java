package br.com.meli.Diploma.controllers;

import br.com.meli.Diploma.domain.Aluno;
import br.com.meli.Diploma.dto.AlunoDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaControl {
    @RequestMapping(value = "/diploma", method = RequestMethod.POST)
    public AlunoDTO getDiploma(@RequestBody Aluno  aluno){
        return new AlunoDTO(aluno.getNome(), aluno.getMedia());
    }
}

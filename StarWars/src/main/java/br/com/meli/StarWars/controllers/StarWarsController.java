package br.com.meli.StarWars.controllers;

import br.com.meli.StarWars.domain.Character;
import br.com.meli.StarWars.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("starwars/")
public class StarWarsController {
@Autowired
    private CharacterService service;

@GetMapping("/{name}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Character> getCharactersByName(@PathVariable String name){
    return service.getCharactersByName(name);
}

}

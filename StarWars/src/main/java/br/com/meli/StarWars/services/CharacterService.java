
package br.com.meli.StarWars.services;

import br.com.meli.StarWars.domain.Character;
import br.com.meli.StarWars.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository repository;

    public List<Character> getCharactersByName(String name){
        return repository.getCharactersByName(name);
    }
}
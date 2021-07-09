package br.com.meli.morse.controls;

import br.com.meli.morse.services.MorseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseControl {


    @GetMapping("/morse/{morse}")
    public String codigoMorse(@PathVariable String morse){
        return MorseService.getCodigo(morse);
    }

}

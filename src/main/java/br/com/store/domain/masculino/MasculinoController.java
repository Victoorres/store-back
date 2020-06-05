package br.com.store.domain.masculino;

import br.com.store.core.AbstractController;
import br.com.store.exceptions.ErrorExcep;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/masculino")
public class MasculinoController extends AbstractController<Masculino> {

    @Override
    @PostMapping
    public ResponseEntity<?> save(@RequestBody() Masculino masculino) {


        if (masculino.getNome() == null) {
        throw new ErrorExcep("O nome não pode ficar vazio");
        }
        return new ResponseEntity<>(service.save(masculino), HttpStatus.OK);


    }
}
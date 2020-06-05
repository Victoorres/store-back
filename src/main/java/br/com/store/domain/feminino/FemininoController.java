package br.com.store.domain.feminino;

import br.com.store.core.AbstractController;
import br.com.store.exceptions.ErrorExcep;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/feminino")
public class FemininoController extends AbstractController<Feminino> {

    @Override
    @PostMapping
    public ResponseEntity<?> save(@RequestBody() Feminino feminino) {


        if (feminino.getNome() == null) {
        throw new ErrorExcep("O nome não pode ficar vazio");
        }
        return new ResponseEntity<>(service.save(feminino), HttpStatus.OK);


    }
}
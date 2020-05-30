package br.com.store.domain.camisa;

import br.com.store.core.AbstractController;
import br.com.store.exceptions.ErrorExcep;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/camisa")
public class CamisaController extends AbstractController<Camisa> {

    @Override
    @PostMapping
    public ResponseEntity<?> save(@RequestBody() Camisa camisa) {


        if (camisa.getNome() == null) {
        throw new ErrorExcep("O nome não pode ficar vazio");
        }
        return new ResponseEntity<>(service.save(camisa), HttpStatus.OK);


    }
}
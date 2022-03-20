package PAT.Practica5.SpringBoot;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ClientController{

    @PostMapping("/Contacto")
    public Cliente submitForm(@Valid @RequestBody Cliente cliente){
        return cliente;
    }
}
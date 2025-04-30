package spring.boot.list.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.list.contact.model.Clientes;
import spring.boot.list.contact.service.ClientesService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("path")
    public String criar (@RequestBody String entity) {

        Clientes clienteSalva = ClientesService.salvarCliente(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalva);
    }
}

package spring.boot.list.contact.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.boot.list.contact.dto.ClientesResponseDTO;
import spring.boot.list.contact.model.Clientes;
import spring.boot.list.contact.service.ClientesService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping
    public String criar (@RequestBody String entity) {

        Clientes clienteSalva = ClientesService.salvarCliente(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalva);
    }

    @GetMapping
    public ResponseEntity<List<ClientesResponseDTO>>listarTodos(){
        return ResponseEntity.ok(clientesService.listarTodos());

    }

}

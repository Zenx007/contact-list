package spring.boot.list.contact.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.boot.list.contact.dto.ClientesDTO;
import spring.boot.list.contact.dto.ClientesResponseDTO;
import spring.boot.list.contact.dto.ContatoResponseDTO;
import spring.boot.list.contact.model.Clientes;
import spring.boot.list.contact.service.ClientesService;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping
    public ResponseEntity<Clientes> criar (@RequestBody ClientesDTO dto) {
        Clientes clienteSalvo = clientesService.salvarCliente(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
    }

    @GetMapping
    public ResponseEntity<List<ClientesResponseDTO>>listarTodos(){
        return ResponseEntity.ok(clientesService.listarTodos());
    }

    @GetMapping("/{id}/contatos")
    public ResponseEntity<List<ContatoResponseDTO>> listarContatos(@PathVariable Long id) {

        return ResponseEntity.ok(clientesService.listarContatosPorCliente(id));
    }

}

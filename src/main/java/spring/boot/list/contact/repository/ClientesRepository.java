package spring.boot.list.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.list.contact.model.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}

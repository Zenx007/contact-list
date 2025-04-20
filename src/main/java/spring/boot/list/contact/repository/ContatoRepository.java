package spring.boot.list.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.list.contact.model.Contato;

public interface ContatoRepository extends JpaRepository <Contato, Long> {
}

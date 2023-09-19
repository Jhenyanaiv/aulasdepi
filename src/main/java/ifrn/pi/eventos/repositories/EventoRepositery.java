package ifrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eventos.models.evento;

public interface EventoRepositery extends JpaRepository<evento,Long> {

}

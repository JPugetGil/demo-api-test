package xyz.hemoreg.demopostgresql.usermanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.hemoreg.demopostgresql.usermanagment.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}

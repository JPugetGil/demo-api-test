package xyz.hemoreg.demomysql.usermanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.hemoreg.demomysql.usermanagment.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}

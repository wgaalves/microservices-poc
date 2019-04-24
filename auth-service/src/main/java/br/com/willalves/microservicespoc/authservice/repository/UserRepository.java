package br.com.willalves.microservicespoc.authservice.repository;

import br.com.willalves.microservicespoc.authservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}

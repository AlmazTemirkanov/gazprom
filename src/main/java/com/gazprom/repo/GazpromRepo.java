package com.gazprom.repo;

import com.gazprom.domain.Gazprom;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GazpromRepo extends CrudRepository<Gazprom, String> {

    List<Gazprom> findByPersonalAccount(String personaAccount);

    List<Gazprom> findByCustomerIgnoreCaseContaining(String customer);

    List<Gazprom> findByStreetIgnoreCaseContaining(String street);


   List<Gazprom> findById (Long id);
}


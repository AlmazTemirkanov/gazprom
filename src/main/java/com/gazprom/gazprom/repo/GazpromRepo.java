package com.gazprom.gazprom.repo;

import com.gazprom.gazprom.domain.Gazprom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GazpromRepo extends JpaRepository<Gazprom,String> {

    List<Gazprom> findByPersonalAccount(String personaAccount);
//
//    List<Gazprom> findByCustomerIgnoreCaseContaining(String customer);
//
//    List<Gazprom> findByCustomerEquals (String customer);
//
//    List<Gazprom> findByStreetIgnoreCaseContaining(String street);
//
//
//   List<Gazprom> findById (Long id);
}


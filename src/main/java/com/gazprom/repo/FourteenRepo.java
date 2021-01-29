package com.gazprom.repo;

import com.gazprom.domain.Fourteen;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FourteenRepo extends CrudRepository<Fourteen,String> {
    Optional<Fourteen> findById(String id);
}

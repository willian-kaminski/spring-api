package com.kaminski.willian.springapi.repository;

import com.kaminski.willian.springapi.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Willian Kaminski
 * @since 29-09-19
 * @version 1.0
 */
public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
    Cidade findById(long id);
}

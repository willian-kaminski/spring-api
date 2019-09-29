package com.kaminski.willian.springapi.repository;

import com.kaminski.willian.springapi.models.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Willian Kaminski
 * @since 28-09-19
 * @version 1.0
 */

public interface PaisRepository extends JpaRepository<Pais, Long>{
    
    Pais findById(long id);
}

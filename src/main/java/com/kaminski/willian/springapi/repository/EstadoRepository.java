package com.kaminski.willian.springapi.repository;

import com.kaminski.willian.springapi.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Willian Kaminski
 * @since 29-09-19
 * @version 1.0
 */

public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
    Estado findById(long id);
}

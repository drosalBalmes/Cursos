package com.balmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.balmes.model.Estudiant;
public interface EstudiantRepository extends JpaRepository<Estudiant, Integer> {


}

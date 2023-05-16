package com.balmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.balmes.model.Curs;
public interface CursRepository extends JpaRepository<Curs, Integer> {
}

package com.app.la4_20197122.repository;

import com.app.la4_20197122.entity.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Integer> {
}

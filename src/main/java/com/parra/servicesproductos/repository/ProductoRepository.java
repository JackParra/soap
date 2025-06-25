package com.parra.servicesproductos.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parra.servicesproductos.entidad.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    public List<Producto> findByNombreContaining (String nombre, Pageable page);
}

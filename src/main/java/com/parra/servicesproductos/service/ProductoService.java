package com.parra.servicesproductos.service;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.parra.servicesproductos.entidad.Producto;

public interface ProductoService {
    public List<Producto> findAll (Pageable page);
    public List<Producto> finByNombre(String nombre, Pageable page);
    public Producto finById (int id);
    public Producto save (Producto articulo);
    public void delete (int id);
}

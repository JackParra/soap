// package com.parra.servicesproductos.service.sImplement;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Pageable;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// import com.parra.servicesproductos.entidad.Producto;
// import com.parra.servicesproductos.repository.ProductoRepository;
// import com.parra.servicesproductos.service.ProductoService;


// @Service
// public class ProductoServiceImplement implements ProductoService{
//     @Autowired
//     ProductoRepository repository;

//     @Override
//     @Transactional(readOnly = true)
//     public List<Producto> findAll(Pageable page) {
//         try {
//             List<Producto> productos=repository.findAll(page).toList();
//             return productos;
//         } catch (Exception e) {
//             throw e;
//         }
//     }

//     @Override
//     public List<Producto> finByNombre(String nombre, Pageable page) {
//         throw new UnsupportedOperationException("Unimplemented method 'finByNombre'");
//     }

//     @Override
//     @Transactional(readOnly = true)
//     public Producto finById(int id) {
//         try {
//             Producto producto=repository.findById(id).orElseThrow();
//             return producto;
//         } catch (Exception e) {
//             throw e;
//         }
//     }

//     // @Override
//     // @Transactional
//     // public Producto save(Producto articulo) {
//     //     try {
//     //         if((int) articulo.getId()==0) {
//     //             Producto newProducto=repository.save(articulo);
//     //             return newProducto; 
//     //         }
//     //         // Producto productoEditado = repository.findById(articulo.getId()).orElseThrow();
//     //         // productoEditado.setNombre(articulo.getNombre());
//     //         // productoEditado.setPrecio(Double.parseDouble(articulo.getPrecio()));
//     //     } catch (Exception e) {
//     //         throw e;
//     //     }
//     // }

//     @Override
//     public void delete(int id) {
//         throw new UnsupportedOperationException("Unimplemented method 'delete'");
//     }

// }

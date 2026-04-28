package com.ita.cursoapis.repository;

import com.ita.cursoapis.entity.EstadoProducto;
import com.ita.cursoapis.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    Optional<Producto> findByNombreProducto(String nombreProducto);

    Optional<Producto>findByIdProducto(Long idProducto);

    List<Producto>findByEstado(EstadoProducto estadoProducto);
}

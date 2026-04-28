package com.ita.cursoapis.service;

import com.ita.cursoapis.entity.EstadoProducto;
import com.ita.cursoapis.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    Producto registrarProducto(Producto producto);

    List<Producto>listarProductos();
    Optional<Producto>buscarPorNombre(String nombre);
    Optional<Producto>buscarPorId(long idProducto);
    Producto actualizarProducto(Long idProducto,Producto producto);

    void eliminarProducto(Long idProducto);

    Producto cambiarEstadoProducto(Long idProducto, EstadoProducto nuevoEstadoProducto);

    List<Producto> obtenerProductosPorEstado(EstadoProducto estadoProducto);


}

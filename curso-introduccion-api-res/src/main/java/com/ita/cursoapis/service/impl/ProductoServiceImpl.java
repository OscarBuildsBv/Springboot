package com.ita.cursoapis.service.impl;

import com.ita.cursoapis.entity.EstadoProducto;
import com.ita.cursoapis.entity.Producto;
import com.ita.cursoapis.repository.ProductoRepository;
import com.ita.cursoapis.service.ProductoService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto registrarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        List<Producto> productos= productoRepository.findAll();
        return  productos.stream()
                .toList();
    }

    @Override
    public Optional<Producto> buscarPorNombre(String nombre) {

        return productoRepository.findByNombreProducto(nombre);
    }

    @Override
    public Optional<Producto> buscarPorId(long idProducto)
    {
        return productoRepository.findByIdProducto(idProducto);
    }

    @Override
    @SneakyThrows
    public Producto actualizarProducto(Long idProducto, Producto producto) {

        Producto ProductoExistente=productoRepository.findByIdProducto(idProducto)
                .orElseThrow(() -> new Exception("Producto con ID "+idProducto+" no encontrado"));
        return null;
    }

    @Override
    public void eliminarProducto(Long idProducto) {

    }

    @Override
    public Producto cambiarEstadoProducto(Long idProducto, EstadoProducto nuevoEstadoProducto) {

        return productoRepository.findByEstado(nuevoEstadoProducto);
    }

    @Override
    public List<Producto> obtenerProductosPorEstado(EstadoProducto estadoProducto) {
        return List.of();
    }
}

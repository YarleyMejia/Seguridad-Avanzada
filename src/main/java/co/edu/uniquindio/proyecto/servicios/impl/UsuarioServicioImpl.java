package proyecto.servicios.impl;

import org.springframework.stereotype.Service;
import proyecto.dto.CrearUsuarioDTO;
import proyecto.dto.EditarUsuarioDTO;
import proyecto.dto.UsuarioDTO;
import proyecto.servicios.UsuarioServicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    private final List<UsuarioDTO> usuarios = new ArrayList<>();

    public UsuarioServicioImpl() {
        // Agregar usuarios quemados para prueba
        usuarios.add(new UsuarioDTO("1", "Carlos", "Armenia", "Calle 123", "carlos@email.com"));
        usuarios.add(new UsuarioDTO("2", "Ana", "Bogotá", "Carrera 45", "ana@email.com"));
    }

    @Override
    public void crear(CrearUsuarioDTO cuenta) {
        String id = String.valueOf(usuarios.size() + 1); // Generar ID secuencial
        UsuarioDTO nuevoUsuario = new UsuarioDTO(id, cuenta.nombre(), cuenta.ciudad(), cuenta.direccion(), cuenta.email());
        usuarios.add(nuevoUsuario);
    }

    @Override
    public void editar(EditarUsuarioDTO cuenta) {
        Optional<UsuarioDTO> usuarioExistente = usuarios.stream()
                .filter(u -> u.id().equals(cuenta.id()))
                .findFirst();

        usuarioExistente.ifPresentOrElse(usuario -> {
            usuarios.remove(usuario);
            usuarios.add(new UsuarioDTO(cuenta.id(), cuenta.nombre(), cuenta.ciudad(), cuenta.direccion(), usuario.email()));
        }, () -> {
            throw new RuntimeException("Usuario no encontrado");
        });
    }

    @Override
    public void eliminar(String id) {
        boolean eliminado = usuarios.removeIf(usuario -> usuario.id().equals(id));
        if (!eliminado) {
            throw new RuntimeException("Usuario no encontrado");
        }
    }

    @Override
    public UsuarioDTO obtener(String id) {
        return usuarios.stream()
                .filter(usuario -> usuario.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    @Override
    public List<UsuarioDTO> listarTodos() {
        return usuarios;
    }
}
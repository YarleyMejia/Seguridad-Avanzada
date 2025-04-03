package co.edu.uniquindio.proyecto.servicios.impl;

import co.edu.uniquindio.proyecto.dto.CrearUsuarioDTO;
import co.edu.uniquindio.proyecto.dto.EditarUsuarioDTO;
import co.edu.uniquindio.proyecto.dto.UsuarioDTO;
import co.edu.uniquindio.proyecto.servicios.UsuarioServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {
    @Override
    public void crear(CrearUsuarioDTO cuenta) throws Exception {

    }

    @Override
    public void eliminar(String id) throws Exception {

    }

    @Override
    public void editar(EditarUsuarioDTO cuenta) throws Exception {

    }

    @Override
    public UsuarioDTO obtener(String id) throws Exception {
        return null;
    }

    @Override
    public List<UsuarioDTO> listarTodos(String nombre, String ciudad, int pagina) {
        return List.of();
    }
    //TODO implementar todos los métodos de la interfaz
}

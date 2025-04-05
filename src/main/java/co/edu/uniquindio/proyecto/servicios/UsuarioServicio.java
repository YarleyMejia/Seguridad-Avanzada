package proyecto.servicios;


import proyecto.dto.CrearUsuarioDTO;
import proyecto.dto.EditarUsuarioDTO;
import proyecto.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioServicio {
    void crear(CrearUsuarioDTO cuenta);
    void editar(EditarUsuarioDTO cuenta);
    void eliminar(String id);
    UsuarioDTO obtener(String id);
    List<UsuarioDTO> listarTodos();

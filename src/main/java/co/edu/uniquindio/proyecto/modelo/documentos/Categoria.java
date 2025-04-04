package co.edu.uniquindio.proyecto.modelo.documentos;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document("categorias")
public class Categoria {
    @Id
    private ObjectId id;
    private String nombre;
    private String icono; // sino se va a usar, eliminarlo.

    @Builder

    public Categoria(ObjectId id, String nombre, String icono) {
        this.id = id;
        this.nombre = nombre;
        this.icono = icono;
    }
}

package interfaces;

import java.util.List;
import models.Recepcionista;

public interface InterfaceRecepcionista {
    void addRecepcionista(Recepcionista recepcionista);

    void removerRecepcionista(Recepcionista recepcionista);

    void editarRecepcionista(Recepcionista recepcionistaEditado);

    List<Recepcionista> listarRecepcionistas();

    Recepcionista buscarRecepcionistaPorId(int idRecepcionista);
}

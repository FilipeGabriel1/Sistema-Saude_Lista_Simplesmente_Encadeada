package interfaces;

import java.util.List;
import models.Medico;

public interface InterfaceMedico {
    void addMedico(Medico medico);

    void removerMedico(Medico medico);

    void editarMedico(Medico medicoEditado);

    List<Medico> listarMedicos();

    Medico buscarMedicoPorId(int id);
    
}

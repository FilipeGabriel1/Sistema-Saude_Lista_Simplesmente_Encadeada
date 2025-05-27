package interfaces;

import java.util.List;
import models.Consulta;

public interface InterfaceConsulta {
    void addConsulta(Consulta consulta);

    void removerConsulta(Consulta consulta);

    void editarConsulta(Consulta consultaEditado);

    List<Consulta> listarConsultas();

    Consulta buscarConsultaPorId(int idConsulta);

}

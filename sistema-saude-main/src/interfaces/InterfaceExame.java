package interfaces;

import java.util.List;
import models.Exame;

public interface InterfaceExame {
    void addExame(Exame exame);

    void removerExame(Exame exame);

    void editarExame(Exame exameEditado);

    List<Exame> listarExames();

    Exame buscarExamePorId(int idExame);
}

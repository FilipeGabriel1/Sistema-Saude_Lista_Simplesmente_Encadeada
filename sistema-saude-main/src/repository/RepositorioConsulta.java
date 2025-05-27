package repository;

import models.Consulta;
import java.util.ArrayList;
import interfaces.InterfaceConsulta;


public class RepositorioConsulta implements InterfaceConsulta {
    private ArrayList<Consulta> consultaList;

    public RepositorioConsulta() {
        this.consultaList = new ArrayList<>();
    }

    public void addConsulta(Consulta consulta) {
        this.consultaList.add(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        this.consultaList.remove(consulta);
    }

    public void editarConsulta(Consulta consultaEditado) {
        Consulta consultaAntiga = buscarConsultaPorId(consultaEditado.getId());
        if (consultaAntiga !=null) {
            int index = consultaList.indexOf(consultaAntiga);
            consultaList.set(index, consultaEditado);
            
        }
        }
    
    public ArrayList<Consulta> listarConsultas() {
        return consultaList;

        }

    public Consulta buscarConsultaPorId(int idConsulta) {
        for (Consulta consulta : consultaList) {
            if (consulta.getId() == idConsulta) {
                return consulta;
            }
        }
        return null;
    }
}

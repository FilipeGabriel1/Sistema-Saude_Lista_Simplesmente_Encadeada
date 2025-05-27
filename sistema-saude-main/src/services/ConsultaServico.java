package services;

import java.util.ArrayList;
import models.Consulta;
import repository.RepositorioConsulta;

public class ConsultaServico {
    private RepositorioConsulta repositorioConsulta;

    public ConsultaServico() {
        this.repositorioConsulta = new RepositorioConsulta();
    }

    public void addConsulta(Consulta consulta) {
        this.repositorioConsulta.addConsulta(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        this.repositorioConsulta.removerConsulta(consulta);
    }

    public void editarConsulta(Consulta consultaEditado) {
        this.repositorioConsulta.editarConsulta(consultaEditado);
    }

    public ArrayList<Consulta> listarConsultas() {
        return this.repositorioConsulta.listarConsultas();
    }

    public Consulta buscarConsultaPorId(int idConsulta) {
        return this.repositorioConsulta.buscarConsultaPorId(idConsulta);
    }
    

}
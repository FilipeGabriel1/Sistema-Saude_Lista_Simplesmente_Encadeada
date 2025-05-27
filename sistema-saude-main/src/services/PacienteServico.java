package services;

import java.util.ArrayList;
import models.Paciente;
import repository.RepositorioPaciente;

public class PacienteServico {
    
    private RepositorioPaciente repositorioPaciente;

    public PacienteServico() {
        this.repositorioPaciente = new RepositorioPaciente();
    }

    public void addPaciente(Paciente paciente) {
        this.repositorioPaciente.addPaciente(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        this.repositorioPaciente.removerPaciente(paciente);
    }

    public void editarPaciente(Paciente pacienteEditado) {
        this.repositorioPaciente.editarPaciente(pacienteEditado);
    }

    public ArrayList<Paciente> listarPacientes() {
        return this.repositorioPaciente.listarPacientes();
    }

    public Paciente buscarPacientePorId(int idPaciente) {
        return this.repositorioPaciente.buscarPacientePorId(idPaciente);
    }


}

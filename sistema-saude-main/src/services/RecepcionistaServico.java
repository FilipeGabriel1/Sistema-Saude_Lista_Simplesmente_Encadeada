package services;

import java.util.ArrayList;
import models.Recepcionista;
import repository.RepositorioRecepcionista;


public class RecepcionistaServico {
    
    private RepositorioRecepcionista repositorioRecepcionista;

    public RecepcionistaServico() {
        this.repositorioRecepcionista = new RepositorioRecepcionista();
    }

    public void addRecepcionista(Recepcionista recepcionista) {
        this.repositorioRecepcionista.addRecepcionista(recepcionista);
    }

    public void removerRecepcionista(Recepcionista recepcionista) {
        this.repositorioRecepcionista.removerRecepcionista(recepcionista);
    }

    public void editarRecepcionista(Recepcionista recepcionistaEditado) {
        this.repositorioRecepcionista.editarRecepcionista(recepcionistaEditado);
    }

    public ArrayList<Recepcionista> listarRecepcionistas() {
        return this.repositorioRecepcionista.listarRecepcionistas();
    }

    public Recepcionista buscarRecepcionistaPorId(int idConsulta) {
        return this.repositorioRecepcionista.buscarRecepcionistaPorId(idConsulta);
    }
}

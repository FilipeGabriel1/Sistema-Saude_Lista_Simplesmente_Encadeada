package models;

public class Paciente extends Pessoa {
    public int id;
    public Object exames;
    
    public Paciente(String nome, String cpf, String telefone, String email, String senha) {
        super(nome, cpf, telefone, email, senha);

    }
    public Paciente(int id2, String nome) {
        super(nome, "", "", "", "");
        this.id = id2;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

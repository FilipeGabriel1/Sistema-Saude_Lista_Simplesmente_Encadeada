import java.util.Scanner;

public class MainExemploLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        class Paciente {
            private int id;
            private String nome;
            public Paciente(int id, String nome) { this.id = id; this.nome = nome; }
            public int getId() { return id; }
            public String getNome() { return nome; }
            public void setNome(String nome) { this.nome = nome; }
            public String toString() { return "Paciente{id=" + id + ", nome='" + nome + "'}"; }
        }
        class Medico {
            private int id;
            private String nome;
            public Medico(int id, String nome) { this.id = id; this.nome = nome; }
            public int getId() { return id; }
            public String getNome() { return nome; }
            public void setNome(String nome) { this.nome = nome; }
            public String toString() { return "Medico{id=" + id + ", nome='" + nome + "'}"; }
        }
        class Exame {
            private int id;
            private String tipo;
            private Paciente paciente;
            public Exame(int id, String tipo, Paciente paciente) {
                this.id = id; this.tipo = tipo; this.paciente = paciente;
            }
            public int getId() { return id; }
            public String getTipo() { return tipo; }
            public Paciente getPaciente() { return paciente; }
            public void setTipo(String tipo) { this.tipo = tipo; }
            public String toString() {
                return "Exame{id=" + id + ", tipo='" + tipo + "', paciente=" + paciente.getNome() + "}";
            }
        }
        class Consulta {
            private int id;
            private Paciente paciente;
            private Medico medico;
            private String data;
            public Consulta(int id, Paciente paciente, Medico medico, String data) {
                this.id = id; this.paciente = paciente; this.medico = medico; this.data = data;
            }
            public int getId() { return id; }
            public Paciente getPaciente() { return paciente; }
            public Medico getMedico() { return medico; }
            public String getData() { return data; }
            public void setData(String data) { this.data = data; }
            public String toString() {
                return "Consulta{id=" + id + ", paciente=" + paciente.getNome() +
                        ", medico=" + medico.getNome() + ", data='" + data + "'}";
            }
        }

        ListaEncadeadaSimples<Paciente> pacientes = new ListaEncadeadaSimples<>();
        ListaEncadeadaSimples<Medico> medicos = new ListaEncadeadaSimples<>();
        ListaEncadeadaSimples<Consulta> consultas = new ListaEncadeadaSimples<>();
        ListaEncadeadaSimples<Exame> exames = new ListaEncadeadaSimples<>();

        boolean rodando = true;
        while (rodando) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Gerenciar Paciente");
            System.out.println("2. Gerenciar Médico");
            System.out.println("3. Gerenciar Consulta");
            System.out.println("4. Gerenciar Exame");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    boolean gerenciarPaciente = true;
                    while (gerenciarPaciente) {
                        System.out.println("\n--- GERENCIAR PACIENTE ---");
                        System.out.println("1. Adicionar");
                        System.out.println("2. Listar");
                        System.out.println("3. Editar");
                        System.out.println("4. Remover");
                        System.out.println("0. Voltar");
                        System.out.print("Escolha: ");
                        int opP = sc.nextInt(); sc.nextLine();
                        switch (opP) {
                            case 1:
                                System.out.print("ID do paciente: ");
                                int idP = sc.nextInt(); sc.nextLine();
                                System.out.print("Nome do paciente: ");
                                String nomeP = sc.nextLine();
                                pacientes.adicionar(new Paciente(idP, nomeP));
                                System.out.println("Paciente adicionado!");
                                break;
                            case 2:
                                System.out.println("Pacientes:");
                                for (Paciente p : pacientes.listar()) System.out.println(p);
                                break;
                            case 3:
                                System.out.print("ID do paciente para editar: ");
                                int idPEdit = sc.nextInt(); sc.nextLine();
                                Paciente pEdit = pacientes.buscarPorId(idPEdit);
                                if (pEdit != null) {
                                    System.out.print("Novo nome: ");
                                    String novoNome = sc.nextLine();
                                    pacientes.editar(new Paciente(idPEdit, novoNome));
                                    System.out.println("Paciente editado!");
                                } else {
                                    System.out.println("Paciente não encontrado.");
                                }
                                break;
                            case 4:
                                System.out.print("ID do paciente para remover: ");
                                int idPRem = sc.nextInt(); sc.nextLine();
                                if (pacientes.removerPorId(idPRem)) {
                                    System.out.println("Paciente removido!");
                                } else {
                                    System.out.println("Paciente não encontrado.");
                                }
                                break;
                            case 0:
                                gerenciarPaciente = false;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 2:
                    boolean gerenciarMedico = true;
                    while (gerenciarMedico) {
                        System.out.println("\n--- GERENCIAR MÉDICO ---");
                        System.out.println("1. Adicionar");
                        System.out.println("2. Listar");
                        System.out.println("3. Editar");
                        System.out.println("4. Remover");
                        System.out.println("0. Voltar");
                        System.out.print("Escolha: ");
                        int opM = sc.nextInt(); sc.nextLine();
                        switch (opM) {
                            case 1:
                                System.out.print("ID do médico: ");
                                int idM = sc.nextInt(); sc.nextLine();
                                System.out.print("Nome do médico: ");
                                String nomeM = sc.nextLine();
                                medicos.adicionar(new Medico(idM, nomeM));
                                System.out.println("Médico adicionado!");
                                break;
                            case 2:
                                System.out.println("Médicos:");
                                for (Medico m : medicos.listar()) System.out.println(m);
                                break;
                            case 3:
                                System.out.print("ID do médico para editar: ");
                                int idMEdit = sc.nextInt(); sc.nextLine();
                                Medico mEdit = medicos.buscarPorId(idMEdit);
                                if (mEdit != null) {
                                    System.out.print("Novo nome: ");
                                    String novoNome = sc.nextLine();
                                    medicos.editar(new Medico(idMEdit, novoNome));
                                    System.out.println("Médico editado!");
                                } else {
                                    System.out.println("Médico não encontrado.");
                                }
                                break;
                            case 4:
                                System.out.print("ID do médico para remover: ");
                                int idMRem = sc.nextInt(); sc.nextLine();
                                if (medicos.removerPorId(idMRem)) {
                                    System.out.println("Médico removido!");
                                } else {
                                    System.out.println("Médico não encontrado.");
                                }
                                break;
                            case 0:
                                gerenciarMedico = false;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 3:
                    boolean gerenciarConsulta = true;
                    while (gerenciarConsulta) {
                        System.out.println("\n--- GERENCIAR CONSULTA ---");
                        System.out.println("1. Adicionar");
                        System.out.println("2. Listar");
                        System.out.println("3. Editar");
                        System.out.println("4. Remover");
                        System.out.println("0. Voltar");
                        System.out.print("Escolha: ");
                        int opC = sc.nextInt(); sc.nextLine();
                        switch (opC) {
                            case 1:
                                System.out.print("ID da consulta: ");
                                int idC = sc.nextInt(); sc.nextLine();
                                System.out.print("ID do paciente: ");
                                int idPC = sc.nextInt(); sc.nextLine();
                                System.out.print("ID do médico: ");
                                int idMC = sc.nextInt(); sc.nextLine();
                                System.out.print("Data (yyyy-mm-dd): ");
                                String data = sc.nextLine();
                                Paciente pac = pacientes.buscarPorId(idPC);
                                Medico med = medicos.buscarPorId(idMC);
                                if (pac != null && med != null) {
                                    consultas.adicionar(new Consulta(idC, pac, med, data));
                                    System.out.println("Consulta adicionada!");
                                } else {
                                    System.out.println("Paciente ou médico não encontrado.");
                                }
                                break;
                            case 2:
                                System.out.println("Consultas:");
                                for (Consulta c : consultas.listar()) System.out.println(c);
                                break;
                            case 3:
                                System.out.print("ID da consulta para editar: ");
                                int idCEdit = sc.nextInt(); sc.nextLine();
                                Consulta cEdit = consultas.buscarPorId(idCEdit);
                                if (cEdit != null) {
                                    System.out.print("Nova data (yyyy-mm-dd): ");
                                    String novaData = sc.nextLine();
                                    consultas.editar(new Consulta(idCEdit, cEdit.getPaciente(), cEdit.getMedico(), novaData));
                                    System.out.println("Consulta editada!");
                                } else {
                                    System.out.println("Consulta não encontrada.");
                                }
                                break;
                            case 4:
                                System.out.print("ID da consulta para remover: ");
                                int idCRem = sc.nextInt(); sc.nextLine();
                                if (consultas.removerPorId(idCRem)) {
                                    System.out.println("Consulta removida!");
                                } else {
                                    System.out.println("Consulta não encontrada.");
                                }
                                break;
                            case 0:
                                gerenciarConsulta = false;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 4:
                    boolean gerenciarExame = true;
                    while (gerenciarExame) {
                        System.out.println("\n--- GERENCIAR EXAME ---");
                        System.out.println("1. Adicionar");
                        System.out.println("2. Listar");
                        System.out.println("3. Editar");
                        System.out.println("4. Remover");
                        System.out.println("0. Voltar");
                        System.out.print("Escolha: ");
                        int opE = sc.nextInt(); sc.nextLine();
                        switch (opE) {
                            case 1:
                                System.out.print("ID do exame: ");
                                int idE = sc.nextInt(); sc.nextLine();
                                System.out.print("Tipo do exame: ");
                                String tipo = sc.nextLine();
                                System.out.print("ID do paciente: ");
                                int idPE = sc.nextInt(); sc.nextLine();
                                Paciente pacE = pacientes.buscarPorId(idPE);
                                if (pacE != null) {
                                    exames.adicionar(new Exame(idE, tipo, pacE));
                                    System.out.println("Exame adicionado!");
                                } else {
                                    System.out.println("Paciente não encontrado.");
                                }
                                break;
                            case 2:
                                System.out.println("Exames:");
                                for (Exame e : exames.listar()) System.out.println(e);
                                break;
                            case 3:
                                System.out.print("ID do exame para editar: ");
                                int idEEdit = sc.nextInt(); sc.nextLine();
                                Exame eEdit = exames.buscarPorId(idEEdit);
                                if (eEdit != null) {
                                    System.out.print("Novo tipo: ");
                                    String novoTipo = sc.nextLine();
                                    exames.editar(new Exame(idEEdit, novoTipo, eEdit.getPaciente()));
                                    System.out.println("Exame editado!");
                                } else {
                                    System.out.println("Exame não encontrado.");
                                }
                                break;
                            case 4:
                                System.out.print("ID do exame para remover: ");
                                int idERem = sc.nextInt(); sc.nextLine();
                                if (exames.removerPorId(idERem)) {
                                    System.out.println("Exame removido!");
                                } else {
                                    System.out.println("Exame não encontrado.");
                                }
                                break;
                            case 0:
                                gerenciarExame = false;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 0:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
        System.out.println("Programa encerrado.");
    }
}
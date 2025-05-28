# Sistema de Saúde — Lista Simplesmente Encadeada

Este projeto é um sistema de gerenciamento para uma clínica de saúde, desenvolvido em Java. Ele permite o cadastro, edição, remoção e listagem de pacientes, médicos, recepcionistas, exames e consultas, utilizando listas simplesmente encadeadas para armazenamento em memória (não há persistência em banco de dados).

## Autores

- Filipe Gabriel Dutra Meves
- Maria Iasmin Clementino da Silva

## Funcionalidades

- Cadastro, edição, remoção e listagem de:
  - Pacientes
  - Médicos
  - Recepcionistas
  - Exames
  - Consultas

- Estrutura de dados baseada em lista simplesmente encadeada ([ListaEncadeadaSimples.java](src/ListaEncadeadaSimples.java))
- Interface de linha de comando para gerenciamento das entidades ([MainExemploLista.java](src/MainExemploLista.java))

## Estrutura do Projeto

- **src/models/**: Classes das entidades do sistema (`Paciente`, `Medico`, `Recepcionista`, `Exame`, `Consulta`, `Pessoa`)
- **src/services/**: Camada de lógica de negócio para cada entidade
- **src/repository/**: Repositórios responsáveis pelo armazenamento em memória das entidades
- **src/interfaces/**: Interfaces para os repositórios
- **src/ListaEncadeadaSimples.java**: Implementação da lista simplesmente encadeada genérica
- **src/MainExemploLista.java**: Exemplo de uso do sistema via linha de comando

## Como Executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/FilipeGabriel1/sistema-saude.git
   ```


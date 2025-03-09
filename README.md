# Sistema de Gerenciamento de Contatos

Este projeto é um sistema simples de gerenciamento de contatos desenvolvido em Java. Ele permite adicionar, listar, buscar e remover contatos, além de persistir os dados em um arquivo CSV.

## Funcionalidades

* Adicionar novos contatos com nome, telefone e e-mail.
* Listar todos os contatos.
* Buscar contatos por nome.
* Remover contatos.
* Persistência de dados em arquivo CSV.

## Como Executar

1.  Clone o repositório:

    ```bash
    git clone [https://github.com/dolthub/dolt](https://github.com/dolthub/dolt)
    ```

2.  Compile o código Java:

    ```bash
    javac Main.java Contato.java ContatoService.java ContatoPersistence.java ContatoUI.java
    ```

3.  Execute o programa:

    ```bash
    java Main
    ```

## Estrutura do Projeto

* `Main.java`: Classe principal que inicia a aplicação.
* `Contato.java`: Classe que representa a entidade "Contato".
* `ContatoService.java`: Classe que contém a lógica de negócio para manipulação dos contatos.
* `ContatoPersistence.java`: Classe responsável pela persistência dos dados em arquivo CSV.
* `ContatoUI.java`: Classe que fornece a interface de linha de comando para interação com o usuário.

## Persistência de Dados

Os dados dos contatos são armazenados em um arquivo chamado `contatos.csv` no mesmo diretório do programa. Cada linha do arquivo representa um contato, com os campos separados por vírgula (nome, telefone, e-mail).

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorar o projeto.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

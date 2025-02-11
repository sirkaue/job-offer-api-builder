# Projeto de Prática: Padrão de Design Builder

Este é um projeto simples criado com Spring Boot para demonstrar como funciona o padrão de design Builder. A ideia
principal é gerenciar ofertas de emprego e permitir a construção de objetos complexos, como ofertas de emprego, usando o
padrão Builder, sem a necessidade de banco de dados.

## Objetivos

- **Praticar o padrão de design Builder**: Demonstrar como usar este padrão para criar objetos complexos de forma clara
  e modular.
- **Construção de objetos**: Utilizar o padrão Builder para criar ofertas de emprego com diferentes parâmetros, mantendo
  a clareza e a flexibilidade.
- **API REST**: Criar uma API REST simples para expor os métodos de criação de ofertas de emprego.
- **Sem banco de dados**: O projeto não utiliza banco de dados, apenas manipula os dados na memória de forma simples e
  eficaz.

## Arquitetura do Projeto

O projeto está organizado em camadas para manter uma estrutura limpa e modular:

### Estrutura de Pastas

```
src/
└── main/
    ├── java/
    │   └── com/
    │       └── sirkaue/
    │           └── jobofferapibuilder/
    │               ├── builder/
    │               │   ├── JobOfferBuilder.java        # Abstração do Builder
    │               │   └── JobOfferBuilderImpl.java   # Implementação do Builder
    │               ├── controller/
    │               │   └── JobOfferController.java     # Controlador da API
    │               ├── dto/
    │               │   └── JobOfferDto.java           # DTO de oferta de emprego
    │               ├── model/
    │               │   └── JobOffer.java              # Modelo de oferta de emprego
    │               ├── service/
    │               │   ├── JobOfferService.java        # Interface do serviço de oferta de emprego
    │               │   └── JobOfferServiceImpl.java    # Implementação do serviço de oferta de emprego
    │               └── JobOfferApiApplication.java     # Classe principal
    └── resources/
        └── application.properties                     # Configurações do Spring Boot
```

## Componentes Principais

### Controller:

- **JobOfferController**: Exponibiliza a API REST para criar ofertas de emprego.

### Model:

- **JobOffer**: Representa o modelo de oferta de emprego com detalhes como título, descrição, requisitos e salário.

### DTO:

- **JobOfferDto**: Representa o DTO para transporte de dados de uma oferta de emprego.

### Service:

- **JobOfferService**: Interface que define as operações relacionadas às ofertas de emprego.
- **JobOfferServiceImpl**: Implementação da interface com a construção das ofertas usando o Builder.

### Builder:

- **JobOfferBuilder**: Abstração do padrão Builder para criação de ofertas de emprego.
- **JobOfferBuilderImpl**: Implementação concreta do Builder para construir ofertas de emprego.

### Aplicativo Principal:

- **JobOfferApiApplication**: Classe principal que inicializa o aplicativo Spring Boot.

## Endpoints Disponíveis

### 1. Criar uma oferta de emprego

**Endpoint:** POST `/api/joboffers`

**Requisição:**

```json
{
  "title": "Desenvolvedor Backend",
  "description": "Responsável pelo desenvolvimento de APIs",
  "salary": 5000.0,
  "location": "Remoto"
}

```

**Resposta:**

```json
{
  "title": "Desenvolvedor Backend",
  "description": "Responsável pelo desenvolvimento de APIs",
  "salary": 5000.0,
  "location": "Remoto"
}
```

## Como Executar o Projeto

1. **Pré-requisitos**:

    - Java 17+
    - Maven

2. **Clonar o repositório**:

   ```bash
   git clone https://github.com/seuusuario/joboffer-api-builder.git
   ```

3. **Compilar e executar o projeto**:

```bash
mvn spring-boot:run
```

4. **Acessar os endpoints**:
    - Abra um cliente REST (como Postman ou Insomnia) ou use o navegador.
    - Utilize os endpoints descritos acima.

## Conclusão

Este projeto é um exemplo prático de como aplicar o padrão Builder em uma aplicação com Spring Boot. Ele demonstra como
criar objetos complexos, como ofertas de emprego, de forma simples e eficaz, sem depender de um banco de dados. Sinta-se
à vontade para expandir este projeto, adicionando novos parâmetros, validações ou persistência com banco de dados!
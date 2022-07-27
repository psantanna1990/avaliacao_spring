# Avaliação Spring

Pré-requisitos para execução:

- Docker
- Docker Compose
- Postman

Tecnologias utilizadas:

- Spring
- MongoDB
    base NoSQL preferida pelos componentes do grupo pela simplicidade, facilidade de uso e ausência de frescura pra inserir e manipular dados
- OpenAPI (Swagger)

## Utilizando a aplicação

Basta utilizar o comando `docker-compose up`

A Aplicação possui uma rota responsável por efetuar o cadastro inicial dos alunos.

O arquivo texto com a carga inicial já está na raiz do repositório.

Chamar a rota: **/cadastro** com o método **POST**

## Swagger da aplicação

O swagger pode ser encontrad na seguinte rota:

<http://localhost:8989/swagger-ui.html#/>

## Enunciado da Avaliação

A FIAP resolveu criar seu próprio cartão de crédito para ser utilizado pelos
alunos e para isso necessita de um sistema para gerenciamento e
integração com outras empresas.

Desenvolva este sistema com os seguintes requisitos:

RF1 - Cadastro de Alunos

RF2 - O cadastro inicial dos potenciais clientes do cartão será realizado via
integração com um arquivo .txt disponibilizado
<https://drive.google.com/open?id=19ILqrYjOEe4C840ZRwhKDauvhDZCKcWa>

RF3 - As compras realizadas nos cartões dos clientes serão recebidas via
integração com uma Autorizadora. Criar os endpoints necessários para
receber as realizações de transações.

RF4 - Deve ser possível gerar um extrato via download (endpoint) ou
enviado no email do cliente (pode escolher uma opção).

RNF1 - Utilizar o Spring Framework.

RNF2 - Criar um arquivo readme.md com as instruções para subir o/os
projeto/s.

RNF3 - Criar testes unitários e integrados para o/os projeto/s.

RNF4 - Gerar uma massa simulada de transações.

RNF5 - Documentação Swagger.

Não é necessário criar nenhuma tela/front-end e nem fazer o deploy dos
serviços (mas também não é proibido).

A escolha das ferramentas é livre (banco de dados, container etc), mas
devem ser justificadas no readme.

## Equipe

Carlos Mateus Borges Junior - RM344974

Daniel de Oliveira Carvalho - RM344795

Pedro Sant Anna Lima Oliveira - RM344804

Willian Prestes Correia Cellos - RM344812

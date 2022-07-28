# Avaliação Spring

## Pré-requisitos para execução

Assegure-se de que estas ferramentas estão instaladas e funcionando:

- Docker
- Docker Compose
- Postman

## Tecnologias extras utilizadas e justificativas pertinentes

- **Docker**

> evita o "mas na minha máquina funciona, garante um ambiente de execução homogêneo e fácil de distribuir.

- **MongoDB**

> base NoSQL preferida pelos componentes do grupo pela simplicidade, facilidade de uso e ausência de frescura pra inserir e manipular dados

## Utilizando a aplicação

1 - Navegar até a raíz do projeto

2 - Executar comando `docker-compose up`

3 - Chamar endpoint `\cadastro` com o método `POST` para automagicamente fazer o cadastro inicial dos alunos conforme txt disponibilizado.

4 - Chamar endpoint `\batch` com o método `POST` para fazer a inserção em massa de transações simuladas.

Os arquivos texto com as cargas iniciais já estão na raiz do repositório.

5 - Usando `POST`, o endpoint `\novo` cadastra um novo aluno mediante payload em json com os dados básicos.

6 - Usando `GET`, o endpoint `\extrato` obtém todas as transações efetuadas pelo cartão informado no parâmetro `cartao`.

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

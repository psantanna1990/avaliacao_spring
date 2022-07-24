# Avaliação Spring

Pré-requisito:

- Docker
- Postman

## Utilizando a apliação

`Basta utilizar o comando docker-compose up --build`

A Aplicação possui uma Service que roda na inicialização responsável por fazer o pré cadastro dos alunos,
para efetuar o pre-cadastro favor adicionar o arquivo com os dados para o pré castro na raiz do projeto com o nome:
**lista_alunos.txt**

## Enunciado da Avaliação

A FIAP resolveu criar seu próprio cartão de crédito para ser utilizado pelos
alunos e para isso necessita de um sistema para gerenciamento e
integração com outras empresas. Desenvolva este sistema com os
seguintes requisitos:
RF1 - Cadastro de Alunos
RF2 - O cadastro inicial dos potenciais clientes do cartão será realizado via
integração com um arquivo .txt disponibilizado
https://drive.google.com/open?id=19ILqrYjOEe4C840ZRwhKDauvhDZCKc
Wa
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
RNF5 - Documentação Swagger
Não é necessário criar nenhuma tela/front-end e nem fazer o deploy dos
serviços (mas também não é proibido).
A escolha das ferramentas é livre (banco de dados, container etc), mas
devem ser justificadas no readme.m

## Equipe

Carlos Mateus Borges Junior - RM344974

Daniel de Oliveira Carvalho - RM344795

Pedro Sant Anna Lima Oliveira - RM344804

Willian Prestes Correia Cellos - RM344812

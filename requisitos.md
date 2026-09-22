**Especificação de Requisitos: Simulador de Caixa Eletrônico**

## 1. Introdução
Este documento descreve os requisitos para o desenvolvimento de um Simulador de Caixa Eletrônico (ATM). O objetivo do projeto é consolidar conceitos de variáveis, entrada/saída de dados, estruturas condicionais e estruturas de repetição em Java.

## 2. Definição de Requisitos de Usuário 
Os requisitos de usuário são declarações descritas em linguagem natural sobre quais serviços o sistema fornecerá e as restrições com as quais deve operar.

- O sistema deve exibir um menu interativo com opções para o cliente verificar seu saldo, realizar depósitos, efetuar saques ou encerrar a sessão.
- O sistema deve funcionar de forma contínua, permitindo múltiplas operações na mesma sessão até que o cliente escolha a opção de sair.
- O sistema deve impedir saques que deixem o saldo negativo e depósitos de valores inválidos.

## 3. Especificação de Requisitos do Sistema 
Os requisitos de sistema fornecem uma descrição mais detalhada das funções do sistema de software, servindo como base para a implementação pelos desenvolvedores.

### 3.1 Requisitos Funcionais (RF) 
Os requisitos funcionais declaram os serviços que o sistema deve fornecer e como ele deve se comportar diante de determinadas entradas.

- **RF01:** O sistema deve iniciar declarando uma variável de saldo inicializada em 0.0.
- **RF02:** O sistema deve apresentar um menu com as opções: 1 - Consultar Saldo, 2 - Realizar Depósito, 3 - Realizar Saque, 4 - Sair.
- **RF03:** O sistema deve utilizar uma estrutura de repetição (do-while ou while) para que o menu seja reapresentado automaticamente ao final de cada operação, sendo interrompido apenas quando a opção 4 for selecionada.
- **RF04:** O sistema deve ler a entrada do usuário por meio da classe Scanner.
- **RF05:** Caso a opção 1 seja escolhida, o sistema deve imprimir na tela o valor da variável de saldo formatada.
- **RF06:** Caso a opção 2 seja escolhida, o sistema deve solicitar um valor de depósito. Se o valor for maior que zero, ele deve ser somado ao saldo. Se for menor ou igual a zero, deve exibir uma mensagem de erro ("Valor inválido").
- **RF07:** Caso a opção 3 seja escolhida, o sistema deve solicitar o valor do saque. O sistema só deve subtrair este valor da variável saldo se o valor solicitado for menor ou igual ao saldo atual. Caso contrário, deve exibir a mensagem "Saldo insuficiente".
- **RF08:** Caso o usuário digite um número de opção que não esteja entre 1 e 4, o sistema deve exibir a mensagem "Opção Inválida" e solicitar a entrada novamente.

### 3.2 Requisitos Não Funcionais (RNF) 
Os requisitos não funcionais especificam restrições sobre a implementação do sistema ou restrições no processo de desenvolvimento.

- **RNF01 (Requisito de Processo de Desenvolvimento):** O código deve ser escrito integralmente na linguagem de programação Java, compilável a partir da versão padrão (JDK 8 ou superior).
- **RNF02 (Requisito Organizacional/Restrição):** A interface do sistema deve ser operada de forma estritamente textual via console/terminal, não devendo ser utilizadas bibliotecas gráficas.
- **RNF03 (Requisito de Eficiência/Design):** Como restrição de escopo de aprendizagem, o sistema não precisa utilizar persistência de dados (Banco de Dados) e pode ser contido integralmente no método principal (main).

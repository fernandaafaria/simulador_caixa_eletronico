Simulador de Caixa Eletrônico (ATM)


**Aviso:** O documento original com a Especificação de Requisitos completa (RFs e RNFs) pode ser acessado [clicando aqui](./REQUISITOS.md).

**Sobre o Projeto**
Este projeto é um Simulador de Caixa Eletrônico operado estritamente via terminal/console. Ele foi desenvolvido como Projeto Integrador para o curso de Desenvolvimento de Sistemas do **SENAI**, com o objetivo principal de unir a teoria e a prática de duas disciplinas fundamentais:

1. **Levantamento de Requisitos:** Onde aprendemos a ler, interpretar e estruturar um documento formal de Especificação de Requisitos (separando Requisitos Funcionais e Não Funcionais).
2. **Lógica de Programação e Algoritmos:** Onde utilizamos a base da programação estruturada para traduzir esse documento em um código robusto, seguro e funcional.

**Funcionalidades Implementadas (Requisitos Funcionais)**
O sistema conta com um menu interativo em loop (do-while) que oferece as seguintes opções:
- **[1] Consultar Saldo:** Exibe o saldo atualizado e formatado com duas casas decimais.
- **[2] Realizar Depósito:** Permite adicionar fundos, com validação de segurança para barrar valores menores ou iguais a zero.
- **[3] Realizar Saque:** Permite retirar fundos, validando se o cliente possui saldo suficiente e impedindo saques negativos.
- **[4] Sair:** Encerra a sessão do cliente de forma segura.

**Tecnologias e Estruturas Utilizadas**
- **Java (JDK 8+):** Linguagem de programação base (RNF01).
- **Classe Scanner:** Para leitura dinâmica de dados via teclado.
- **do-while:** Para garantir o funcionamento contínuo do menu até o comando de saída.
- **switch case:** Para o roteamento eficiente e limpo das opções do menu.
- **if / else if:** Para a construção dos algoritmos de validação das lógicas de saques e depósitos.

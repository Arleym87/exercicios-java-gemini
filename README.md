Integração Nativa com Google Gemini em Java

Este repositório contém uma implementação limpa e robusta em Java para integração com a API do Google Gemini. O foco deste projeto é demonstrar como realizar chamadas de inteligência artificial de forma nativa, eliminando a necessidade de dependências externas ou SDKs complexos.

Diferenciais do Projeto

Arquitetura Leve: Utiliza estritamente as bibliotecas nativas do Java (`HttpClient`, `HttpRequest`, `HttpResponse`), garantindo maior performance e portabilidade.
Modelo de Última Geração: Configurado para utilizar o modelo estável `gemini-2.5-flash`, ideal para respostas rápidas e eficientes.
Sem Bloqueios de Compilação: Ao contornar o uso de SDKs em constante atualização, o código evita problemas comuns de métodos depreciados ou indisponibilidade de pacotes nos repositórios centrais.

Tecnologias Utilizadas

Linguagem: Java 17
IDE: Eclipse IDE
Protocolo: HTTP/2 (via cliente nativo do pacote `java.net.http`)
Formato de Dados: JSON

Como Executar o Projeto
Pré-requisitos
Possuir o Java 17 (ou superior) instalado na máquina.
Uma Chave de API (API Key) válida gerada no Google AI Studio.

Passo a Passo

Clonar o repositório:
    ```bash
    git clone [https://github.com/Arleym87/exercicios-java-gemini.git](https://github.com/Arleym87/exercicios-java-gemini.git)
    cd exercicios-java-gemini
    ```

Configurar a Chave de API:
    Abra o ficheiro `Main.java` e substitua o valor da variável `apiKey` pela sua chave real:
    ```java
    String apiKey = "SUA_CHAVE_AQUI";
    ```

Executar a aplicação:
    Abra o projeto na sua IDE de preferência (como o Eclipse) e execute a classe `Main.java` como uma **Java Application**. A resposta gerada pelo Gemini será exibida diretamente no Console.


Nota de Segurança

> [!WARNING]
> Nunca envie a sua Chave de API ativa para repositórios públicos no GitHub. Recomenda-se manter este repositório configurado como **Privado** ou utilizar variáveis de ambiente para gerir credenciais sensíveis em ambientes de produção.

---
Desenvolvido como parte dos meus estudos práticos de programação e lógica aplicada. 🚀

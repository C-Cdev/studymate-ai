# 🧠 StudyMate AI - Backend API

Uma API RESTful desenvolvida em Java com Spring Boot, projetada para se comunicar com a inteligência artificial do Google Gemini. Este projeto serve como back-end para um assistente de estudos virtual, um chatbot no caso.

Projeto gerado inicialmente através do [Spring Initializr](https://start.spring.io/).

## 🚀 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.x**
* **Spring Web** (Criação da API REST)
* **Spring AI** (Integração simplificada com modelos de IA Generativa)
* **Maven** (Gerenciamento de dependências)

## 🛠️ Como executar este projeto localmente

Para clonar e executar este aplicativo, você precisará do [Git](https://git-scm.com), [Java 21](https://www.oracle.com/java/technologies/downloads/) e do Maven instalados em sua máquina. 

Além disso, você precisará de uma Chave de API do Google Gemini.

### 1. Obtendo a Chave da API
1. Acesse o [Google AI Studio](https://aistudio.google.com/).
2. Faça login e gere a sua API Key.

Escolhi o google porque é a única LLM que tem versões gratuitas de API, mesmo que limitadas.

### 2. Rodando a aplicação
Abra o seu terminal (PowerShell, Bash, etc.), clone o repositório e injete a sua chave de API nas variáveis de ambiente **antes** de rodar o servidor.

```bash
# Clone este repositório
$ git clone [https://github.com/SEU_USUARIO/studymate-ai.git](https://github.com/SEU_USUARIO/studymate-ai.git)

# Acesse a pasta do projeto
$ cd studymate-ai

# Configure a Variável de Ambiente com a sua Chave de API
# No PowerShell (Windows):
$ $env:GEMINI_API_KEY="AIzaSy...sua-chave-aqui"
# No Linux/Mac:
$ export GEMINI_API_KEY="AIzaSy...sua-chave-aqui"

# Inicie o servidor
$ ./mvnw spring-boot:run

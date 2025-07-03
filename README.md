# 🎬 ScreenMatch

> Projeto desenvolvido durante o curso de **Orientação a Objetos com Java** da Alura

## 📋 Sobre o Projeto

O **ScreenMatch** é um sistema de gerenciamento de filmes e séries que demonstra os conceitos fundamentais de **Programação Orientada a Objetos** em Java. O projeto simula uma plataforma de streaming, permitindo cadastrar, avaliar e calcular tempos de visualização de diferentes tipos de conteúdo.

## 🚀 Funcionalidades

- ✅ **Cadastro de Filmes e Séries** com informações completas
- ⭐ **Sistema de Avaliação** com cálculo de média
- ⏱️ **Calculadora de Tempo** para maratonas
- 🎯 **Sistema de Recomendação** baseado em classificações
- 📊 **Ficha Técnica** detalhada dos títulos
- 📺 **Gerenciamento de Episódios** com visualizações

## 🏗️ Arquitetura do Projeto

### 📁 Estrutura de Pacotes

```
src/
├── br/dev/brunoalves/screenmatch/
│   ├── modelos/
│   │   ├── Titulo.java          # Classe base abstrata
│   │   ├── Filme.java           # Herda de Titulo
│   │   ├── Serie.java           # Herda de Titulo
│   │   └── Episodio.java        # Implementa Classificavel
│   └── calculos/
│       ├── Classificavel.java   # Interface
│       ├── CalculadoraDeTempo.java
│       └── FiltroRecomendacao.java
└── Principal.java               # Classe principal
```

### 🎯 Conceitos de POO Implementados

| Conceito           | Implementação                                         |
| ------------------ | ----------------------------------------------------- |
| **Herança**        | `Filme` e `Serie` herdam de `Titulo`                  |
| **Interface**      | `Classificavel` implementada por `Filme` e `Episodio` |
| **Polimorfismo**   | `CalculadoraDeTempo` aceita qualquer `Titulo`         |
| **Encapsulamento** | Atributos privados com getters/setters                |
| **Abstração**      | Classe base `Titulo` com métodos comuns               |

## 🛠️ Como Executar

### Pré-requisitos

- Java JDK 8 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Passos para Execução

1. **Clone o repositório**

   ```bash
   git clone https://github.com/seu-usuario/screenmatch.git
   cd screenmatch
   ```

2. **Compile o projeto**

   ```bash
   javac -d bin src/**/*.java src/Principal.java
   ```

3. **Execute a aplicação**
   ```bash
   java -cp bin Principal
   ```

## 📖 Exemplo de Uso

O programa demonstra:

```java
// Criando um filme
Filme meuFilme = new Filme();
meuFilme.setNome("O Poderoso Chefão");
meuFilme.setAnoDeLancamento(1970);
meuFilme.setDuracaoEmMinutos(180);

// Avaliando o filme
meuFilme.avalia(8);
meuFilme.avalia(5);
meuFilme.avalia(10);

// Exibindo ficha técnica
meuFilme.exibeFichaTecnica();
System.out.println("Média: " + meuFilme.pegaMedia());
```

## 🎓 Aprendizados do Curso

Este projeto foi desenvolvido durante o curso **"Java: Orientação a Objetos"** da Alura, onde foram abordados:

- ✅ **Classes e Objetos** - Criação e manipulação
- ✅ **Atributos e Métodos** - Encapsulamento de dados
- ✅ **Herança** - Reutilização de código
- ✅ **Interfaces** - Contratos e polimorfismo
- ✅ **Polimorfismo** - Flexibilidade no código
- ✅ **Sobrescrita de Métodos** - Personalização de comportamentos

## 📊 Exemplo de Saída

```
Nome do filme: O Poderoso Chefão
Ano de lançamento: 1970
Duração do filme: 180
Total de Avaliações: 3
Média: 7.67
===========================
Nome da série: Lost
Ano de lançamento: 2000
Duração para maratonar Lost: 5000
===========================
Tempo total para maratonar: 5380 minutos
===========================
Muito bem avaliado no momento
```

## 🤝 Contribuindo

Este é um projeto educacional desenvolvido durante o curso da Alura. Contribuições são bem-vindas para melhorar o código ou adicionar novas funcionalidades!

1. Faça um Fork do projeto
2. Crie uma Branch para sua Feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a Branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**Bruno Alves**

- GitHub: [@vespidhook](https://github.com/vespidhook)
- LinkedIn: [Bruno Alves](https://www.linkedin.com/in/brunoalvesilva/)

---

<div align="center">
  <p>Desenvolvido com ❤️ durante o curso da <a href="https://www.alura.com.br">Alura</a></p>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/OOP-Object--Oriented--Programming-blue?style=for-the-badge" alt="OOP">
</div>

<div align="center">

# Oficina Java | Monitoria

**Anotações, exercícios e estudos de Java**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Status](https://img.shields.io/badge/status-concluído-success?style=for-the-badge)
![Período](https://img.shields.io/badge/período-outubro_de_2026-blue?style=for-the-badge)

*Do `System.out.println` às primeiras classes: meus estudos de Java, em um só lugar.*

</div>

---

## Sobre o projeto

Este repositório reúne o conteúdo da **Oficina/Monitoria de Java**: anotações, exercícios resolvidos e estudos produzidos ao longo da oficina. O conteúdo vai dos fundamentos da linguagem até a introdução à Orientação a Objetos.

**Período de realização:** Outubro de 2026.

> 💡 O objetivo é praticar a programação em Java e deixar o aprendizado documentado, versionado e acessível.

---

## 📂 Estrutura

```
Oficina_Java/
├── 📁 Atividades_Monitoria_JAVA/
│   ├── ☕ Arrays.java
│   ├── ☕ Busca.java
│   ├── ☕ ExercicioScanner1.java
│   ├── ☕ ExercicioScanner2.java
│   ├── ☕ HelloWorld.java
│   ├── ☕ Percurso.java
│   └── ☕ SomaMedia.java
├── 📁 Estudo_Pessoal/
│   └── ☕ Testes.java
└── 📄 README.md
```

---

## O que foi estudado

| Tema | Conceitos |
|---|---|
| **Fundamentos** | JDK, JVM, variáveis, tipos de dados, operadores |
| **Entrada de dados** | `Scanner`, leitura de valores digitados pelo usuário |
| **Estruturas condicionais** | `if`, `else`, `switch` |
| **Estruturas de repetição** | `for`, `while`, `do while` |
| **Arrays e Strings** | declaração, índices, percorrer, métodos de `String` |
| **Métodos** | parâmetros, retorno, reaproveitamento de código |
| **Orientação a Objetos** *(iniciado)* | classes, objetos, atributos, construtores, encapsulamento |

---

## Checklist do conteúdo

<!-- PARA EDITAR: [x] = concluído, [ ] = pendente. Para incluir um tópico novo, copie uma linha e altere o texto. -->

- [x] Introdução ao Java, JDK e JVM
- [x] Variáveis, tipos de dados e operadores
- [x] Entrada de dados com `Scanner`
- [x] Estruturas condicionais (`if`, `else`, `switch`)
- [x] Estruturas de repetição (`for`, `while`, `do while`)
- [x] Arrays e Strings
- [x] Métodos
- [ ] Orientação a Objetos (classes, objetos, encapsulamento) — *iniciado*

---

## Como executar

Pré-requisito: ter o **JDK** instalado. Para conferir:

```bash
java -version
```

Compilando e executando um arquivo:

```bash
# 1. Compilar
javac NomeDoArquivo.java

# 2. Executar
java NomeDoArquivo
```

Exemplo básico:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

## Resumo rápido da sintaxe

<details>
<summary><b>🔧 Básicos</b></summary>

| Código | O que faz |
|---|---|
| `int idade = 20;` | Declara uma variável inteira |
| `double nota = 8.5;` | Declara um número decimal |
| `String nome = "Theo";` | Declara um texto |
| `boolean ativo = true;` | Declara um valor verdadeiro/falso |
| `System.out.println(x);` | Imprime na tela |

</details>

<details>
<summary><b>🌿 Condicionais e repetição</b></summary>

```java
// Condicional
if (nota >= 7) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}

// Repetição
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

</details>

<details>
<summary><b>📦 Arrays e métodos</b></summary>

```java
// Array
int[] numeros = {1, 2, 3};
System.out.println(numeros.length);

// Método
static int somar(int a, int b) {
    return a + b;
}
```

</details>

<details>
<summary><b>🧱 Orientação a Objetos</b></summary>

```java
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

Pessoa p = new Pessoa("Theo");
```

</details>

---

## Tecnologias

- **Java** — linguagem de programação
- **Git** — controle de versão
- **GitHub** — hospedagem e colaboração
- **Markdown** — documentação

---

## Autor

**Theo Xavier**
Estudante de Engenharia de Software no CEUB

| | |
|---|---|
| **RA:** | `22650114` |
| **E-mail institucional:** | [theo.xavier@sempreceub.com](mailto:theo.xavier@sempreceub.com) |
| | |

[![GitHub](https://img.shields.io/badge/GitHub-devxaviier-181717?style=flat-square&logo=github)](https://github.com/devxaviier)

---

<div align="center">

Obrigado por visitar meu repositório, é um prazer te ter por aqui!

Espero que este conteúdo seja útil para seus estudos. Se te ajudou, considere deixar uma ⭐ para apoiar o projeto.

</div>

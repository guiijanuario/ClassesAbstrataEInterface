# Exercicios de Classe Abstrata e Interface - Catalisa


## <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> O que é classe abstrata e interface?

Em Java, tanto as classes abstratas quanto as interfaces são mecanismos de programação que permitem definir contratos ou modelos para outras classes seguirem. No entanto, existem diferenças significativas entre esses dois conceitos. Vou explicar cada um deles:

### Classe Abstrata:
Uma classe abstrata é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar objetos diretamente a partir dela. Ela é projetada para ser uma classe base ou superclasse para outras classes derivadas. A principal finalidade de uma classe abstrata é fornecer uma implementação parcial ou completa de um comportamento comum que as classes derivadas podem herdar e estender. Algumas características das classes abstratas são:

- Elas podem conter métodos abstratos, que são métodos declarados sem implementação. Esses métodos devem ser implementados pelas classes derivadas.
- Elas também podem conter métodos concretos (com implementação) que podem ser herdados e usados pelas classes derivadas.
- Uma classe abstrata pode ter construtores, atributos e métodos não abstratos.
- Uma classe derivada só pode estender uma única classe abstrata.

### Interface:
Uma interface em Java é um contrato que define um conjunto de métodos que uma classe deve implementar. Ela é completamente abstrata, o que significa que não pode conter implementações de métodos ou atributos de instância. Algumas características das interfaces são:

- Elas podem conter apenas métodos abstratos e constantes (atributos estáticos finais).
- Uma classe pode implementar várias interfaces, permitindo que ela forneça a implementação de múltiplos contratos.
- As interfaces podem ser usadas para alcançar o polimorfismo, onde uma referência de interface pode se referir a várias classes diferentes que implementam essa interface.
- A partir do Java 8, as interfaces podem conter métodos padrão (default methods) e métodos estáticos que fornecem implementações padrão para os métodos. Esses recursos permitem a evolução de interfaces sem quebrar a compatibilidade com versões anteriores.

Resumindo, enquanto uma classe abstrata é uma classe parcialmente implementada que pode ser estendida por outras classes, uma interface é um contrato que uma classe deve seguir, definindo quais métodos ela deve implementar. As interfaces fornecem um alto nível de abstração e flexibilidade, permitindo a implementação de múltiplos contratos e o uso de polimorfismo, enquanto as classes abstratas fornecem uma implementação parcial de um comportamento comum para classes derivadas.

## 📄 Exercícios

1. [Diagrama 01](https://github.com/guiijanuario/ClassesAbstrataEInterface/blob/main/src/Exercicio1_CA) - (Classe Abstrata) - Loja de Livros, CDs, DVDs.
2. [Diagrama 02](https://github.com/guiijanuario/ClassesAbstrataEInterface/blob/main/src/Exercicio2_CA) - (Classe Abstrata) - Forma em Retângulos, círculos e quadrados.
3. [Diagrama 03](https://github.com/guiijanuario/ClassesAbstrataEInterface/tree/main/src/Exercicio1_IN) - (Classe Interface) - Fabrica de Lampada.
4. [Diagrama 04](https://github.com/guiijanuario/ClassesAbstrataEInterface/tree/main/src/Exercicio2_IN) - (Classe Interface) - Tributação Bancária


## ⏯️ Como executar?

- Você precisará ter o [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11) instalado no seu computador;
- Baixe o repositório do projeto;
- Abra o terminal e navegue até o diretório do programa que você deseja executar;
- Compile o arquivo executando o comando `javac` no arquivo [Exercícios Classe Abstratas e Interface](https://github.com/guiijanuario/ClassesAbstrataEInterface):
```
javac TesteDeForma.java (nome da main)
```
- Após compilar, execute o comando `java`, como mostra abaixo:
```
java TesteDeForma.java (nome da main)
```

## 👨‍💻 Autor

Nome: Guilherme Januário <br>Linkedin: https://www.linkedin.com/in/guilherme-janu%C3%A1rio/

---

<h4 align=center>Made with 💚 by <a href="https://github.com/guiijanuario">Guilherme Januário</a></h4>




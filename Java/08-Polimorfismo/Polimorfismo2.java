abstract class Animal {
    // Outro tipo de polimorfismo é o de sobrecarga(métodos são sobrecarregados)
    // Para isto o método deve ser sobrecarregado dentro da mesma classe
    // (tipo de retorno e parametros devem ser diferentes)

    private double peso;
    private int idade;
    private int membros;

    // gets e sets

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}

// Este classe extende Animal
class Cachorro extends Animal {
    // Este método será sobrecarregado, deverá diversas assinaturas dentro desta
    // classe

    // 1 parâmetro String
    public void reagir(String frase) {
        if (frase.equals("toma comida") || frase.equals("ola")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    // 2 parâmetros int
    public void reagir(int hora, int minuto) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    // 1 prâmetro boolean
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    // 2 parâmetros 1 int 1 double
    public void reagir(int idade, double peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else if (peso < 10) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }
}

class Polimorfismo2 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        // O metodo sobrecarregado reagir() vai executar um determinado código,
        // dependendo
        // dos parâmetros que forem passados ao invoca-lo
        System.out.println("Metodo sobrecarregado reagir");
        // Uma String
        c.reagir("ola");
        c.reagir("vai apanhar");
        // Dois int
        System.out.println("2 parametros int");
        c.reagir(11, 45);
        c.reagir(19, 05);
        // Um boolean
        System.out.println("1 parametro boolean");
        c.reagir(true);
        c.reagir(false);
        // Um int e um double
        System.out.println("1 parametro int e 1 double");
        c.reagir(2, 5.6); // idade, peso
        c.reagir(14, 4.5);
    }
}
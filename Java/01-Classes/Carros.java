class Carro {
    // Atributos
    String marca;
    String modelo;
    int potencia;

    // Tambem podemos usar métodos em uma classe
    void ligarMotor() {
        System.out.println("Motor ligado");
    }

    int mostraPotencia(int potencia) {
        int x = potencia;
        return x;
    }
}

// Classe principal
class Carros {
    public static void main(String[] args) {
        // Instanciando objeto
        Carro carro1 = new Carro();
        // Atributos de carro1
        carro1.marca = "Nissan";
        carro1.modelo = "Skyline";
        carro1.potencia = 276;

        System.out.println("Carro 1 " + carro1.marca + " " + carro1.modelo);
        // Chamando métodos da classe
        int pot = carro1.mostraPotencia(carro1.potencia); // Requer parametro int
        System.out.println("Potencia: " + pot + "cv");
        carro1.ligarMotor();

        // Novo objeto
        Carro carro2 = new Carro();
        carro2.marca = "Toyota";
        carro2.modelo = "Supra";
        carro2.potencia = 310;

        System.out.println("Carro 2 " + carro2.marca + " " + carro2.modelo);
        int pot2 = carro2.mostraPotencia(carro2.potencia); // Requer parametro int
        System.out.println("Potencia: " + pot2 + "cv");
        carro2.ligarMotor();
    }
}
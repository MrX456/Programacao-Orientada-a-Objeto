class Caneta {
    String modelo;
    String cor;

    //O uso de static indica que o método é estatico, não é necessario
    //instanciar um objeto desta classe para usar este método
    static void metodoEstatico() {
        System.out.println("Este metodo e estatico");
    }

    //Este não é portanto so pode ser chamado depois de instanciar um objeto
    void escrever() {
        System.out.println("Escrevendo...");
    }
}

class Estatico {
    public static void main(String[] args) {
        //Este método é estatico e ja pode ser chamado
        Caneta.metodoEstatico();

        //Este outro só pode ser chamado se instanciarmos um objeto primeiro
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "preta";
        c1.escrever();
    }
}
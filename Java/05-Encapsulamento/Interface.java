interface Controlador {
    // A interface é apenas declarada, não implementada e contém apenas métodos
    public abstract void ligar();

    public abstract void desligar();

    public abstract void abrirMenu();

    public abstract void fecharMenu();

    public abstract void maisVolume();

    public abstract void menosVolume();

    public abstract void ligarMudo();

    public abstract void desligarMudo();

    public abstract void play();

    public abstract void pause();
}

// Classe que implementara a interface
// Implements indica que esta classe esta implementando a Interface Controlador
class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;

    }

    // Métodos gets e sets
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Agora precisamos implementar os métodos da inteface(escrever os códigos)
    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println();
        System.out.println("Menu");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10)
            System.out.print("|");
    }

    public void fecharMenu() {
        System.out.println();
        System.out.println("Fechando menu...");
    }

    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }

}

// Classe principal
class Interface {
    public static void main(String[] args) {
        // Agora podemos usar a classe ControleRemoto
        ControleRemoto controle = new ControleRemoto();
        // vamos chamar métodos da interface
        controle.ligar();
        controle.abrirMenu();
        controle.fecharMenu();

        controle.maisVolume();
        controle.abrirMenu();
        controle.fecharMenu();

        controle.play();
        controle.ligarMudo();
        controle.abrirMenu();
        controle.fecharMenu();
    }
}
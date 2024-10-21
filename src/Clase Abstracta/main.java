abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}

abstract class Canino extends Animal {
    public Canino(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido de canino.");
    }

    public void aullar() {
        System.out.println(nombre + " está aullando.");
    }
}

abstract class Felino extends Animal {
    public Felino(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido de felino.");
    }

    public void ronronear() {
        System.out.println(nombre + " está ronroneando.");
    }
}

class Gato extends Felino {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maúlla.");
    }
}

class Leon extends Felino {
    public Leon(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ruge.");
    }
}

class Lobo extends Canino {
    public Lobo(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " aúlla.");
    }
}

class Perro extends Canino {
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra.");
    }
}

class Hipopotamo extends Animal {
    public Hipopotamo(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido fuerte.");
    }
}

class main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[5];
        animales[0] = new Perro("Perro");
        animales[1] = new Lobo("Lobo");
        animales[2] = new Gato("Gato");
        animales[3] = new Leon("León");
        animales[4] = new Hipopotamo("Hipopótamo");

        for (Animal animal : animales) {
            animal.hacerSonido();
            animal.comer();
            System.out.println();
        }
    }
}

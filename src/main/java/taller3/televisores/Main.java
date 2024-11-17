package taller3.televisores;

public class Main {
    public static void main(String[] args) {
        Marca samsung = new Marca("Samsung");
        TV tv1 = new TV(samsung, false);

        System.out.println("Marca: " + tv1.getMarca().getNombre());
        System.out.println("Estado: " + tv1.getEstado());
        tv1.turnOn();
        System.out.println("Estado tras encender: " + tv1.getEstado());

        tv1.setCanal(5);
        System.out.println("Canal: " + tv1.getCanal());

        Control control1 = new Control();
        control1.enlazar(tv1);
        control1.canalUp();
        System.out.println("Canal tras usar el control: " + tv1.getCanal());
    }
}

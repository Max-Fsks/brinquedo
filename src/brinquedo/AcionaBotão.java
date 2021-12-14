
package brinquedo;


public class AcionaBotão {
    public static void main(String[] args) {
        
        Carro car = new Carro();
        Aviao aviao = new Aviao();
        ControleRemoto control = new ControleRemoto(car);
        
        control.mover();
        control.mover();
    }
}

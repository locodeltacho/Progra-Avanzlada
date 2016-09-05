package decorator;

public class DecoradorConcretoA extends Decorador{
    private String propiedadAņadida;

    public DecoradorConcretoA(Componente componente){
        super(componente);
    }

    public void operacion(){
            super.operacion();
            propiedadAņadida = "Nueva propiedad";
            System.out.println("DecoradorConcretoA.operacion()");
    }
}
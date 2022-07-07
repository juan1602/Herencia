package modelo;

public class Multiplicacion extends Herencia
{
    //CONSTRUCTOR
    public Multiplicacion(double x, double y)
    {
        super(x, y);
    }

    //Metodos
    public void multiplicar()
    {
        resultado = x * y;
    }
}

package modelo;

public class Suma extends Herencia 
{
    //CONSTRUCTOR
    public Suma(double x, double y)
    {
        super(x, y);
    }

    //Metodos
    public void sumar()
    {
        resultado = x + y;
    }
}

package modelo;

public class Division extends Herencia
{
    //CONSTRUCTOR
    public Division(double x, double y)
    {
        super(x, y);
    }

    //Metodos
    public void dividir()
    {
        resultado = x / y;
    }
}

package modelo;

public class Resta extends Herencia
{
    //CONSTRUCTOR
    public Resta(double x, double y)
    {
        super(x, y);
    }

    //Metodos
    public void restar()
    {
        resultado = x - y;
    }
}

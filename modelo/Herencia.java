package modelo ;

public class Herencia
{
    //ATRIBUTOS
    protected double x;
    protected double y;
    protected double resultado;

    //CONSTRUCTOR
    public Herencia(double x, double y)
    {
        this.x=x;
        this.y=y;
        this.resultado=0;
    }

    //Metodos
    public double mostrarResultados()
    {
        return this.resultado;
    }
}


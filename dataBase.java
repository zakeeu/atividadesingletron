/**
 * dataBase
 */
public class dataBase 
{
    private conection conexao;
    private Stirng nomeBanco;

    private static dataBase instancia;

    private dataBase() 
    {

    }

    public static synchronized dataBase getInstance()
    {
        if ( instancia == null)
            instancia = new dataBase();
        
        return instancia;

    }

    public void conectar()
    {
        System.out.println("conectado");
        
    }

    public void desconectar()
    {
        System.out.println("desconectado");
        
    }
}
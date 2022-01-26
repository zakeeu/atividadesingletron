/**
 * main
 */
public class main 
{

    public static void main(String[] args) 
    {
        dataBase.getInstance().conectar();

        dataBase.getInstance().desconectar();

    }
}
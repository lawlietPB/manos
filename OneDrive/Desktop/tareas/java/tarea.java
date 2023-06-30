/**
 * tarea
 */
public class tarea {

    public static void main(String[] args) {
        cuenta juan= new cuenta();
        juan.saldo=1000;
        cuenta pedro=new cuenta();
        pedro.saldo=1200;
        pedro.transferir(100, juan);
        System.out.println(juan.saldo);
         System.out.println(pedro.saldo);
    }
}
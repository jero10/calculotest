
package calculo;


public class Usuario {
    
    //Variable estatica para indicar el minimo de nivel para ingresar a la calculadora
public static int nivelMinCalc =10;


public static boolean login(String a, String b){
            int cadena = b.length();
            if (a=="" || b=="" || a==null || b==null){
                System.out.println("no pueden ingresarse campos vacios");
                return false;
            } else {
                
            if (cadena >= 8){
                System.out.println("Ha ingresado al sistema ");
                return true;
            }
            else {
                System.out.println("Error en la constraseña");
                return false;
            }
     }}

    public static void  configurarNivelMinimo (int n){
            if (n<0) 
                System.out.println("el nivel minimo no es  correcto");
            else
               nivelMinCalc=n;
                System.out.println("el nivel minimo se a configurado correcto");
        
    }      


//Codigo de solicitud de calculadora
public static boolean solicitarCalc(String usuario,String cargo,int nivel){
            String carg = cargo;
            if ("profesor".equals(carg)){
                System.out.println("CAlculadora ingresada");
                return true;
            }
            else {
            int niv = nivel;    
                if (niv >= nivelMinCalc){
                System.out.println( usuario + " calculadora ingresada , es alumno y posee el nivel necesario");
                return true;
                }
                else {
                System.out.println("calculadora no ingresada , no es profesor y no alcanza el nivel minimo");  
                return false;
                }
        }

    
}    
}   

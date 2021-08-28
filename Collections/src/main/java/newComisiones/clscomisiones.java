
package newComisiones;

import java.util.*;
import modelos.vendedor;


public class clscomisiones {
    Scanner t = new Scanner(System.in);//lee los datos que ingresamos
    public List<vendedor> Todos = new ArrayList<vendedor>();//declaramos una lista de tipo Md que se llama todos
    
    private vendedor Ingreso_informacion(){
        vendedor vende = new vendedor();
        
        
        System.out.println("Ingrese Nombre");
        vende.nombre = t.nextLine();
        System.out.println("Ingrese Enero");
        vende.enero = t.nextDouble();        
        System.out.println("Ingrese Febrero");
        vende.febrero = t.nextDouble();       
        System.out.println("Ingrese Marzo");
        vende.marzo = t.nextDouble();
        
        Todos.add(vende);
        return vende;
        
    }
    
    private void desplegarDato(){
        for(vendedor ele: Todos){
            System.out.println("Nombre = "+ele.nombre);
            System.out.println("Enero = "+ele.enero);
            System.out.println("Febrero = "+ele.febrero);
            System.out.println("Marzo = "+ele.marzo);
        }
    }
      public  void imprimirDecorado(){
       
       
        
    }
     
    
    public void menu(){
        String opc = "";
        do{
            System.out.println("1- Ingreso de Informacion");
            System.out.println("2- Ver Informacion");
            System.out.println("3- Cerrar ");
            opc = t.nextLine();
            switch(opc){
                case "1": Ingreso_informacion();
                break;
                case "2": desplegarDato();
                break;            
            }
          
            
        }while(!opc.equals("3"));
    }
}

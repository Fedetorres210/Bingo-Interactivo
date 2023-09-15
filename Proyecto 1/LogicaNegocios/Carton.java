package LogicaNegocios;
import java.util.ArrayList;
import java.util.Random;



public class Carton
{
  private ArrayList<Integer> matrixB;
  private ArrayList<Integer> matrixI;
  private ArrayList<Integer> matrixN;
  private ArrayList<Integer> matrixG;
  private ArrayList<Integer> matrixO;
  private ArrayList<ArrayList<Integer>> carton;
  private boolean asignacion = false;
  private String identificador;
  private static ArrayList<String> identificadores = new ArrayList<String>();
  
  
  
  public Carton()
  {
    identificador = setIdentificador();
  }
  
  
  
  public Carton(ArrayList<Integer> matrixB,ArrayList<Integer> matrixI,ArrayList<Integer> matrixN,ArrayList<Integer> matrixG,ArrayList<Integer> matrixO)
  {
    asignacion =true;
    this.matrixB = matrixB;
    this.matrixI = matrixI;
    this.matrixN = matrixN;
    this.matrixG = matrixG;
    this.matrixO = matrixO;
    carton = setCarton();
    identificador = setIdentificador();
    
      
  }
  
  
  
  public ArrayList<ArrayList<Integer>> setCarton()
  {
    ArrayList<ArrayList<Integer>> nuevoCarton = new ArrayList<ArrayList<Integer>>();
    nuevoCarton.add(matrixB);
    nuevoCarton.add(matrixI);
    nuevoCarton.add(matrixN);
    nuevoCarton.add(matrixG);
    nuevoCarton.add(matrixO);
    return nuevoCarton;
  }
  
  
  public String setIdentificador()
  {
    boolean value = true;
    String identificador = "";
    while(value)
    {
      Random r1 = new Random();
      Random r2 = new Random();
      Random r3 = new Random();
      identificador += (char)(r1.nextInt(26) + 'A');
      identificador += (char)(r2.nextInt(26) + 'A');
      identificador += (char)(r3.nextInt(26) + 'A');
      identificador += r1.nextInt(10);
      identificador += r2.nextInt(10);
      identificador += r3.nextInt(10);
      System.out.println(identificador);
      for(String ident: identificadores)
      {
        if(ident.equals(identificador))
        {
          identificador = "";
          continue;
          
        }
      }
      value =false;
         
    }
    return identificador;
  }
  
  
  
  public void tacharNumero(int numeroSeleccionado)
  {
    ArrayList<ArrayList<Integer>> nuevoCarton = new ArrayList<ArrayList<Integer>>();
    Integer n = numeroSeleccionado;
    for(ArrayList<Integer> fila: carton)
    {
      ArrayList<Integer> nuevoArreglo = new ArrayList<Integer>();
      for( Integer valor: fila)
      {
        if ( n.equals(valor))
        {
          Integer v = new Integer(-1);
          valor = v;
        }
        nuevoArreglo.add(valor);
      }
      nuevoCarton.add(nuevoArreglo);
    }
    carton = nuevoCarton;
    for(ArrayList<Integer> fila: carton)
    {
      System.out.println(fila);
    }
      
      
      
      
  }
    
    
    
    
}

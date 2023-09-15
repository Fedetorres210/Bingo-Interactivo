package LogicaNegocios;
import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public void main()
    {
        ArrayList<Integer> matrixB =new ArrayList<Integer>();
        ArrayList<Integer> matrixI= new ArrayList<Integer>();
        ArrayList<Integer> matrixN= new ArrayList<Integer>();
        ArrayList<Integer> matrixG= new ArrayList<Integer>();
        ArrayList<Integer> matrixO = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i <= 5; i = i + 1)
        {
            matrixB.add(r.nextInt(76));
            matrixI.add(r.nextInt(76));
            matrixN.add(r.nextInt(76));
            matrixG.add(r.nextInt(76));
            matrixO.add(r.nextInt(76));
            
        }
        
        Carton nuevoCarton1 = new Carton(matrixB,matrixI,matrixN,matrixG,matrixO);
        Carton nuevoCarton2 = new Carton(matrixB,matrixI,matrixN,matrixG,matrixO);
        Carton nuevoCarto3 = new Carton(matrixO,matrixI,matrixN,matrixG, matrixB);
        
        
        nuevoCarton1.tacharNumero(10);
        nuevoCarton1.tacharNumero(11);
        nuevoCarton1.tacharNumero(12);
        
        
        
        
    }
}

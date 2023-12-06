package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import operaciones.Division;
import operaciones.Multiplicacion;
import operaciones.Suma;
import operaciones.Resta;

class TestCaseExamen2 {


    @org.junit.jupiter.api.Test
    void Division() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
      
        assertEquals(50, division.procesar(100, 2));
   
       
        assertEquals(-3, division.procesar(450, 0));
        
        
        assertEquals(-1, division.procesar(-6, 8));
    }
    
    
    @org.junit.jupiter.api.Test
    void Resta() {
        OperacionAritmetica resta = new OperacionAritmetica(new Resta());
 
        assertEquals(5, resta.procesar(100, 95));

        assertEquals(-2, resta.procesar(50, 100));

        assertEquals(-1, resta.procesar(-20, 7));
    }
    
    
    @org.junit.jupiter.api.Test
    void Suma() {
        OperacionAritmetica suma = new OperacionAritmetica(new Suma());
     
        assertEquals(600, suma.procesar(200, 400));
 
        assertEquals(-1, suma.procesar(-100, 45));
    }


    @org.junit.jupiter.api.Test
    void Multiplicacion() {
        OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());

        assertEquals(700, multiplicacion.procesar(350, 2));
    
        assertEquals(-1, multiplicacion.procesar(-200, 2));
    }

 

}

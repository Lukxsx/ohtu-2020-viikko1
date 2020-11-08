package paaohjelma;

import ohtu.ohtuvarasto.Varasto;

public class Main {

    public static void main(String[] args) {
        Varasto varasto = new Varasto(20, 5);
    }

    /* //tämä rikkoo checkstylen
    public void asd() 
    {
        if (true)
        {
            if (true) {
                if (false)
                {
                    // ei toimi
                }
            }
        }
        
        while (true) 
        {
            break;
        }
        
        for( int i=0; i<1; i++ ) {
  for( int j=0; i<j; j++ ) {
    System.out.println("virhe");
  } 
}


    }
     */
}

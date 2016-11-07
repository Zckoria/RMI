



public class RMIClientMain 
{
     public static void main(String[] args) 
    {
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();

            int suma = wsc.getSuma(1, 1);
            
             System.out.println(" resultado de la suma por el servidor: " + suma);
             
              int resta = wsc.getResta(1, 1);
            
             System.out.println(" resultado de la resta por el servidor: " + resta);
             
              int multiplicacion = wsc.getMultiplicacion(1, 1);
            
             System.out.println(" resultado de la multiplicacion por el servidor: " + multiplicacion);
             
              int division = wsc.getDivision(1, 1);
            
             System.out.println(" resultado de la division por el servidor: " + division);
             
              int area = wsc.getAreaCuadrado(1, 1);
            
             System.out.println(" resultado de la area por el servidor: " + area);
             
              int area1 = wsc.getAreaTriangulo(1, 1);
            
             System.out.println(" resultado del area por el servidor: " + area1);
     
        } catch (Exception ex) {
            ex.printStackTrace();
             System.err.println("Connection error the server is not responding.");
        }
    }
}

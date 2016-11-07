


public class RMIServerMain {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try 
        {
            RMIService ws = new RMIService();
           
            int suma = ws.getSuma(123, 10);

            System.out.println("suma: " + suma); 
            
            int resta = ws.getResta(123, 10);

            System.out.println("resta: " + resta); 
            
            int multiplicacion = ws.getMultiplicacion(123, 10);

            System.out.println("multiplicacion: " + multiplicacion); 
            
            int division = ws.getDivision(123, 10);

            System.out.println("division: " + division); 
            
            int cuadrado = ws.getAreaCuadrado(123, 10);

            System.out.println("area: " + cuadrado); 
            
            int AreaTriangulo = ws.getAreaTriangulo(123, 10);

            System.out.println("area1: " + AreaTriangulo); 
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex);
        }
    }
}

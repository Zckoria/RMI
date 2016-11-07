



import java.rmi.*;

public interface InterfaceRmiCommunication extends Remote 
{
    Integer getSuma(int num1, int num2) throws RemoteException;
    
    Integer getResta(int num, int num3) throws RemoteException;
    
    Integer getMultiplicacion(int num4, int num5) throws RemoteException;
    
    Integer getDivision(int num6, int num7) throws RemoteException;
    
    Integer getAreaCuadrado(int lado1, int lado2) throws RemoteException;
    
    Integer getAreaTriangulo(int base, int altura) throws RemoteException;
    
    
   
}

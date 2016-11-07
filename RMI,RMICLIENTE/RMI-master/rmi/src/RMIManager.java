

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.security.spec.InvalidKeySpecException;

public class RMIManager implements InterfaceRmiCommunication {

    //Operational Classes
    private static Registry _registry;
    private static InterfaceRmiCommunication _stub;

    //Constructors
    public RMIManager(int rmiPort) throws IOException, InvalidKeySpecException, Exception {
        _registry = LocateRegistry.createRegistry(rmiPort);
        this._stub = (InterfaceRmiCommunication) UnicastRemoteObject.exportObject(this, 0);

        try {
            System.setProperty("java.security.policy", "java.policy");
            System.setSecurityManager(new RMISecurityManager());
            _registry.bind("rmiServer", _stub);
            System.out.println("Esperando peticiones del cliente...");
        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Server exception: " + e.toString());
        }
    }

    @Override
    public Integer getSuma(int num1, int num2) throws RemoteException {
        return num1 + num2;
    }

    @Override
    public Integer getResta(int num, int num3) throws RemoteException {
        
        return num - num3;
    }
    

    @Override
    public Integer getMultiplicacion(int num4, int num5) throws RemoteException {
        return num4 * num5;
    }

    @Override
    public Integer getDivision(int num6, int num7) throws RemoteException {
        return num6/num7;
    }

    @Override
    public Integer getAreaCuadrado(int lado1, int lado2) throws RemoteException {
        return lado1*lado2;
    }

    @Override
    public Integer getAreaTriangulo(int base, int altura) throws RemoteException {
        return (base*altura)/2;
    }
}

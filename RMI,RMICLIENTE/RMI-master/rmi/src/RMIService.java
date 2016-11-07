


import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.RemoteException;
import java.security.spec.InvalidKeySpecException;

public class RMIService {

    //Operational Classes

    private static RMIManager _rmiManager;
    private static final int RMIPort = 1234;

    //Constructors
    public RMIService() throws InvalidKeySpecException, IOException, Exception {
        try (ServerSocket serverSocket = new ServerSocket(RMIPort)) {
            System.out.println("puerto disponible...");
            serverSocket.close();
            this._rmiManager = new RMIManager(RMIPort);

        } catch (IOException x) {
            System.out.println("el puerto esta ocupado..." + x);
        }
    }

    public int getSuma(int num1, int num2) throws RemoteException {
        Integer _translationRule = _rmiManager.getSuma(num1, num2);
        return _translationRule;
    }

    int getResta(int num, int num3) throws RemoteException {
       Integer _translationRule;
        _translationRule = _rmiManager.getResta(num, num3);
        return _translationRule;
    }

    int getMultiplicacion(int num1, int num2) throws RemoteException {
        Integer _translationRule = _rmiManager.getMultiplicacion(num1, num2);
        return _translationRule;
    }

    int getDivision(int num1, int num2) throws RemoteException {
       Integer _translationRule = _rmiManager.getDivision(num1, num2);
        return _translationRule;
    }

    int getAreaCuadrado(int lado1, int lado2) throws RemoteException {
        Integer _translationRule = _rmiManager.getAreaCuadrado(lado1, lado2);
        return _translationRule;
    }

    int getAreaTriangulo(int base , int altura) throws RemoteException {
        Integer _translationRule = _rmiManager.getAreaTriangulo(base , altura);
        return _translationRule;
    }
}

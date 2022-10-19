package ine_lab5_java;

import java.rmi.*;

// Интерфейс для описания возможностей сервера
public interface IRemoteService extends Remote {
    String SERVICE_NAME = "egov/person";
    int PORT = 1101;
    Object getData(Solve data) throws RemoteException;
    void stopServer() throws RemoteException;
}

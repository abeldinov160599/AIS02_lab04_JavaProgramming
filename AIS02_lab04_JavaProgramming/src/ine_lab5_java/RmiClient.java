package ine_lab5_java;

import java.rmi.registry.*;
import java.util.Scanner;

// Клиент RMI
public class RmiClient {
    final static String HOST = "localhost"; // Адрес сервера

    public static void main(String... args) throws Exception {
        Registry server = LocateRegistry.getRegistry(HOST, IRemoteService.PORT);
        IRemoteService remoteService = (IRemoteService) server.lookup(IRemoteService.SERVICE_NAME);
        System.out.println("Программирование на JAVA. Лабораторная работа №4. 2-вариант.");
        System.out.println("Абельдинов И.С. ВТиП-302");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = sc.nextDouble();
        System.out.println("Введите число b: ");
        double b = sc.nextDouble();
        System.out.println("Введите число x: ");
        double x = sc.nextDouble();
        System.out.println(remoteService.getData(new Solve(a,b,x)));
        remoteService.stopServer();
    }
}

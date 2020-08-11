package DatabaseConnection;

import javax.swing.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import Remote.DatabaseInterface;

public class DatabaseManager {
    public static String ip = "";
    public static DatabaseInterface db;


    public static void init()throws Exception{
        Registry reg = LocateRegistry.getRegistry(DatabaseManager.ip, 1099);
        db = (DatabaseInterface) reg.lookup("rmi://"+DatabaseManager.ip+"/inventoryDatabase");
        JOptionPane.showMessageDialog(null, "Connection Established");
    }
}

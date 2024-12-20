package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
public class connexion {
public static final String url = "jdbc:mysql://localhost:3306/employe";
public static final String user = "root";
public static final String password = "";
public static Connection conn =null;

public static Connection getConnexion() {
	if(conn != null) {
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println("Erreur de connexion !!!!!");	
			}
	}
	return conn;
	}


	public static void closeConnexion() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Erreur de connexion !!!!!");	
				}
		}
	}}*/
public class Connexion {
    public static final String url = "jdbc:mysql://localhost:3306/employe";
    public static final String user = "root";
    public static final String password = "";
    private static Connection conn = null;

    public static Connection getConnexion() {
        if (conn == null) { // V�rifie si la connexion est null avant de l'�tablir
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connexion �tablie avec succ�s !");
            } catch (SQLException e) {
                System.out.println("Erreur de connexion !!!!!");
               // e.printStackTrace(); // Fournit plus de d�tails sur l'erreur
            }
        }
        return conn;
    }

    public static void closeConnexion() {
        if (conn != null) {
            try {
                conn.close();
                conn = null; // R�initialise conn apr�s fermeture
                System.out.println("Connexion ferm�e avec succ�s !");
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture de la connexion !!!!!");
                //e.printStackTrace(); // Fournit plus de d�tails sur l'erreur
            }
        }
    }
}
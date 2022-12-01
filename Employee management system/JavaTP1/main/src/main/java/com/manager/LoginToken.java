package com.manager;


public class LoginToken 
{   

    private static String nom;
    private static String prenom;
    private static String userName;


    public static String getNom(){return nom;}
    public static void setNom(String nom){LoginToken.nom = nom;}

    public static String getPrenom(){return prenom;}
    public static void setPrenom(String prenom){LoginToken.prenom = prenom;}

    public static String getuserName(){return userName;}
    public static void setuserName(String userName){
        LoginToken.userName = userName;
    }

    public static void reset()
    {
        LoginToken.nom = "";
        LoginToken.prenom = "";
        LoginToken.userName = "";
    }
}

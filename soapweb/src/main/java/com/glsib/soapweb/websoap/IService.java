package com.glsib.soapweb.websoap;

import java.util.List;

public interface IService {

    // Pour Consommation Service Soap
    public int  getAddResult(int intA, int intB);
    public int getSubResult(int intA, int intB);

    public int  getMulResult(int intA, int intB);
    public int  getDivResult(int intA, int intB);

    // Pour Consommation API Rest
    // On a plutot utiliser ici Object comme classe Generic pour pouvoir utiliser le retour de l'api

    List<Object> getAllUsers();
    Object AddUser(Object object);


}

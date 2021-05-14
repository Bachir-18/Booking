package DAO;

import java.util.List;

import vol.Vol;

public interface Ivol {
public void inserer_vol(Vol V);
public List<Vol> lister_vol();
public Vol getVol(String id); 
public void modifier_vol(Vol V);
public void retirer_vol(String idv);
}

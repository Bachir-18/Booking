package DAO;


import java.util.List;

import vol.Avion;

public interface Iavion {
public void save(Avion A);
public List<Avion> listerAvion();
public void retirerAvion(int ida);
public Avion getAvion(int id);

}

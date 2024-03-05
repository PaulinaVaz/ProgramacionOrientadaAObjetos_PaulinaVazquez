package edu.paulina_vazquez.reto5_4.data;

import java.util.ArrayList;
import java.util.List;

public class ListaDeContactos {
    private List<Contacto> contactos;

    public ListaDeContactos() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }

    public void eliminarContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombreDelContacto().equals(nombre)) {
                contactos.remove(i);
                break;
            }
        }
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombreDelContacto().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }
}

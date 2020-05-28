package tiendaJpa.utils;

import tiendaJpa.control.*;
import tiendaJpa.entities.*;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente c = new Cliente ("0000","g@gmail.com","Ivan");
		ClienteDao cDao = new ClienteDao ();
		cDao.insert(c);

		
		Tienda t = new Tienda ("0000","Esquinera","t@gmail.com","wwww.facebook.com/tienda",
				"hhtps/magen.ong","lomejor","Pepito","Pepito","www.tienda.com");
		TiendaDao tDao = new TiendaDao ();
		tDao.insert(t);
		
		
		//////

		ServicioDao sdao = new ServicioDao();
        Servicio s = new Servicio();
        Tienda tienda2 = new Tienda();
        TiendaDao tdao2 = new TiendaDao();


        tienda2.setNombre("Pepito");

        Tienda aux = tdao2.findByFieldObject(Tienda.class, "nombre", tienda2.getNombre());

        s.setDescripcion("primer servicio");
        s.setNombre("quinteroven");
        s.setTiendaBean(aux);

        s.setTiendaBean(aux);

        sdao.insert(s);
        
        
        ///
        
        Tienda tienda = new Tienda();
        TiendaDao tDaoa = new TiendaDao();

        tienda.setNombre("Pepito");

        Tienda aux1 = tDaoa.findByFieldObject(Tienda.class, "nombre", tienda.getNombre());//guardamos en un objeto

        aux1.setClave("7878");
        aux1.setDescripcion("Esquinera tienda");
        aux1.setEmail("tienditas@gmail.com");
        aux1.setFacebook("facebook/tiendita");
        aux1.setImagen("tienda.png");
        aux1.setLema("Lo mejor viene!");
        aux1.setNombre("Pepitos mundo");
        aux1.setPropietario("PEpito");
        aux1.setWeb("pepitotienda.cowm");

        tDaoa.update(aux1);
        
        
        
        
        
	}

}

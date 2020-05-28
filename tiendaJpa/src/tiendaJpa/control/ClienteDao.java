package tiendaJpa.control;

import tiendaJpa.entities.Cliente;
import tiendaJpa.entities.Servicio;
import tiendaJpa.utils.Conexion;

public class ClienteDao extends Conexion<Cliente> implements GenericDao<Cliente> {
	public ClienteDao(){
        super(Cliente.class);
    }
	
}

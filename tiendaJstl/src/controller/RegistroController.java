package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tiendaJpa.control.TiendaDao;
import tiendaJpa.entities.*;

/**
 * Servlet implementation class RegistroController
 */
@WebServlet("/RegistroController")
public class RegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("nombre");
		String lema = request.getParameter("lema");
		String descripcion = request.getParameter("descripcion");
		String email = request.getParameter("email");
		String clave = request.getParameter("clave");
		String web = request.getParameter("web");
		String propietario = request.getParameter("propietario");
		String facebook = request.getParameter("facebook");
		String imagen = request.getParameter("imagen");
		
		Tienda t = new Tienda(clave,descripcion,email,facebook,imagen,lema,nombre,propietario,web);
		
		TiendaDao tDao = new TiendaDao ();
		tDao.insert(t);
		
		
		
	}

}

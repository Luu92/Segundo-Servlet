
package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LuisMolinaServlet_2 extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		super.init();
	}
	
    @Override
    public void init() throws ServletException{
    	// TODO Autogenerated method stub
    	super.init();
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    	super.service(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    	//super.doPost(req, resp);
    	String nombre = req.getParameter("nombre");
    	System.out.println("Mi nombre es: "+nombre);
    	String apellido = req.getParameter("apellido");
    	System.out.println("Mi apellido es: "+apellido);
    	PrintWriter salida = resp.getWriter();
    	//Utilice salida para enviar el contenido al navegador web
    	salida.println("Hola tu nombrer es: "+nombre+" y tu apellido es: "+apellido);
    }
}
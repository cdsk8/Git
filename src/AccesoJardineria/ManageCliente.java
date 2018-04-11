package AccesoJardineria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageCliente {

	public static Integer addCliente(String fname, String lname, String adress) {
		Session session = main.sessionFactory.openSession();
		Transaction tx = null;
		Integer clienteId = null;

		try {
			tx = session.beginTransaction();
			Cliente cliente = new Cliente();
			clienteId = (Integer) session.save(cliente);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return clienteId;
	}

	public static void listEmployees() {
		Session session = main.sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			List clientes = session.createQuery("FROM Cliente").list();
			for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
				Cliente cliente = (Cliente) iterator.next();
				System.out.println("CodigoCliente: " + cliente.getCodigocliente());
				System.out.println("NombreCliente: " + cliente.getNombrecliente());
				System.out.println("NombreContacto: "+ cliente.getNombrecontacto());
				System.out.println("ApellidoContacto: " + cliente.getApellidocontacto());
				System.out.println("Telefono: " + cliente.getTelefono());
				System.out.println("Fax: "+cliente.getFax());
				System.out.println("LineaDireccion1: "+ cliente.getLineadireccion1());
				System.out.println("LineaDireccion2: "+ cliente.getLineadireccion2());
				System.out.println("Ciudad: "+cliente.getCiudad());
				System.out.println("Region: "+cliente.getRegion());
				System.out.println("Pais: "+cliente.getPais());
				System.out.println("CodigoPostal: "+cliente.getCodigopostal());
				System.out.println("CodigoEmpleadoRepVentas: "+cliente.getCodigoempleadorepventas());
				System.out.println("LimiteCredito: "+ cliente.getLimitecredito());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}

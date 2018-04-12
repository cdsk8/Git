package AccesoJardineria;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Esta es la clase que mapea un objeto de JAVA a una tabla de MYSQL. Hay mas metodos como archivos xml para hacer lo mismo que aqui. Cada clase que se quiera mapear empezara con @Entity. Se debe hacer antes de nada, despues de los imports.*/
@Entity
@Table(name = "clientes") // Con la anotacion @Table referenciamos a una tabla del servidor. Podemos
							// añadirlos entre parentesis y el valor entre comillas || More
							// info----->http://docs.jboss.org/hibernate/stable/annotations/reference/en/html_single/
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CodigoCliente") // Relacionamos la variable privada codigocliente con una columna de nombre CodigoCliente. Los nombres de las tablas no son CaseSensitive
	private int codigocliente;

	@Column(name = "NombreCliente")
	private String nombrecliente;

	@Column(name = "NombreContacto")
	private String nombrecontacto;

	@Column(name = "ApellidoContacto")
	private String apellidocontacto;

	@Column(name = "Telefono")
	private String telefono;

	@Column(name = "Fax")
	private String fax;

	@Column(name = "LineaDireccion1")
	private String lineadireccion1;

	@Column(name = "LineaDireccion2")
	private String lineadireccion2;

	@Column(name = "Ciudad")
	private String ciudad;

	@Column(name = "Region")
	private String region;

	@Column(name = "Pais")
	private String pais;

	@Column(name = "CodigoPostal")
	private String codigopostal;

	@Column(name = "CodigoEmpleadoRepVentas")
	private int codigoempleadorepventas;

	@Column(name = "LimiteCredito")
	private float limitecredito;

	
	
	/*
	 * 
	 * 
	 * Se crean dos constructores de la clase cliente. Uno entero y otro vacio.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	

	public Cliente() {
		super();
	}
	
	public Cliente(int codigocliente, String nombrecliente, String nombrecontacto, String apellidocontacto,
			String telefono, String fax, String lineadireccion1, String lineadireccion2, String ciudad, String region,
			String pais, String codigopostal, int codigoempleadorepventas, float limitecredito) {
		super();
		this.codigocliente = codigocliente;
		this.nombrecliente = nombrecliente;
		this.nombrecontacto = nombrecontacto;
		this.apellidocontacto = apellidocontacto;
		this.telefono = telefono;
		this.fax = fax;
		this.lineadireccion1 = lineadireccion1;
		this.lineadireccion2 = lineadireccion2;
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
		this.codigopostal = codigopostal;
		this.codigoempleadorepventas = codigoempleadorepventas;
		this.limitecredito = limitecredito;
	}

	public int getCodigocliente() {
		return codigocliente;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public String getNombrecontacto() {
		return nombrecontacto;
	}

	public String getApellidocontacto() {
		return apellidocontacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getFax() {
		return fax;
	}

	public String getLineadireccion1() {
		return lineadireccion1;
	}

	public String getLineadireccion2() {
		return lineadireccion2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getRegion() {
		return region;
	}

	public String getPais() {
		return pais;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public int getCodigoempleadorepventas() {
		return codigoempleadorepventas;
	}

	public float getLimitecredito() {
		return limitecredito;
	}

	public void setCodigocliente(int codigocliente) {
		this.codigocliente = codigocliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}

	public void setApellidocontacto(String apellidocontacto) {
		this.apellidocontacto = apellidocontacto;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setLineadireccion1(String lineadireccion1) {
		this.lineadireccion1 = lineadireccion1;
	}

	public void setLineadireccion2(String lineadireccion2) {
		this.lineadireccion2 = lineadireccion2;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public void setCodigoempleadorepventas(int codigoempleadorepventas) {
		this.codigoempleadorepventas = codigoempleadorepventas;
	}

	public void setLimitecredito(float limitecredito) {
		this.limitecredito = limitecredito;
	}

}

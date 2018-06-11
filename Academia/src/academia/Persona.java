/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;
import java.util.Date;

/**
 *
 * @author cfp
 */

public class Persona 
{
    private Integer id_persona;
    private String apellido;
    private String nombre;
    private Date fnac;
    private String documento;
    private String direccion;
    private String telefono;
    private Integer id_localidad;
    
    public void setid_persona (Integer id_persona)
    {
        this.id_persona = id_persona;
    }
    public Integer getid_persona()
    {
        return id_persona;
    }
    public void setApellido (String apellido)
    {
        this.apellido = apellido;
    }
    public String getApellido ()
    {
        return apellido;
    }
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setFnac (Date fnac)
    {
        this.fnac = fnac;
    }
    public Date getFnac()
    {
        return fnac;
    }
    public void setDocumento (String documento)
    {
        this.documento = documento;
    }
    public String getDocumento ()
    {
        return documento;
    }
    public void setDireccion (String direccion)
    {
        this.direccion = direccion;
    }
    public String getDireccion ()
    {
        return direccion;
    }
    public void setTelefono (String telefono)
    {
        this.telefono = telefono;
    }
    public String getTelefono ()
    {
        return telefono;
    }
    public void setid_localidad (Integer id_localidad)
    {
        this.id_localidad = id_localidad;
    }
    
}

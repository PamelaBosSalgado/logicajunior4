/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

/**
 *
 * @author cfp
 */
public class Matricula 
{
    private Integer id_curso;
    private Integer id_alumno;
    private Integer id_profesor;
    
    public void setid_curso (Integer id_curso)
    {  
        this.id_curso = id_curso;
    }
    public Integer getid_curso()
    {
        return id_curso;
    }
    public void setid_alumno (Integer id_alumno)
    {
        this.id_alumno = id_alumno;
    }
    public Integer getid_alumno ()
    {
        return id_alumno;
    }
    public void setid_profesor (Integer id_profesor)
    {
        this.id_profesor = id_profesor;
    }
    public Integer getid_profesor ()
    {
        return id_profesor;
    }
}

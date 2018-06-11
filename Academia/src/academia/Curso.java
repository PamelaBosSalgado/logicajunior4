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
public class Curso 
{
    private Integer id_curso;
    private String curso;
    private String horario;
    private Integer id_profesor;
    
    public void setid_curso (Integer id_curso)
    {
        this.id_curso = id_curso;
    }
    public Integer getid_curso ()
    {
        return id_curso;
    }
    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    public String getCurso()
    {
        return curso;
    }
    public void setHorario (String horario)
    {
        this.horario = horario;
    }
    public String getHorario()
    {
        return horario;
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import org.hibernate.Session;
import models.Usuario;

/**
 *
 * @author Marcos H. Costa
 */
public class UsuarioDao {
    
    private Session session;
    
    public UsuarioDao(Session session){
        this.session = session;
    }
    
    public void adicionar(Usuario u){
        this.session.save(u);
    }
    
    public void remover(Usuario u){
        this.session.delete(u);
    }
    
    public void atualizar(Usuario u){
        this.session.update(u);
    }
    
    public List<Usuario> listar(){
        return this.session.createCriteria(Usuario.class).list();
    }
    
    public Usuario localizar(Long id){
        return (Usuario) session.get(Usuario.class, id);
    }
}

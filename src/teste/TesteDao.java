/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import conf.DaoFactory;
import daos.UsuarioDao;
import models.Usuario;

/**
 *
 * @author Marcos H. Costa
 */
public class TesteDao {      
    
    public static void main(String[] args) { 
        DaoFactory d = new DaoFactory();
        UsuarioDao dao = new UsuarioDao(d.getSession());
        
        //adicionando
        Usuario u = new Usuario();
        u.setLogin("MaiuscUlo");
        u.setSenha("1232132");
        
        dao.adicionar(u);
        
//        listando
//        for(Usuario usuario : dao.listar()){
//            System.out.println(usuario.getId());
//            System.out.println(usuario.getLogin());
//            System.out.println(usuario.getSenha());
//        }
//        
//        //editando        
//        d.beginTransaction();
//        Usuario u2 = dao.localizar(new Long(1));        
//        u2.setLogin("jose");        
//        dao.atualizar(u2);
//        d.commit();
//        
//        //removendo
//        d.beginTransaction();
//        Usuario u3 = dao.localizar(new Long(1));
//        dao.remover(u3);
//        d.commit();
        
        d.close();
    }    
}
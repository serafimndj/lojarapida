
package br.senac.rn.lojarapida.principal;
import br.senac.rn.lojarapida.dao.CategoriaDAO;
import br.senac.rn.lojarapida.model.Categoria;

public class PrincipalCategoria {

    public static void main(String[] args) {

        new CategoriaDAO().insert(new Categoria(0, "chuteira", "Calcados"));  
        System.exit(0);
    }
    
        
//    Categoria c1 = new Categoria() ;
//    Categoria c2 = new Categoria() ;
//    Categoria c3 = new Categoria() ;
//    Categoria c4 = new Categoria() ;
//    
//    c1.setNome("sandalia");
//    c1.setdescricao("calcados");
//            
//    c2.setNome("chinelo");
//    c2.setdescricao("calcados");
//            
//    c3.setNome("tenis");
//    c3.setdescricao("calcados");
//            
//    c4.setNome("sapato");
//    c4.setdescricao("calcados");
////    
//    CategoriaDAO dao = new CategoriaDAO();
//////        
//       dao.inserir(c1);
//       dao.inserir(c2);
//       dao.inserir(c3);
//       dao.inserir(c4);
       
//       dao.excluir(dao.buscarPorId(7)); //exclui no banco atraves do id
//       dao.excluir(dao.buscarPorId(8));
       
//       System.exit(0);
       
            
//       
    
}
    


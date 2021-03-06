
package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Produto;
import br.senac.rn.lojarapida.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;


public class ProdutoDAO extends GenericDAO<Produto> {

    @Override
    public Class<Produto> getClassType() {
    return Produto.class; 
    }
    
    public List<Produto> buscarPorNome(String nome) {
        String jpql = "select p from Produto p where p.nome like :nome";
        TypedQuery<Produto> query = getEm().createQuery(jpql, Produto.class).setMaxResults(10);
        query.setParameter("nome" , "%" + nome + "%");
        return query.getResultList();
    }
}
    
//    //private EntityManager manager; // gerenciador de entidades
//    private EntityManagerFactory factory; //conexão com o banco
//
//    public ProdutoDAO() {
//        factory = Persistence.createEntityManagerFactory("ConexaoDB");
//        manager = factory.createEntityManager();
//}
//    public void inserir(Produto produto) {  //void - não tem retorno
//        manager.getTransaction().begin();
//        manager.persist(produto); //INSERIR
//        manager.getTransaction().commit();
//    }
//    
//    public void excluir(Produto produto) {
//    manager.getTransaction().begin();
//    manager.remove(produto); //EXCLUIR
//    manager.getTransaction().commit();
//        }
//        
//    public void atualizar(Produto produto) {
//    manager.getTransaction().begin();
//    manager.merge(produto); //ATUALIZAR
//    manager.getTransaction().commit();
//        }
//
//
//    public List<Produto> buscarTodos() {
//        TypedQuery<Produto> consulta = manager.createQuery("SELECT p FROM Categoria p", Produto.class);
//        return consulta.getResultList();
//        
//}
//    
//    public Produto buscarPorId(int id) {
//        return manager.find(Produto.class, id);
//    
//    
    
    






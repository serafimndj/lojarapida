
package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Sexo;
import br.senac.rn.lojarapida.util.GenericDAO;


public class SexoDAO extends GenericDAO<Sexo> {

    @Override
    public Class<Sexo> getClassType() {
    return Sexo.class;
}
//    private EntityManager manager;
//    private EntityManagerFactory factory;
//
//    public SexoDAO() {
//        factory = Persistence.createEntityManagerFactory("ConexaoDB");
//        manager = factory.createEntityManager();
//    }
//    
//    public void inserir(Sexo sexo) {
//        manager.getTransaction().begin();
//        manager.persist(sexo); //INSERIR
//        manager.getTransaction().commit();
//    }
//    
//    public void excluir(Sexo sexo) {
//    manager.getTransaction().begin();
//    manager.remove(sexo); //EXCLUIR
//    manager.getTransaction().commit();
//        }
//        
//    public void atualizar(Sexo sexo) {
//    manager.getTransaction().begin();
//    manager.merge(sexo); //ATUALIZAR
//    manager.getTransaction().commit();
//        }
//
//
//    public List<Sexo> buscarTodos() {
//        TypedQuery<Sexo> consulta = manager.createQuery("SELECT s FROM Sexo s", Sexo.class);
//        return consulta.getResultList();
//        
//}
//    
//    public Sexo buscarPorId(int id) {
//        return manager.find(Sexo.class, id);
//    }


            
    
    
            
    
}

package at.ooe.pati.jeewildflymysqldocker;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TestFacade {
    @PersistenceContext
    EntityManager repo;


    public List<Test> getAll() {
        List<Test> i = repo.createQuery("select m from Test m").getResultList();
        return i;
    }

    public void insert(Test test) {
        repo.persist(test);
    }
}

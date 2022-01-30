package at.ooe.pati.jeewildflymysqldocker;


import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class InitBean {

    @Inject
    TestFacade repo;


    @PostConstruct
    public void init() {
        Test t = new Test("Geo",1);
        Test t1 = new Test("Geo",1);
        repo.insert(t);
        repo.insert(t1);
    }
}

package at.ooe.pati.jeewildflymysqldocker;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Console;
import java.util.List;

@Path("/test")
public class EndpointTest {
    @Inject
    TestFacade repo;

    @GET
    @Produces("text/json")
    public Response Get() {
        List<Test> i = repo.getAll();
        System.out.println(i.size());
        return Response.ok().entity(i.size()).build();
    }

    @POST
    public Response Post(Test test) {
        repo.insert(test);
        return Response.ok().build();
    }
}

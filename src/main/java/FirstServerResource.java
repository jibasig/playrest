import org.restlet.*;
import org.restlet.resource.*;
import org.restlet.data.Protocol;


public class FirstServerResource extends ServerResource {  

   public static void main(String[] args) throws Exception {  
      // Create the HTTP server and listen on port 8182  
      new Server(Protocol.HTTP, 8182, FirstServerResource.class).start();  
   }

   @Get  
   public String toString() {  
      return "hello, world";  
   }

}


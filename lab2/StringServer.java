import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String printOut = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format(printOut);
        } else if (url.getPath().equals("/add-message")) {
            System.out.println("Path: " + url.getPath());
            
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                String str = parameters[1];
                printOut = printOut + str + "\n";
                return printOut;
            }
            else{
                return "404 Not Found! Query invalid";
            }
        }
        return "404 Not Found!";
        
    }
}

class StringServer{
    public static void main(String[] args) throws IOException{
        if (args.length == 0){
            System.out.println("Missing port number bro. Try a number between 1024 and 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());

    }
}

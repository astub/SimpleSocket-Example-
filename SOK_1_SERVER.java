import java.io.*;
import java.net.*;

public class SOK_1_SERVER {
    
    public static void main(String[] args) throws Exception {
        SOK_1_SERVER SERVER = new SOK_1_SERVER();
        SERVER.run();
    }

    private void run() throws Exception {
        
        ServerSocket SRVSOCK = new ServerSocket(1025);
        while(true) {
            System.out.println("Here0");
            Socket SOCK = SRVSOCK.accept();
        
            System.out.println("Here1");
            InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
            BufferedReader BR = new BufferedReader(IR);
        
            System.out.println("Here2");
            String MESSAGE = BR.readLine();
            System.out.println(MESSAGE);
        
            if (MESSAGE != null) {
                PrintStream PS = new PrintStream(SOCK.getOutputStream());
                PS.println("Message received!");
            }
        }
        
    }
}

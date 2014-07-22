import java.io.*;
import java.net.*;

public class SOK_1_CLIENT {
    
    public static void main(String[] args) throws Exception {
        SOK_1_CLIENT CLIENT = new SOK_1_CLIENT();
        CLIENT.run();
    }

    private void run() throws Exception {
        
        Socket SOCK = new Socket("localhost",1025);
        PrintStream PS = new PrintStream(SOCK.getOutputStream());
        PS.println("Hello to SERVER from CLIENT");
        
        InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
        BufferedReader BR = new BufferedReader(IR);
        
        String MESSAGE = BR.readLine();
        System.out.println(MESSAGE);
        
    }
    
}

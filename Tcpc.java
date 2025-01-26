
import java.net.*;
import java.io.*;
class Tcpc{
     public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Socket sock=new Socket();
        System.out.println("enter file name");
        String fname=br.readLine();
        OutputStream output=sock.getOutputStream();
        PrintWriter p= new PrintWriter(output,true);
        p.println(fname);
        InputStream input=sock.getInputStream();
        BufferedReader b=new BufferedReader(new InputStreamReader(input));
        String str;
        while((str=b.readLine())!=null){
         System.out.println(str);
        }
        p.close();
        br.close();
        b.close();

     }
}
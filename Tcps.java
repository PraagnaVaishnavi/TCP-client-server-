import java.net.*;
import java.io.*;

class Tcps {
    public static void main(String[] args) throws Exception {
      ServerSocket servsock=new ServerSocket(1234);
      System.out.println("server is ready");
      Socket sock=servsock.accept();
      InputStream inp=sock.getInputStream();
      BufferedReader br=new BufferedReader(new InputStreamReader(inp)) ;
       String s= br.readLine();
      BufferedReader fp=new BufferedReader(new FileReader(s));
        OutputStream ostream=sock.getOutputStream();
       PrintWriter p=new PrintWriter(ostream,true);
       System.out.println("the text content is  ");
       String str;
       while((str=fp.readLine())!=null){
        System.out.println(str);
       }
       sock.close();
       br.close();
       fp.close();
       servsock.close();
       p.close();
    }
}

import java.io.FileInputStream;

public class DemoFile {
	byte buff[];
  public  void readFile() {
	  try {
		  FileInputStream fileinput=new FileInputStream("E:\\photo\\ad.jpeg");
		  int avl=0;
		  avl=fileinput.available();
		   buff=new byte[avl];
		  fileinput.read(buff,0,avl);
		  fileinput.close();
		  
	  }
	  catch (Exception e) {
		// TODO: handle exception
		  System.out.println("file not found "+e);
	}
  }
  void writefile () {
	  
  }
}

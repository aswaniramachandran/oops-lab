import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CO4Pgrm5 {

  public static void main(String[] args)
  {

    try {

      FileReader fr = new FileReader("C:/Users/Aswani/Desktop/javaprg/CO4Pgrm5Write.txt");
      FileWriter fw = new FileWriter("C:/Users/Aswani/Desktop/javaprg/CO4Pgrm5Read.txt");
      String str = "";

      int i;
      while ((i = fr.read()) != -1) {

        str += (char)i;
      }
      fw.write(str);
      fr.close();
      fw.close();

      System.out.println("File reading and writing both done");
    }
    catch (IOException e) 
    {
      System.out.println("There are some IOException");
    }
  }
}
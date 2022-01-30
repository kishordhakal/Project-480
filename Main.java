import java.io.*;
public class Main{

   public static void main(String[] args){
   
      String file= "students.csv";
      BufferedReader reader= null;
      String line = " ";
   
      try {
         reader = new BufferedReader(new FileReader(file));
         while((line= reader.readLine())!= null){
            String[] row = line.split(",");
         
            for (String index: row){
               System.out.printf("%-30s", index);
            }
            System.out.println();
         }
      
      }
      catch(Exception e){
         e.printStackTrace();
      }
      finally {
         try{
            reader.close();
         } catch (IOException e){
            e.printStackTrace();
         }  
      
      }
   }
}
import java.util.*;
import java.io.*;


class uniqueString{

   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
         
      if(check(str) == true){
         System.out.println("unique");
      
      }else{ System.out.println("not unique");}



   }

   public static boolean check(String str){
      boolean[] ch = new boolean[256];
      char[] newArr = str.toCharArray();
      for(int i = 0; i < str.length(); i++){
         int val = newArr[i];
         if (ch[val] == true){
             return false;
         }else{
            ch[val] = true;
         }

      }
      return true;

   }
}

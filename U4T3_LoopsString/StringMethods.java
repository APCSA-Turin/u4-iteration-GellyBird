package U4T3_LoopsString;

public class StringMethods {

public String removeA(String str) {
   String newString = "";
   for (int i  = 0; i < str.length() - 1; i++) {
      if (str.substring(i,i+1).equals("a")) {
         i ++;
         newString += str.substring(i,i+1);
      } else {
         newString += str.substring(i,i+1);
      }

   }
   return newString;
}

}

import java.io.*;
import java.util.*;

class UserMainCode
{
  public String secondWordUpperCase(String input1){
    try{
      String[] str=input1.split(" ");
      if(str.length>1){
        return str[1].toUpperCase();
      }
      else{
        return "LESS";
      }
    }
    catch(Exception e){
      throw new UnsupportedOperationException("secondaryWordUpperCase(String input1)");
    }
  }
}

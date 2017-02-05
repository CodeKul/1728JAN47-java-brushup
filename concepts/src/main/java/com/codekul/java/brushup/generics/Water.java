package com.codekul.java.brushup.generics;

import java.awt.*;

/**
 * Created by aniruddha on 5/2/17.
 */
public class Water {

   public void waterify(Object obj) {
      if(obj instanceof String ) {
         String str = (String) obj;
      }
      else if(obj instanceof Integer){
         Integer i = (Integer) obj;
      }
      else if(obj instanceof Button){
         Button btn = (Button) obj;
      }
      else throw new RuntimeException();
   }
}

package com.ds;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
  
    private static Map<String, Color> colorMap = new HashMap<>();
      
    static
    {
        colorMap.put("blue", new blueColor());
        colorMap.put("black", new blackColor());
    }
      
    public static Color getColor(String colorName)
    {
        return (Color) colorMap.get(colorName).clone();
    }
}
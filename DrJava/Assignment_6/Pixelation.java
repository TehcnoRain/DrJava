package Assignment_6;

import BasicIO.*;
import Media.*;
import java.awt.*;
import static java.awt.Color.*;
import static java.lang.Math.*;

//Shane Thomas
//5901368

public class Pixelation
{
  
  PictureDisplayer display;
  Picture pic;
  
  public Pixelation()
  {
    display = new PictureDisplayer();
    pic     = new Picture();
    
    display.placePicture(pic);
    
    display.waitForUser();
    
    pic = pixelate(pic, 4);
    
    display.close();
  };
  
  public Picture pixelate(Picture picture, int blockSize)
  {
    Color color;
    Picture x = picture;
    Pixel p = picture.getPixel(0, 0);
    int c = 0;
    int r = 0;
    
    int R = 0;
    int G = 0;
    int B = 0;    
    
    while (picture.hasNext())
    {
      color = avg(x, c, r, blockSize);
      
      paint(x, c, r, blockSize, color);
      
      for (int i = 0; i < blockSize; i++)
        p = x.next();
      
      c = c + blockSize;
      if (c == picture.getWidth())
      {
        c = 0;
        r = r + blockSize;
      }      
    }
    return x;
  }  
  
  public Color avg(Picture picture, int c, int r, int blockSize)
  {
    Pixel p;
    
    try
    {
      p = picture.getPixel(c, r);
    }catch(PixelOutOfBoundsException bob)
    {
      return new Color(0, 0, 0);
    }
    
    int oc = c;
    int or = r;
    
    int R = 0;
    int G = 0;
    int B = 0;
    
    for (int i = 0; i < blockSize; i++)
    {
      r = or + i;
      for (int j = 0; j < blockSize; j++)
      {
        c = oc + j;
        try
        {
          p = picture.getPixel(c, r);
        }catch(PixelOutOfBoundsException bob)
        {
          break;
        }
        G = G + p.getGreen();
        B = B + p.getBlue();
        R = R + p.getRed();
      }
           
    }
    
    R = R/(blockSize * blockSize);
    B = B/(blockSize * blockSize);
    G = G/(blockSize * blockSize);
      
    Color average = new Color(R, G, B);
    return average;
  }
    
    public void paint(Picture picture, int c, int r, int blockSize, Color color)
    {
      Pixel p;
    
      try
      {
        p = picture.getPixel(c, r);
      }catch(PixelOutOfBoundsException bob)
      {
        
      }
      
      int oc = c;
      int or = r;
    
      int R = color.getRed();
      int G = color.getGreen();
      int B = color.getBlue();
      
      for (int i = 0; i < blockSize; i++)
      {
        r = or + i;
        for (int j = 0; j < blockSize; j++)
        {
          c = oc + j;
          try
          {
            p = picture.getPixel(c, r);
          }catch(PixelOutOfBoundsException bob)
          {
            break;
          }
          p.setRed(R);
          p.setBlue(B);
          p.setGreen(G);
        }
      }
    }
    
    
  public static void main ( String[] args ) { Pixelation f = new Pixelation(); };
  }
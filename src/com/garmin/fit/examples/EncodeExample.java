////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Dynastream Innovations Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2013 Dynastream Innovations Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 5.20Release
// Tag = $Name: AKW5_200 $
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit.examples;

import com.garmin.fit.*;

public class EncodeExample {
   public static void main(String[] args) {
      System.out.println("FIT Encode Example Application");

      FileEncoder encode;

      try {
         encode = new FileEncoder(new java.io.File("test.fit"));
      } catch (FitRuntimeException e) {
         System.err.println("Error opening file test.fit");
         return;
      }

      FileIdMesg fileIdMesg = new FileIdMesg();

      fileIdMesg.setManufacturer(Manufacturer.DYNASTREAM);
      fileIdMesg.setProduct(0);
      fileIdMesg.setSerialNumber(12345L);

      encode.write(fileIdMesg);

      try {
         encode.close();
      } catch(FitRuntimeException e) {
         System.err.println("Error closing encode.");
         return;
      }
      
      System.out.println("Encoded FIT file test.fit.");
   }
}

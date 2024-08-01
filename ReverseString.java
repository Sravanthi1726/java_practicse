package com.sravanthi.jdbc;
class ReverseString {
  public static void main(String[] args) {
	  // create a StringBuilder object to build the reversed string
	  String input = " Sravanthi";
	  String reverse ="";
	  //Append each character to the StringBuilder
	  for (int i =input.length()-1; i>=0; i--){
		  //Convert the StringBuilder to a String 
		  reverse = reverse + input.charAt(i);
		  //Print the reversed string
	  }
	  System.out.println(reverse);
	
    } 
  }
		
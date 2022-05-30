package com.company;

public class CWH14_StringsMethod {
    public static void main(String[] args) {
        String name="Harry";
//        System.out.println(name);

//        Used to find length
//        System.out.println(name.length());

//        Convert to lowercase/uppercase
        String lstring=name.toLowerCase();
//        System.out.println(lstring);
//        System.out.println(name.toUpperCase());


//        trim se space ht jate ha
        String nonTrimmedString="       Harry     ";
//        String trimmed=nonTrimmedString.trim();
//        System.out.println(nonTrimmedString.length());
//        System.out.println(trimmed);
//        System.out.println(nonTrimmedString.trim());


//        Substring method is used to prind the string after getting the base index value
//        System.out.println(name.substring(1));
//        Start end deene ke baad
//        System.out.println(name.substring(2,4));


//        Replace method is used to replace the character
//        System.out.println(name.replace('r','p'));
//        System.out.println(name.replace("r","ier"));


//        Starts with return true if string start with that particular character
//        System.out.println(name.startsWith("Har"));
//        System.out.println(name.endsWith("rry"));


//        charAt function is used to get the character whose location we have
//        System.out.println(name.charAt(0));


//        IndexOf is used to return the location of the substring
//        System.out.println(name.indexOf("ry"));
        String modifiedName="Harryrry";
//        System.out.println(modifiedName.indexOf("rry",3));


//        It will tell the last index of the character or string
//        System.out.println(modifiedName.lastIndexOf('r'));
//        System.out.println(modifiedName.lastIndexOf("rry",4));


//        System.out.println(name.equals("harry"));
//        System.out.println(name.equalsIgnoreCase("harry"));

//        System.out.println(" I am escape sequence \"double quotes");
        String name2="yrraH";
//        System.out.println(name.compareTo(name2));
        System.out.println(name2.hashCode());
    }
}

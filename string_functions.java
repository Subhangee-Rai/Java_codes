public class string_functions {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println("Original string: "+str);
        System.out.println("Lowercase string: "+str.toLowerCase());
        System.out.println("Uppercase string: "+str.toUpperCase());
        str.toUpperCase();      //will have no effect coz string is immutable
        System.out.println("UpperCase string: "+str);
        int l=str.length();
        System.out.println("String length: "+l);
        String new_string= new String("  Shubhi  ");
        System.out.println("Original string: "+new_string);
        System.out.println("Removing starting and trailing spaces: "+new_string.trim());
        System.out.println("Substring: "+new_string.substring(4));
        System.out.println("Substring: "+new_string.substring(2,8));
        String a=new_string.replace('i','u');   //returns a new string after replacing
        System.out.println("After replacing: "+a);
        System.out.println("Replacing substring: "+str.replace("ell","ipp"));
        System.out.println("Replacing one char with substring: "+str.replace("l","pp"));    //here we can't write 'l' we have to write "l"
        System.out.println(new_string.startsWith("  "));
        System.out.println(new_string.endsWith("  "));
        System.out.println(new_string.charAt(2));
        System.out.println(new_string.indexOf('i'));
        System.out.println(new_string.indexOf("ubh"));
        System.out.println(new_string.indexOf('h'));
        System.out.println(new_string.indexOf('h',4));
        System.out.println(new_string.lastIndexOf("h"));
        System.out.println("Checking equality of 2 strings: "+str.equals("Hello"));
        System.out.println("Checking equality: "+str.equalsIgnoreCase("heLLo"));
        System.out.println("Here we will add \"double quote\" using escape sequence");
    }
}

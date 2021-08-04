

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {
    public static void main(String[] args) {
        ArithmeticException obj_ArithmeticException =new ArithmeticException();
        obj_ArithmeticException.arithmeticException();

        NullPointerException obj_NullPointerException =new NullPointerException();
        obj_NullPointerException.nullPointer();

        StringIndexOutOfBound obj_StringIndexOutOfBound = new StringIndexOutOfBound();
        obj_StringIndexOutOfBound.stringIndex();

        File_not_Found_Exception obj_FilenotFound =new File_not_Found_Exception();
        obj_FilenotFound.filenotFound();

        NumberFormatException obj_NumberFormatException = new NumberFormatException();
        obj_NumberFormatException.numberFormatMethod();

        ArrayIndex_OutofBound obj_ArrayIndexOutofBound = new ArrayIndex_OutofBound();
        obj_ArrayIndexOutofBound.arrayIndexMethod();


    }
}
// Class for ArithmeticException
class ArithmeticException{
   public void arithmeticException(){

       try {   // try is an keyword
           int dividend = 5;
           int divisor = 0;
           int result = dividend / divisor;
       }
        catch (java.lang.ArithmeticException firstException) { // Catch is a keyword
           // firstException is an object of Arithmetic exception which will be returned
           System.out.println(firstException.getMessage()+" Occured please check your code");
       }
    }
}
// Class for  Null Pointer Exception
class NullPointerException{
    public void nullPointer(){

        try {
            String randomString = null; //null value
            System.out.println(randomString.charAt(0));
        }
        catch (java.lang.NullPointerException secondException){
            System.out.println(secondException.getMessage()+" Occured please check");
        }
    }
}
//String Index Out Of Bound class
class StringIndexOutOfBound{
    public void stringIndex(){
        try {
            String string = "Hello my name is Aditya singh "; //Length of string is 30
            char chartoAcess = string.charAt(34); // WE are accessing 35th element
            System.out.println(chartoAcess);
        } catch (StringIndexOutOfBoundsException thirdException) {
            System.out.println(thirdException.getMessage()+" Occured please check ");
        }
    }
}
// Class for File not Found Exception
class File_not_Found_Exception {
    public void filenotFound() {
        try {
            // Creating a new file which is not present in system
            File file = new File("E//file.txt");
            // Creating object of file reader
            FileReader reader = new FileReader("file.txt");
        }
        catch (FileNotFoundException fourthException) {
            System.out.println(fourthException.getMessage()+" Occured please check");
        }
    }
}
// Class for Number Format Exception
class NumberFormatException{
    public void numberFormatMethod (){
        try {
            int anyNumber = Integer.parseInt(null);
            System.out.println(anyNumber);
        }
        catch(java.lang.NumberFormatException fifthException){
            System.out.println(fifthException.getMessage()+" Occured please check");
        }
    }
}
// Class for Array Index Out of Bound Exception
class ArrayIndex_OutofBound{
    public void arrayIndexMethod(){

        try {
            int numbers[] =new int[5]; //Size of array is 5
            numbers[6] = 9; // accessing 7th element in an array of size 5
        }
        catch (ArrayIndexOutOfBoundsException sixthException){
            System.out.println(sixthException.getMessage() +"Occured please check");
        }
    }
}
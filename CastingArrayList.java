import java.util.ArrayList;
public class CastingArrayList{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i<myList.size(); i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("The casted valus is: " + castedValue);
            }catch(Exception e){
                System.out.println("This is an error happended during casting value!");
            }
        }
    }
}
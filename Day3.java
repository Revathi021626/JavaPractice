import java.util.*;
public class main{
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<String, Integer>();//creating hashmap to store keyvalue pair
        hm.put("Revathi",774); //inserting elements
        hm.put("Hemanth",980);
        hm.put("Kushi",979);
        System.out.println(hm);//printing hashmap
        //{Revathi=774,Hemanth=980,Kushi=979}
        System.out.println(hm.get("Revathi")); //Accessing elements by key
        //Output
        //774
        

        hm.remove("Revathi"); //removing particular item from map
        System.out.println(hm);//printing hashmap
        //{Hemanth=980,Kushi=979}

        hm.clear(); //removing all elements or items from the map
        System.out.println(hm);//printing hashmap
        //Output
        //{}



        //Hashset
        HashSet<Integer,String>hs=new HashSet<Integer,String>(); //creating hashset
        hs.add(1,"Revathi"); //ading elements
        hs.add(2,"Hemanth");
        hs.add(3,"Ravi");
        System.out.println(hs); //printing
        hs.remove()//removing item from set
        hs.clear(); //remoing all elements

        System.out.println(hs.contains("Revathi"));// checks if it already exists ornot 
        //Output
        //true


    }
}
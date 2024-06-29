import java.util.ArrayList; //importing arraylist //diff array & arraylist is that the size of array cnt be modified
class main{
    public static void main (String args[]){
        ArrayList<String>a=new ArrayList<String>(); //declaraton of arraylist for string
        a.add("KIA Carnival"); //adding lelements to arraylist
        a.add("KIA Sonet");
        a.add("KIA Sportage");
        System.out.println(a); //printing arraylist
        //Output 
        //[KIA Carnival, KIA Sonet,KIA Sportage]
        a.size(); //gives the size of the arraylist
        System.out.println(a.size());
        //Output
        //3


        a.add(1,"Carvens"); //inserting elements at specific index position
        System.out.println(a);
        // Output
        // [KIA Carnival,Carvens,KIA Sonet,KIA Sportage]

        a.get(2); //accessing element from particular position 
        System.out.println(a);
        //Output KIA Sonet

        a.set(1,"KIA") // changing/updating value of particular element at specific position
        System.out.println(a);
        //Output
        // [KIA Carnival, KIA,KIA Sportage]

        a.remove(1); //removing element from ArrayList
        System.out.println(a);
        //Output
        // [KIA Carnival,KIA Sportage]

        a.clear(); //removes all elements in the arraylist
        System.out.println(a);
        //Output
        //[]


        //Creating arraylist for numbers
        Arraylist<Integer>n=new ArrayList<Integer>(); //numbered array
        n.add(5); /adding elements to the arraylist
        n.add(15);
        n.add(9);
        n.add(12);
        for(int i=0;i<n.size();i++){ //iterating loop through the arraylist
            System.out.println(i); //printing of each element individually
        }
        //Output
        //[5,15,9,12]

       




        //LINKEDLIST
        LinkedList<String>l=new LinkedList<String>(); //creation of linked list
        l.add("Tomato");//adding elements
        l.add("Carrot");
        l.add("Potato");
        l.add("Onion");
        System.out.println(l);
        //Ouput
        //Tomato,Carrot,Potato,Onion

        l.addFirst("Brinjal")//adding element at first
        System.out.println(l);
        //Output
        //Brinjal,Tomato,Carrot,Potato,Onion

        l.addLast("Cabbage")//adding element at last
        System.out.println(l);
        //Output
        //Brinjal,Tomato,Carrot,Potato,Onion,Cabbage

        l.removeFirst()//removing first element from the linkedlist
        System.out.println(l);
        //Output
        //Tomato,Carrot,Potato,Onion

        l.removeLast()//removing last element from the linkedlist
        System.out.println(l);
        //Output
        //Tomato,Carrot,Potato

        System.out.println(l.getFirst()); //prints firstelement of the list
        //Ouput
        //Tomato

        System.out.println(l.getLast()); //prints lastelement of the list
        //Ouput
        //Onion


















        //SORTING
        Arraylist<Integer>num=new ArrayList<Integer>();//integer arraylist
        num.add(2);
        num.add(99);
        num.add(1);
        num.add(76);
        num.add(26);
        Collections.sort(num); //sorting elements in the arraylist in ascending order
        for(int i=0;i<num.size();i++){ //iterating loop through the arraylist
            System.out.println(i); //printing of each element individually
        }
        //Output
        //[1,2,26,76,99]


        Arraylist<Integer>num=new ArrayList<Integer>();//integer arraylist
        num.add(2);
        num.add(99);
        num.add(1);
        num.add(76);
        num.add(26);
         Collections.sort(num,Collections.reverseOrder()); //sorting elements in the arraylist in descending order
        for(int i=0;i<num.size();i++){ //iterating loop through the arraylist
            System.out.println(i); //printing of each element individually
        }
        //Output
        //[99,76,26,2,1]







        



    }

}
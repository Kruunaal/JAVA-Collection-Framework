import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {

        //This is for list ArrayList.
        List<Integer> list = new ArrayList<>();   //This is how you declare ArrayList.

        list.add(10);                //This is how you add element in the ArrayLaist.
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        list.remove(5);          //This is how remove element in the ArrayList.
        System.out.println(list);

        list.set(3,60);   //This is to add element in the at any desired index.
        System.out.println(list);

        System.out.println(list.get(2));    //This is how you get elememt og your desired index.

        System.out.println(list.contains(50));   //This is is to check whetheer your list contains the perticular element or not.

        List<Integer> newlist = new ArrayList<>();

        newlist.add(0);
        newlist.add(1);
        newlist.add(2);
        newlist.add(3);
        newlist.add(4);
        newlist.add(5);

        list.addAll(newlist);             //This is how add another list in the present list.
        
        System.out.println(list);

        newlist.clear();                 //This is how you delete the list.
        System.out.println(newlist);

        for(Integer element: list) {     //This is how you can print every element in the list using the loop like python.
            System.out.println(element);
        }

        //ArrayList is similar to List in the python all the concept are almost same.


        //This is for Stack (remember: Stack uses LIFO method which is Last in first out whenever you pop an element it'll the last element added.)
        Stack<String> stack =  new Stack<>();      //This is how you can define stack.

        stack.push("dog");                   //This is how you add elements in the stack.
        stack.push("cat");
        stack.push("mouse");
        stack.push("horse");
        stack.push("fish");

        System.out.println(stack.peek());       //This is how you can see the last element you added to the stack.

        stack.pop();                           //This is how you delete the last element added to the stack.

        System.out.println(stack);



        //This is for Queue (remember: Queue uses FIFO First in first out method so first element added will be deleted first.)
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);            //This is how you add element in the Queue.
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue);       

        queue.poll();               //This is how you delete element in the Queue it will delete the first element added to the Queue.

        System.out.println(queue);

        System.out.println(queue.peek());    //it till return the first element that added to the Queue which is 10 here.


        
        //This is Priority queue, this is nothing but it'll give priority to certain elements in this case the smallest element.
        Queue<Integer> pqueue = new PriorityQueue<>();

        pqueue.offer(90);            //This is how you add element in the priority Queue.
        pqueue.offer(20);
        pqueue.offer(30);
        pqueue.offer(40);
        pqueue.offer(50);

        System.out.println(pqueue);

        pqueue.poll();            //This is how you delete items in priority que.
 
        System.out.println(pqueue);

        System.out.println(pqueue.peek());     //this is how you see the upper most element in the priority queue.



        //This is for Arraydeque, Arraydeque is similar to Queue but in this one we can add, delete and peek elements from both the ends
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(7);              //Adding an element.
        adq.offer(8);
        adq.offer(9);
        adq.offer(10);
        adq.offerFirst(6);        //Adding element to the first.
        adq.offerLast(11);        //Adding element to the last.

        System.out.println(adq);

        adq.poll();                 //deleting an element.
        adq.pollFirst();            //deleting element from the first.
        adq.pollLast();             //deleting element from the last.

        System.out.println(adq);
        
        System.out.println(adq.peek());                //peeking an element.
        System.out.println(adq.peekFirst());           //peeking element from the first.
        System.out.println(adq.peekLast());            //peeking element from the last.

        List<Integer> l = new ArrayList<>();

        l.add(31);
        l.add(32);
        l.add(33);
        l.add(34);
        l.add(35);

        System.out.println(l);
        l.remove(1);

        System.out.println(l);

        // Set Example
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(100); // Duplicate, will not be added
        System.out.println(set);

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("apple", 30); // Updates value for "apple"
        System.out.println(map);

        // Iterator Example
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
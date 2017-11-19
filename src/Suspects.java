import javax.xml.soap.Node;
import java.util.concurrent.Callable;

public class Suspects
{
    //variables
    private int size = 0;
    //first pushed suspect
    private Node first = null;

    private class Node
    {
        Client value;
        Node next;

        Node(Client value)
        {
            this.value =  value;
            this.next = null;
        }

        @Override
        public String toString()
        {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    public Suspects push(Client value)
    {
        Node newNode = new Node(value);
        newNode.next = first;
        first = newNode;
        return this;
    }

    //Deletes the top first value in the stack
    //the value that has been deleted from the stack or null if the stack is empty

    public Client pop()
    {
        if (first == null)
            return null;
        Client object = first.value;
        first = first.next;
        size--;
        return object;
    }

}

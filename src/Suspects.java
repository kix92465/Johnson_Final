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

    public boolean isEmpty()
    {
        return size == 0 && first == null;
    }

    public int size()
    {
        return size;
    }

    public void print()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        Node current = first;
        while (current != null)
        {
            sb.append("| ").append(current.value).append(" \n");
            for (int i = 0; i < 20; i++)
                sb.append("-");
            sb.append("\n");
            current = current.next;
        }
        System.out.println(sb.toString());
    }

    public void setTop(Node first)
    {
        this.first = first;
    }

    public Node getTop()
    {
       return first;
    }

    public void setTop(Node first)
    {
        this.first = first;
    }

    public Client top()
    {
        if (first == null)
            return null;
        return first.value;
    }

    //Set up Merge Sort

}

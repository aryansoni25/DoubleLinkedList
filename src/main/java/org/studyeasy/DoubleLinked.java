package org.studyeasy;

public class DoubleLinked {
    public Node head,tail;
    public int size;

    public Node createDLL(int nodeValue){
        Node node1=new Node();
        node1.value=nodeValue;
        node1.next=null;
        node1.previous=null;
        head=node1;
        tail=node1;
        size=1;
        System.out.println("Double LinkedList Created");
        return head;
    }
    public void insertValue(int nodeValue,int location){
        Node node1=new Node();
        node1.value=nodeValue;
        if(head==null){
            createDLL(nodeValue);
            return;
        }else{
            if(location==0){
                node1.previous=null;
                node1.next=head;
                head.previous=node1;
                head=node1;
            } else if (location>=size) {
                node1.next=null;
                tail.next=node1;
                node1.previous=tail;
                tail=node1;
            }else{
                Node current=head;
                int idx=0;
                while(idx<location-1){
                    current=current.next;
                    idx++;
                }
                node1.next=current.next;
                node1.previous=current;
                node1.next.previous=node1;
                current.next=node1;
            }
            size++;
        }
    }

    public void traverseDLL(){
        if(head!=null){
            Node temp=head;
            int index=0;
            while (index<size){
                System.out.print(temp.value);
                temp=temp.next;
                if(temp!=tail.next){
                    System.out.print("->");
                }
                index++;
            }
        }else {
            System.out.println("DLL does not exist");
        }
        System.out.println("\n");
    }

    public void reverse(){
        if(head!=null){
            Node temp=tail;
            int index=0;
            while (index<size){
                System.out.print(temp.value);
                temp=temp.previous;
                if(temp!=tail.next){
                    System.out.print("<-");
                }
                index++;
            }
        }else {
            System.out.println("DLL does not exist");
        }
        System.out.println("\n");
    }

    public void searchValue(int valueToBeSearch){
        if(head!=null){
            Node temp=head;
            int index=0;
            while (index<size){
                if(temp.value==valueToBeSearch){
                    System.out.println("Value is at index:"+index);
                    return;
                }
                temp=temp.next;
                index++;
        }
            System.out.println("Value is not present in the DLL");
    }
    }

    public void deleteValue(int location){
        if(head!=null){
            if(location==0){
                if(size==1){
                    head=null;
                    tail=null;
                    size--;
                }else{
                    head=head.next;
                    head.previous=null;
                    size--;
                }
            } else if (location>=size) {
                if(size==1){
                    head=null;
                    tail=null;
                    size--;
                }else {
                    tail=tail.previous;
                    tail.next=null;
                    size--;
                }
            }else{
                Node current=head;
                int index=0;
                while(index<location-1){
                    current=current.next;
                    index++;
                }
                current.next=current.next.next;
                current.next.previous=current;
            }
            size--;
        }
    }

    public void deleteDLL(){
        if(head!=null){
            Node current=head;
            int index=0;
            while(index<size){
                current.previous=null;
                current=current.next;
                index++;
            }
            head = null;
            tail = null;
            System.out.println("The DLL has been deleted!");
        }
    }

}

import java.util.Scanner;
import java.util.Arrays; 

public class WaitingList {
    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
        //Determine whether the list is empty
        if (this.head == null) {
            return null;
        } else {
            //remove and return head
            Node temp = this.head;
            this.head = this.head.getNext();
            numNodes--;
            return temp.patient;
        }
    }

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {
        Node node = new Node(patient);
        //Determine whether the list is empty
        if(this.head == null) {
            this.head = node;
        } else {
            Node nextNode = this.head;
            Node preNode = null;
            //use while loop to Find the right place
            while(nextNode.patient.getTriageLevel()>=patient.getTriageLevel()) {
                preNode = nextNode;
                nextNode = nextNode.next;
                //When it is the last node, end the loop
                if (nextNode == null) {
                    break;
                }
            }
            if(preNode == null) {
                node.next = this.head;
                this.head = node;
            } else {
                node.next = nextNode;
                preNode.next = node;
            }
        }
        numNodes++;
    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
        if(this.head == null) {
            System.out.println("Waiting list is empty");
        } else {
            Node tmp = this.head;
            System.out.println("Name\t\t\tTriageLevel\t\t\tPhoneNumber\t\t\tLocation");
            while(tmp != null) {
                System.out.println(tmp.patient.getName() + "\t\t\t" + tmp.patient.getTriageLevel()
                    + "\t\t\t" + tmp.patient.getPhoneNumber() + "\t\t\t" + tmp.patient.getLocation());
                tmp = tmp.getNext();
            }
        }
    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }


}

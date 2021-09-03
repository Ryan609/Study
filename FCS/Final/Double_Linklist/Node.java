public class Node {
    private String data;
    private Node pre;
    private Node last;

    public Node() {
        
    }

    public Node(String data) {
        this.data = data;
        this.pre = null;
        this.last = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    

    
}

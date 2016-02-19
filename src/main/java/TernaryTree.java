/**
 * Created by asuper on 2/19/16.
 */
public class TernaryTree<T> {
    public TernaryTree(){
        head = null;
    }
    public void insert(String key, T value) {
        if(head != null) {
            head.insert(key, value);
        }
        else {
            head = new TernaryNode<T>(key, value);
        }
    }

    public T get(String key) {
        if(head == null) {
            return null;
        }
        return head.get(key);
    }
    private TernaryNode<T> head;
}

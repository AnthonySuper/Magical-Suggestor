/**
 * Created by asuper on 2/19/16.
 */
class TernaryNode<T> {
    public TernaryNode(char c, T val) {
        letter = c;
        value = val;
    }

    public TernaryNode(String s, T val) {
        if(s.length() == 1) {
            letter = s.charAt(0);
            value = val;
            return;
        }
        else {
            letter = s.charAt(0);
            eq = new TernaryNode<T>(s.substring(1), val);
        }
    }


    protected char letter;
    private T value;
    private TernaryNode<T> gt;
    private TernaryNode<T> lt;
    private TernaryNode<T> eq;
}

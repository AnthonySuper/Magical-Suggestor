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

    public void insert(String key, T val) {
        if(key.length() == 0) {
            value = val;
        }
        else {
            char c = key.charAt(0);
            if(c > letter) {
                if(gt != null) {
                    gt.insert(key, val);
                }
                else {
                    gt = new TernaryNode<T>(key, val);
                }
            }
            if(c < letter) {
                if(lt != null) {
                    lt.insert(key, val);
                }
                else {
                    lt = new TernaryNode<T>(key, val);
                }
            }
            if(c == letter) {
                if(eq != null) {
                    eq.insert(key.substring(1), val);
                }
                else {
                    eq = new TernaryNode<T>(key.substring(1), val);
                }
            }
        }
    }

    protected char letter;
    private T value;
    private TernaryNode<T> gt;
    private TernaryNode<T> lt;
    private TernaryNode<T> eq;
}

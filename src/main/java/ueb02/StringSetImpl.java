package ueb02;

public class StringSetImpl implements StringSet {

    class Element {
        String value;
        Element left, right;

        public int size(){
            int s = 1;
            if(left !=null) s+=left.size();
            if(right!= null) s+=right.size();
            return s;
        }

        public Element(String s, Element le, Element re) {
            value = s;
            left = le;
            right = re;
        }

    }

    private Element root;

    public boolean add(String s) {
        Element e = new Element(s, null, null);

        if (root == null) {
            root = e;
            return true;
        }
        Element it = root;
        while (it != null) {
            if (it.value.equals(e.value))
                return false;
            else if (e.value.compareTo(it.value) < 0) {
                if (it.left == null) {
                    it.left = e;
                    return true;
                } else
                    it = it.left;

            } else {
                if (it.right == null) {
                    it.right = e;
                    return true;

                } else
                    it = it.right;
            }
        }
     return false;

    }


    public boolean contains(String s) {
        if (root == null)
            return false;

        Element it = root;
        while (it != null) {
            if (s.equals(it.value))
                return true;
            else if (s.compareTo(it.value) < 0) {
                it = it.left;
            } else {
                it = it.right;
            }
        } return false;
    }

        //String remove(String s);

        public int size(){
            if(root == null) return 0;
            else return root.size();
        }
    }


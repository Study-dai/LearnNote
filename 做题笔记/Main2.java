package package1214;

import java.util.*;
public class Main2 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        ArrayList<Integer> l = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            l.add(a[i]);
        }
        Collections.sort(l);
        int index = l.size() - 1;
        while (K > 1) {
            int temp = l.get(index);
            index--;
            while (l.get(index) == temp) {
                index--;
            }
            K--;
        }
        return l.get(index);
    }
}
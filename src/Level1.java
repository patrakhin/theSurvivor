import java.util.*;
public class Level1 {
    public static boolean TransformTransform (int A[], int N) {
        LinkedList <Integer> B = new LinkedList<>();
        int k;
        int sum = 0;
        if ((A.length == 1) && (A [0] % 2 == 0)) {
            return true;
        }
        if (A.length == 1) {
            return false;
        }
        //loop Head transform
        for (int h = 0; h < 2; h++) {
            for (int i = 0; i < A.length - 1; i++) {
                for (int j = 0; j < A.length - i - 1; j ++) {
                    k = A[i] + A[j];
                    if (k > j) {
                        B.add(k);
                    }
                    if (k < j) {
                        B.add(j);
                    }
                }
            }
            A = new int[B.size()];
            for (int i = 0; i < B.size(); i++) {
                A [i] = B.get(i);
            }
            B = new LinkedList<>();
            if ((A.length == 1) && (A [0] % 2 == 0)) {
                return true;
            }
            if (A.length == 1) {
                return false;
            }
        }
        for (int j : A) {
            sum += j;
        }
        return sum % 2 == 0;
    }
}

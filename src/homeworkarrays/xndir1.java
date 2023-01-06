package homeworkarrays;

public class xndir1 {
    public static void main(String args[]) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int i, k;
        k = 0;
        for (i = 0; i < chars.length; i++) {
            if (chars[i] == c)
                k++;
        }
        System.out.println(k);

    }
}


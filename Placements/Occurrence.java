public class Occurrence {
    public static void occ(String str, int idx, char element, int[] first, int[] last) {
        // Base case: end of the string
        if (idx == str.length()) {
            System.out.println(first[0]);
            System.out.println(last[0]);
            return;
        }
        
        // Current character in the string
        char curr = str.charAt(idx);

        // Update first and last occurrences
        if (curr == element) {
            if (first[0] == -1) {
                first[0] = idx;
            } else {
                last[0] = idx;
            }
        }
        
        // Recur for the next character
        occ(str, idx + 1, element, first, last);
    }

    public static void main(String[] args) {
        String str = "adafsfswfqfaa";
        int[] first = {-1};
        int[] last = {-1};
        occ(str, 0, 'a', first, last);
    }
}

class Pair {
    char ch;
    int val;

    Pair(char ch, int val) {
        this.ch = ch;
        this.val = val;
    }
}

class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        for (int i = 0; i < s.length(); i++) {
            char ch = sb.charAt(i);
            if (isVowel(ch)) {
                int ascillVal = (int) ch;
                pq.add(new Pair(ch, ascillVal));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = sb.charAt(i);
            if (isVowel(ch) && !pq.isEmpty()) {
                Pair temp = pq.poll();
                sb.setCharAt(i, temp.ch);
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

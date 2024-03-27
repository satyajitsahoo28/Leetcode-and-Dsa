class Solution {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        // Create an array of strings to hold each row
        String[] rows = new String[numRows];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = "";
        }

        // Keep track of the current row and direction (down or up)
        int curRow = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {
            // Append the character to the current row
            rows[curRow] += c;

            // Change direction at the beginning or end of a row
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row based on the direction
           if(!goingDown){
            curRow++;
           }
           else{
            curRow--;
           }
        }

        // Concatenate all rows into a single string
        StringBuilder result = new StringBuilder();
        for (String row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
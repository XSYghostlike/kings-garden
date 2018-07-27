// 6. ZigZag Conversion

class Q6 {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() == 0) {
            return s;
        }

        char[] str = s.toCharArray();
        char[] result = new char[s.length()];

        for (int i=0;i<s.length();i++) {
            result[indexTranslate(i, numRows, s.length() - 1)] = str[i];
        }

        return new String(result);
    }

    private int indexTranslate(int i, int numRows, int lastIndex) {
        int cycleItemsCount = (2 * numRows - 2);

        int indexRemainder = i % cycleItemsCount;
        int totalLengthRemainder = lastIndex % cycleItemsCount;
        int indexReminderConvert = Math.min(indexRemainder, cycleItemsCount - indexRemainder);
        int totalLengthReminderConvert = Math.min(totalLengthRemainder, cycleItemsCount - totalLengthRemainder);
        int indexCycles = i / cycleItemsCount;
        int totalCycles = lastIndex / cycleItemsCount;

        int previousRowsOffset;
        if (indexReminderConvert <= totalLengthReminderConvert) {
            previousRowsOffset = indexReminderConvert;
        } else {
            if (totalLengthRemainder > numRows - 1) {
                previousRowsOffset = 2 * indexReminderConvert - totalLengthReminderConvert;
            } else {
                previousRowsOffset = totalLengthReminderConvert + 1;
            }
        }

        int previousRowsCyclesLength = indexRemainder == 0 ? 0 : (totalCycles * 2 * indexReminderConvert - totalCycles);
        int previousRowsTotalLength = previousRowsCyclesLength + previousRowsOffset;


        int currentLineIndex;
        if (indexRemainder == 0 || indexRemainder == numRows - 1) {
            currentLineIndex = indexCycles;
        } else {
            if (indexRemainder > numRows - 1) {
                currentLineIndex = indexCycles * 2 + 1;
            } else {
                currentLineIndex = indexCycles * 2;
            }
        }

        return currentLineIndex + previousRowsTotalLength;
    }
}

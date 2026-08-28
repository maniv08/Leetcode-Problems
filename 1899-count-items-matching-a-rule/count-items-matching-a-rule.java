class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        int ruleKeyValue = -1;
        if (ruleKey.equals("type")) ruleKeyValue = 0;
        else if (ruleKey.equals("color")) ruleKeyValue = 1;
        else ruleKeyValue = 2;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(ruleKeyValue).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
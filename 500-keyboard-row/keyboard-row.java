class Solution {
    public String[] findWords(String[] words) {
        List <String> result = new ArrayList <> ();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        for (String word : words) {
            String lc = word.toLowerCase();
            if (yes(lc,s1) || yes(lc,s2) || yes(lc,s3)) {
                result.add(word);
            }
        }
                return result.toArray(new String[0]);
    }
        private boolean yes (String word, String row) {
            for (char c : word.toCharArray()) {
                if (row.indexOf(c) == -1)
                return false;
            }
            return true;

        }

    }

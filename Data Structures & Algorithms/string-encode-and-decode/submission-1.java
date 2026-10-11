
class Solution {

    public String encode(List<String> strs) {
        String s = "";

        for (String i : strs) {
            int n = i.length();
            s += n + "#" + i;
        }

        return s;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int n = Integer.parseInt(str.substring(i, j));

            String chars = str.substring(j + 1, j + 1 + n);
            list.add(chars);

            i = j + 1 + n;
        }

        return list;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        List<String> s1 = new ArrayList<>(List.of(s.split("")));
        List<String> t1 = new ArrayList<>(List.of(t.split("")));
        Collections.sort(s1);
        Collections.sort(t1);
        return s1.equals(t1); 

    }
}

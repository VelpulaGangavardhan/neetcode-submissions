class Solution {
    public boolean isAnagram(String s, String t) {
        // List<String> s1 = new ArrayList<>(List.of(s.split("")));
        // List<String> t1 = new ArrayList<>(List.of(t.split("")));
        // Collections.sort(s1);
        // Collections.sort(t1);
        // return s1.equals(t1); 

        if(s.length() != t.length())
            return false;
        
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i:freq){
            if(i!=0)
                return false;
        }

        return true;

    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List> hm = new HashMap<>();

        for(String s : strs){

            char[] c = s.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);
            if(hm.containsKey(s1)){
                hm.get(s1).add(s);
            }else{
                ArrayList<String> al = new ArrayList<>();
                al.add(s);
                hm.put(s1,al);
            }
        }
        return new ArrayList(hm.values());
        
    }
}

package Strings;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        char ch;
        // string ransomNote
        for(int i=0;i<ransomNote.length();i++){
            ch=ransomNote.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
            map.put(ch,map.get(ch)+1);
            }
        }
        // string magzine;
        for(int i=0;i<magazine.length();i++){
            ch=magazine.charAt(i);
            if(map.containsKey(ch)&&map.get(ch)>0){
                map.put(ch,map.get(ch)-1);
            }
            else{
                 continue;
            }  
        }
       for(int count: map.values()){
        if(count!=0){
            return false;
        }
       }
       return true;
    }
}
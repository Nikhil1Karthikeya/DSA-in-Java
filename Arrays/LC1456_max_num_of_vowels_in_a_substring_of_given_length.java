class Solution {
        public boolean isVowel(char ch)
{
    return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
        || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
}
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(isVowel(ch)){
        count++;
        }
        }
        int maxcount=count;
        for(int i=1;i<=(s.length()-k);i++){
            char ch=s.charAt(i+k-1);
            char prev=s.charAt(i-1);
        if(isVowel(prev)){
            count--;
        }
        if(isVowel(ch)){
        count++;
        }
if(count>maxcount){
maxcount=count;
}
        }
        return maxcount;
    }
}
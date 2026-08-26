class Solution {
    public String sortVowels(String s) {
         int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U') {
                count++;
			}
        }
        char[] c = new char[count];
        int p=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U') {
				c[p++]=s.charAt(i);
			}
        }int t=0;
        char[] cc = s.toCharArray();
        Arrays.sort(c);
        for(int i=0; i<s.length(); i++){
             if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U') {
				cc[i]=c[t++];
			}
        }return new String(cc);
    }
}
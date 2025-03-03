
class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
         HashSet <Integer> s=new HashSet<>();
  ArrayList < Integer > Union=new ArrayList<>();
  for(int i=0;i<a.length;i++)
  {
      s.add(a[i]);
  }
  for(int i=0;i<b.length;i++)
  {
      s.add(b[i]);
      
  }
        for(int it:s)
        {
            Union.add(it);
        }
        return Union.size();
    }
}

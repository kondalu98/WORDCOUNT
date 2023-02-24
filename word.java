import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hs = new HashMap<>();
        String s = sc.nextLine();
        String[] sr = s.split(" ");
        

        for (int i = 0; i < sr.length; i++) 
        {
            int c = 0;

            for (int j = 0; j < sr.length; j++)
             {

                if (sr[i].equals(sr[j])) {
                    c++;

                }
            }
            hs.put(sr[i], c);
            

        }
        Set se=hs.keySet();
       for(Object ob: se)
       {
        Object obb=hs.get(ob);
        System.out.println(obb+"\t"+ob);
       }
    }

}

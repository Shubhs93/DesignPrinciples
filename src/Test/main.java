package Test;

import java.util.*;

public class main {
    static HashMap<String,String> hm=new HashMap();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()){
            String a =input.nextLine();
            if(a.indexOf('>')!=-1){
                String from =a.charAt(0)+"";
                int i=a.indexOf('>');
                String to=a.charAt(i+1)+"";
                hm.put(from ,to);
                System.out.println(from+" put in hm "+to);
            }else if(a.indexOf(',')!=-1){
                System.out.println(doLinkedListIntersects(a));
            }

        }
    }

    static boolean doLinkedListIntersects(String s){
        int n=s.length();
        HashSet<String> setNodesSofar=new HashSet<>();
        for(int i=0;i<n;i++){
            char cur=s.charAt(i);
            if(cur==','){
                continue;
            }else{
                if(intersects(cur+"",setNodesSofar)){
                    return true;
                }
            }
        }
        return false;
    }
    static  boolean intersects(String s,HashSet<String> setNodesSofar){
        HashSet<String> mapStartNode=createMap(s);
        for(String ele : mapStartNode){
            if(setNodesSofar.contains(ele)){
                return true;
            }
            setNodesSofar.add(ele);
        }
        return false;
    }
    static HashSet<String> createMap(String s){
        HashSet<String> visited=new HashSet();
        while(!visited.contains(s)){
            visited.add(s);
            if(!hm.containsKey(s)){
                break;
            }
            s=hm.get(s);
        }
        return  visited;
    }
}

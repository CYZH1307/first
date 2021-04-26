import java.util.*;

class Main{
    public static void main(String[] args) {
        Random r = new Random();
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> v = new ArrayList<>();
        for(int i = 0;i<10;i++){
            v.add(r.nextInt());
        }
        for(int i = 0;i<10;i++){
            map.put(v.get(i),101+i);
        }
        Collections.sort(v);
        for(int i = 0;i<10;i++){
            if(i==0) System.out.println(map.get(v.get(i))+" 号获得一等奖");
            else if(i<3) System.out.println(map.get(v.get(i))+" 号获得二等奖");
            else if(i<6) System.out.println(map.get(v.get(i))+" 号获得三等奖");
            else System.out.println(map.get(v.get(i))+" 号获得四等奖");
        }
        // for(int i = 0;i<10;i++){
        //     System.out.println(map.get(v.get(i)) + " " + v.get(i));
        //}
    }
}

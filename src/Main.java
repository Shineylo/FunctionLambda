import java.util.ArrayList;

public class Main {

    interface FunctionDeFiltre {
        boolean f(int x);
    }

    public static void main(String[] args) {
        int[] tab = new int[]{1,2,3,4};
        int[] tabfilter = filter(tab,e ->e % 2 == 0);

        for (int i: tabfilter
             ) {
            System.out.println(i);
        }
    }

    public static int[] filter(int[] tab,FunctionDeFiltre c){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i:tab) {
            if(c.f(i)){
                result.add(i);
            }
        }
        int[] retour = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            retour[i] = result.get(i);
        }
        return retour;
    }
}
import java.util.Objects;

public class DataTypes {
    public static void main(String[] args){
        String name1 = "Weerayooth" + "asdf";
        String name2 = new String("Weerayooth");

        for (int i = 0; i < name1.length(); i++) {
            System.out.println(name1.charAt(i));
        }

        int[] scores = new int[5];
        scores[0]=0;
        scores[1]=10;
        scores[2]=20;
        scores[3]=30;
        scores[4]=40;

        // foreach
        for (int score : scores) {
            System.out.println(score);
        }

        int[] counts = new int[]{634,231,12,14,12,645};
        // foreach
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " : " + counts[i]);
        }


        if (Objects.equals(name1, "Weerayooth")){
            System.out.println("OK1");
        }

        // use Constant.equals for null safety
        if ("Weerayooth".equals(name2)){
            System.out.println("OK2");
        }
    }
}

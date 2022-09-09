import java.util.ArrayList;
import java.util.List;

public class FatheSon1 {
    public static void main(String[] args) {
        String[][] familyRelation = {
                  {"lukr", "shaw"},
                  {"wayne", "rooney"},
                  {"rooney", "ronaldo"},
                  {"shaw", "rooney"}
        };
        System.out.println(family(familyRelation, "ronaldo"));
    }


    public static int family(String[][] familyRelation, String name) {
        int GrandChildren  = 0;
        List<String> children = new ArrayList<>();
        for (String[] strings : familyRelation) {
            if (name.equals(strings[1]))
                children.add(strings[0]);
        }
        for(String names : children) {
            for (String[] strings : familyRelation) {
                if (names.equals(strings[1]))
                    GrandChildren++;
            }
        }
        return GrandChildren;
    }

}

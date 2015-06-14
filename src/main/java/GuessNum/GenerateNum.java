package GuessNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateNum {
    public String generate() {
        String result = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(new Integer(i));
        //打乱
        Collections.shuffle(list);
        for (int i = 0; i < 4; i++) {
            result += (char) (list.get(i) + 48);
        }

        return result;
    }
}

package ques2;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
    public void duplicateElement(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        boolean duplicate = false;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                duplicate = true;
            }
        }
        if (!duplicate) {
            System.out.println("-1");
        }
    }
}

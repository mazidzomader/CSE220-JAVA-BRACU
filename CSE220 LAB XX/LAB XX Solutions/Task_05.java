import java.util.ArrayList;
import java.util.List;

public class Task_05 {
    public static List<Integer> flattenList(List<?> myList, List<Integer> outputList) {
        if (outputList == null) {
            outputList = new ArrayList<>();
        }

        for (Object element : myList) {
            if (element instanceof List) {
                flattenList((List<?>) element, outputList);
            } else {
                outputList.add((Integer) element);
            }
        }

        return outputList;
    }
}

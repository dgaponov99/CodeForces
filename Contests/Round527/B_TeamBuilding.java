import java.util.*;

public class B_TeamBuilding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> students = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (!students.containsKey(a))
                students.put(a, 1);
            else students.remove(a);
        }

        Iterator<Integer> iterator = students.keySet().iterator();
        int[] studentWithoutPartner = new int[students.size()];
        int j = 0;
        for (; iterator.hasNext(); ) {
            Integer integer = iterator.next();
            studentWithoutPartner[j] = integer;
            j++;
        }

        Arrays.sort(studentWithoutPartner);
        int tasks = 0;
        for (int i = studentWithoutPartner.length - 2; i >= 0; i -= 2) {
            tasks += studentWithoutPartner[i + 1] - studentWithoutPartner[i];
        }
        System.out.println(tasks);
    }
}

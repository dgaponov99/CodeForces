import java.util.*;

public class C_MultiOlympiad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<Integer, Skill> subjects = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            int r = scanner.nextInt();


            if (!subjects.containsKey(s)) {
                subjects.put(s, new Skill());
            }
            subjects.get(s).skills.add(r);
            subjects.get(s).sum += r;
        }

        int max = 0;
        for (Skill skill : subjects.values()) {
            Collections.sort(skill.skills);
            Collections.reverse(skill.skills);
            skill.sum = 0;
            int len = skill.skills.size();
            if (len > max) {
                max = len;
            }
        }

        ArrayList<Integer> keys = new ArrayList<>(subjects.keySet());
        long maxSum = 0;
        for (int i = 1; i < max; i++) {
            long sum = 0;
            for (int j = 0; j < subjects.size(); j++) {
                Skill skill = subjects.get(keys.get(j));
                if (skill.skills.size() >= i) {
                    skill.sum += skill.skills.get(i-1);
                    if (skill.sum > 0){
                        sum += skill.sum;
                    }
                }
            }
            if (sum > maxSum){
                maxSum = sum;
            }
            sum = 0;
        }

        System.out.println(maxSum);
    }
}

class Skill {
    ArrayList<Integer> skills = new ArrayList<>();
    long sum = 0;
}

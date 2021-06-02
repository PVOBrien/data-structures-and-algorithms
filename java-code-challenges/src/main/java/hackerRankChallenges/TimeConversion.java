package hackerRankChallenges;

public class TimeConversion {

    public static String timeConversion(String s) {

        System.out.println("This is s: " + s);
        char aOrP = s.charAt(s.length() - 2);
        System.out.println("This is s: " + aOrP);

        if (aOrP == 'P') {
            int hours = Integer.parseInt(s.substring(0, 2));
            System.out.println("Hours: " + hours);
            if (hours != 12) hours += 12;
            String hoursStr = Integer.toString(hours);
            return hoursStr + s.substring(2, s.length() - 2);
        } else {
            if (s.startsWith("12")) {
                s = s.replace("12", "00");
            }
        }
        return s.substring(0, s.length() - 2);
    }
}

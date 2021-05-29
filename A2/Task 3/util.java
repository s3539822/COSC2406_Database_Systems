import java.util.List;

public final class util {
    public static final int RECORD_LENGTH = 56;

    private static String tabString(int tabs) {
        StringBuilder string = new StringBuilder();
        string.append("\t".repeat(Math.max(0, tabs)));
        return string.toString();
    }

    public static String listToString(List<?> list) {
        return listToString(list, 0);
    }

    public static String listToString(List<?> list, int tabs) {
        StringBuilder string = new StringBuilder();
        string.append(tabString(tabs));
        string.append("[");
        for (Object o : list) {
            string.append("\n\t");
            string.append(tabString(tabs));
            string.append(o.toString());
        }
        string.append("\n");
        string.append(tabString(tabs));
        string.append("]");
        return string.toString();
    }

    public static String dateStringBuilder(String date) {
        String year = date.substring(0, 4);
        String month = date.substring(4, 6);
        String day = date.substring(6, 8);
        String hour = date.substring(8);

        if (hour.equals("12")) hour = "00";
        else if (hour.equals("24")) hour = "12";

        return String.format("%s/%s/%s %s:00:00", year, month, day, hour);
    }
}

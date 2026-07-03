import java.util.Arrays;
import java.util.Comparator;

public class Search {

    // Linear Search
    public static Product linear(Product[] p, String key) {

        for (Product x : p) {
            if (x.name.equalsIgnoreCase(key)) {
                return x;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binary(Product[] p, String key) {

        Arrays.sort(p, Comparator.comparing(a -> a.name));

        int l = 0;
        int r = p.length - 1;

        while (l <= r) {

            int m = (l + r) / 2;

            int c = p[m].name.compareToIgnoreCase(key);

            if (c == 0)
                return p[m];

            if (c < 0)
                l = m + 1;
            else
                r = m - 1;
        }

        return null;
    }
}
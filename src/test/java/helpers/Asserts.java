package helpers;

import org.junit.Assert;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Asserts {

    public static void assertEqualWithOrder(List expected, List actual) {
        assertEqualWithOrder(expected.toString(), actual);
    }

    public static void assertEqualWithOrder(String expected, List actual) {
        Assert.assertEquals(
                expected
                        .replace("\n","")
                        .replace(" ", ""),

                actual.
                        toString()
                        .replace(" ",""));
    }

    public static <T> void assertEqualNoOrder(Collection<T> expected, List<T> actual) {

        Set<T> set = new HashSet<>(actual);
        Set<T> e = new HashSet<>(expected);
        Assert.assertEquals(e.toString().replace("\n","").replace(" ", ""),
                set.toString().replace(" ",""));
    }
}

package FindTheOddInt;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindOdd {
    public static int findIt(int[] array) {
            return Arrays.stream (array)
                    .boxed ( )
                    .collect(Collectors.groupingBy (Function.identity (), Collectors.counting ()))
                    .entrySet ( )
                    .stream ( )
                    .filter (e -> e.getValue ( ) % 2 != 0)
                    .limit (1)
                    .findFirst ( )
                    .get ( )
                    .getKey ( );
        }
    }
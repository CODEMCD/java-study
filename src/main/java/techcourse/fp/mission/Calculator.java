package techcourse.fp.mission;

import java.util.List;

public class Calculator {
    public static int sumAll(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
//            total += number;
//            total += sum(number, new SumStrategy() {
//                @Override
//                public boolean isSummable() {
//                    return true;
//                }
//            });
            total += sum(number, () -> {
                return true;
            });
        }
        return total;
    }

    public static int sumAllEven(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
//            if (number % 2 == 0) {
//                total += number;
//            }
//            total += sum(number, new SumStrategy() {
//                @Override
//                public boolean isSummable() {
//                    return (number % 2 == 0);
//                }
//            });

            total += sum(number, () -> {
                return (number % 2 == 0);
            });
        }
        return total;
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        int total = 0;

        //TODO: List에 담긴 값 중 3보다 큰 수만을 더해야 한다.
        for (Integer number : numbers) {
            total += sum(number, new SumStrategy() {
                @Override
                public boolean isSummable() {
                    return (number > 3);
                }
            });
        }

        return total;
    }

    private static Integer sum(Integer number, SumStrategy sumStrategy) {
        if(sumStrategy.isSummable()) {
            return number;
        }
        return 0;
    }
}

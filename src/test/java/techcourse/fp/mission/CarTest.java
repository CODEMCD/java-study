package techcourse.fp.mission;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    public void 이동() {
        Car car = new Car("pobi", 0);
//        Car actual = car.move(new MoveStrategy() {
//            @Override
//            public boolean isMovable() {
//                return true;
//            }
//        });
//        assertThat(actual).isEqualTo(new Car("pobi", 1));
        Car actualLamdba = car.move(() -> {
            return true;
        });
        assertThat(actualLamdba).isEqualTo(new Car("pobi", 1));
    }

    @Test
    public void 정지() {
        Car car = new Car("pobi", 0);
//        Car actual = car.move(new MoveStrategy() {
//            @Override
//            public boolean isMovable() {
//                return false;
//            }
//        });
//        assertThat(actual).isEqualTo(new Car("pobi", 0));
        Car actualLamdba = car.move(() -> {
            return false;
        });
        assertThat(actualLamdba).isEqualTo(new Car("pobi", 0));
    }
}
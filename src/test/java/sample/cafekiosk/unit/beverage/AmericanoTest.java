package sample.cafekiosk.unit.beverage;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AmericanoTest {

  @Test
  void getName() {
    Americano americano = new Americano();

//    assertEquals(americano.getName(), "아메리카노"); JUnit 라이브러리
    assertThat(americano.getName()).isEqualTo("아메리카노"); // assertJ 라이브러리
  }

  @Test
  void getPrice() {
    Americano americano = new Americano();

    assertThat(americano.getPrice()).isEqualTo(4000);
  }
}
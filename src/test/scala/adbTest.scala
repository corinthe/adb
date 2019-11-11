import org.scalatest.FunSuite

class adbTest extends FunSuite {

  test("A simple staircase") {
    assertResult(8) {
      adb.totalSteps(2)(Array(15))
    }
  }

  test("A more complex staircase") {
    assertResult(18) {
      adb.totalSteps(2)(Array(15, 15))
    }
  }

  test("A very complex staircase") {
    assertResult(44) {
      adb.totalSteps(3)(Array(5, 11, 9, 13, 8, 30, 14))
    }
  }

  test("A non-conform staircase") {
    assertThrows[AssertionError] {
      adb.totalSteps(1)(Array(15))
    }
    assertThrows[AssertionError] {
      adb.totalSteps(6)(Array(15))
    }
    assertThrows[AssertionError] {
      adb.totalSteps(2)(Array())
    }
    assertThrows[AssertionError] {
      adb.totalSteps(3)(Array(1))
    }
    assertThrows[AssertionError] {
      adb.totalSteps(2)(Array(100))
    }
    assertThrows[AssertionError] {
      adb.totalSteps(2)(new Array[Int](60).map(_ => 20))
    }
  }
}

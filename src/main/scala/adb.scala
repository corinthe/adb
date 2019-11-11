object adb {

  def totalSteps(stepsPerFlight: Int)(staircase: Array[Int]): Int = {
    assert(staircase.length >= 1 && staircase.length <= 50, "The staircase is not conform.")
    assert(staircase.forall(staircase => staircase >= 5 && staircase <= 30), "Not all flights of stairs are conform.")
    assert(stepsPerFlight >= 2 && stepsPerFlight <= 5, "Steps per flight is not conform.")

    staircase.foldLeft(0)((acc, curr) => acc + Math.ceil(curr/stepsPerFlight.toDouble).toInt) + (staircase.length - 1) * 2
  }
}

object SpaceAge {
  private val secondsPerEarthYr: Int = 31_557_600

  private def secondsToYears(seconds: Double, orbitalPeriodInEarthYears: Double) =
    seconds / (secondsPerEarthYr * orbitalPeriodInEarthYears)
  
  def onEarth(age: Double): Double = secondsToYears(age, 1)

  def onVenus(age: Double): Double = secondsToYears(age, 0.61519726)

  def onMercury(age: Double): Double = secondsToYears(age, 0.2408467)

  def onMars(age: Double): Double = secondsToYears(age, 1.8808158)

  def onJupiter(age: Double): Double = secondsToYears(age, 11.862615)

  def onSaturn(age: Double): Double = secondsToYears(age, 29.447498)

  def onUranus(age: Double): Double = secondsToYears(age, 84.016846)

  def onNeptune(age: Double): Double = secondsToYears(age, 164.79132)
}

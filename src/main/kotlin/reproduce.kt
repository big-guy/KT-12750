import org.joda.time.*

private fun toDateTimeRange(timeZone: DateTimeZone): ClosedRange<DateTime> {
  val minOffset = 1L
  val maxOffset = 1L
  val now = DateTime.now(timeZone)
  val min = now.withDurationAdded(minOffset, 1)
  val max = now.withDurationAdded(maxOffset, 1)
  return min..max
}

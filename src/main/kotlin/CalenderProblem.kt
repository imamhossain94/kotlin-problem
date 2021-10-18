import java.util.*


class TimeConverter {

    var timeList = emptyList<String>()
    var timeHour = 0
    var timeMinute = 0
    var totalTimeInMinutes = 0

    fun convert(time:String) {
        timeList= time.split(':')
        timeHour = timeList[0].toInt()
        timeMinute = timeList[1].toInt()
        totalTimeInMinutes = (timeHour*60) + timeMinute
    }

}


fun main(args: Array<String>){

    // Kotlin add extra time with current time

    val startTime:String = "10:00"
    val endTime:String = "11:30"

    val startTimeConverter = TimeConverter()
    startTimeConverter.convert(startTime)

    println(startTimeConverter.timeHour)






    val startTimeList:List<String> = startTime.split(':')
    val startTimeHour = startTimeList[0].toInt()
    val startTimeMinute = startTimeList[1].toInt()
    val startTimeInMinutes = (startTimeHour*60) + startTimeMinute


    val currentCalender: Calendar = Calendar.getInstance()
    val currentHour = currentCalender.get(Calendar.HOUR_OF_DAY)
    val currentMinute = currentCalender.get(Calendar.MINUTE)
    val currentTimeInMinutes = (currentHour*60) + currentMinute

//    println(startTimeInMinutes)
//    println(currentTimeInMinutes)
//
//    println(currentCalender.get(Calendar.MINUTE))


//    val currentCalender: Calendar = Calendar.getInstance()
//
//    val firingCal: Calendar = Calendar.getInstance()
//    firingCal.set(Calendar.HOUR_OF_DAY, 8)
//    firingCal.set(Calendar.MINUTE, 0)
//    firingCal.set(Calendar.SECOND, 0)
//
//    if (firingCal < currentCalender) {
//        firingCal.add(Calendar.MINUTE, 90)
//    }
//    val intendedTime: Long = firingCal.timeInMillis
//
//
//    println(currentCalender.time)
//    currentCalender.add(Calendar.MINUTE, 90)
//    println(currentCalender.time)
//
//    println(firingCal.time)


}

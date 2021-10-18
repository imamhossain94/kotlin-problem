import java.util.*

fun main(args: Array<String>){

    val firingCal: Calendar = Calendar.getInstance()
    val currentCal: Calendar = Calendar.getInstance()

    //firingCal.set(Calendar.HOUR_OF_DAY, 8)
    firingCal.set(Calendar.MINUTE, 0)
    firingCal.set(Calendar.SECOND, 0)

    if (firingCal < currentCal) {
        firingCal.add(Calendar.DAY_OF_MONTH, 1)
    }
    val intendedTime: Long = firingCal.timeInMillis

    println(currentCal.time)
    println(firingCal.time)
    

}

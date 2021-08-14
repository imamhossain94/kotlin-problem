
/*
    Parsing data from a known string accurately
    author: imamhossain94 (Md. Imam Hossain)
*/


fun main(args: Array<String>) {


    val data:String = "{receivedTime=1591457696860000, category=General, title=Notice About Final Exam. Spring, 2021, url=https://www.bubt.edu.bd/home/notice_details/619}"

    val firstPart = data.split(", title=")
    val secondPart = firstPart[0].split(", category=")

    val title = firstPart[1].split(", url=")[0]
    val url = firstPart[1].split(", url=")[1].replace('}', ' ').trim()


    val receivedTime = secondPart[0].split("{receivedTime=")[1]
    val category = secondPart[1]

    println(receivedTime)
    println(category)
    println(title)
    println(url)

}





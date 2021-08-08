fun main(args: Array<String>) {
    val data:String = "{receivedTime=1591457696860000, category=General, title=Notice About Final Exam. Spring, 2021, url=https://www.bubt.edu.bd/home/notice_details/619}"

    println(data.split(", title=")[0])
    println(data.split(", title=")[1])

    println(data.split(", title=")[1].split(", url=")[0])
    println(data.split(", title=")[1].split(", url=")[1].split("}")[0])
//    val splitData = data.split(',').toTypedArray()
//
//    val receivedTime = splitData[0].split('=').toTypedArray()[1]
//    val category = splitData[1].split('=').toTypedArray()[1]
//    val title= splitData[2].split('=').toTypedArray()[1]
//    val url = splitData[3].split('=').toTypedArray()[1].replace('}', ' ').trim()
//    println(receivedTime)
//    println(category)
//    println(title)
//    println(url)
}





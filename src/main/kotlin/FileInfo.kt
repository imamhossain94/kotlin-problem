import java.net.URL
import java.net.URLConnection
import java.nio.file.Paths
import java.text.SimpleDateFormat
import java.util.*
import kotlin.io.path.extension
import kotlin.io.path.name

/*
    Get file information from remote url
    author: imamhossain94 (Md. Imam Hossain)
*/


fun main(args: Array<String>){

    val url = URL("https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4")
    val connection:URLConnection = url.openConnection()

    val fileBaseName = Paths.get(url.path).fileName
    val fileExtension = Paths.get(url.path).extension
    val fileName = Paths.get(url.path).name
    val fileSize = "${String.format("%.2f", connection.contentLength.toDouble()/1048000).toDouble()} MB"
    val fileLastModifiedDate = getFileModifiedDate(connection)
    val contentType = connection.contentType


    // Only for android
    // video thumbnail
    //implementation 'com.github.bumptech.glide:glide:4.12.0'
    //GlideApp.with(context).load(url).into(image_view)

    println(fileBaseName)
    println(fileExtension)
    println(fileName)
    println(fileSize)
    println(fileLastModifiedDate)
    println(contentType)

}

fun getFileModifiedDate(urlConnection:URLConnection):String {
    val sdf = SimpleDateFormat("MM/dd/yyyy")
    val netDate = Date(urlConnection.lastModified)
    return sdf.format(netDate)
}

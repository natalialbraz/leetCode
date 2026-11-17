package plans.coderbyte.chalenge_url

import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://coderbyte.com/api/challenges/logs/user-info-csv")
    val connection = url.openConnection() as HttpURLConnection

    connection.requestMethod = "GET"
    val response = connection.inputStream
        .bufferedReader()
        .use { (it.readText()) }

    val lines = response.lines()
    val registers = lines.drop(1)
    val sortedRows = registers.map {
        it.split(",")
    }.sortedBy {
        it[1]
    }

    print(sortedRows.flatten().joinToString(","))
}

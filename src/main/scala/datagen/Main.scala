package datagen
import datagen.Order
import java.text.SimpleDateFormat
import java.util.Calendar
import scala.collection.mutable.ListBuffer

object main {

  def main(args: Array[String]): Unit = {
    val format = new SimpleDateFormat("MM-dd-y")
    val currentDay = format.format(Calendar.getInstance().getTime())

    val orderList = new ListBuffer[String]()
    for(itr <- 1 to 10){
        val order = new Order(itr, currentDay)
        orderList += order.generateRow()
    }
    for(o <- orderList){
        println(o)
    }
  }

}

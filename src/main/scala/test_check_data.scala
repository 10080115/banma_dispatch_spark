import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by shiweili on 2017/7/19.
  */
object test_check_data {
  def main(String:  Array[String]): Unit ={
    val conf = new SparkConf()
      .setMaster("127.0.0.1")
      .setAppName("checkData")
    val sc = new SparkContext(conf)
    val rowData = sc.textFile("time_node_dispatchtime.txt")
    print(3)
    rowData.foreach(println)
  }
}

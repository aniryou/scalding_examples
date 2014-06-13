package scalding.examples

import com.twitter.scalding._
import java.net.URL

class FilterHostByURLCountJob(args : Args) extends Job(args) {
  TextLine( args("input") )
    .map('line -> 'host) {
      line : String => 
		{
			new URL(line).getHost() match {
				case x if x.startsWith("www.") => x.substring(4)
				case y => y
			}
		}
    }
    .groupBy('host) { _.size }
    .filter('size) { size:Int => size > 5}
    .write( Tsv( args("output") ) )

  // split a piece of text into individual words
  def tokenize(text : String) : Array[String] = {
    text.toLowerCase.split(" ")
  }
}

object FilterHostByURLCountJob extends App {
  val progargs: Array[String] = List(
    "-Dmapred.map.tasks=200",
    "scalding.examples.FilterHostByURLCountJob",
    "--input", "/tmp/files",
    "--output", "/tmp/filteredhost.txt",
    "--hdfs"
  ).toArray
  Tool.main(progargs)
}

scalding_examples
=================

Skeleton scalding examples

Scalding documentation, tutorials and more examples:

https://github.com/twitter/scalding/wiki

Recommended reading on map reduce:

http://www.thegeekstuff.com/2012/01/hadoop-hdfs-mapreduce-intro/

https://www.inkling.com/read/hadoop-definitive-guide-tom-white-3rd/chapter-6/shuffle-and-sort

## Filter Host by URL Count
lein run scalding.examples.FilterHostByURLCountJob --local --input src/main/resources/sampleurls.txt --output counts.tsv

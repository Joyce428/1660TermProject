# 1660TermProject

How to get the application running?

1, create cluster


2)upload WordCount.jar to cluster

3)upload data files to one directory (in Cluster SSH) 

(this can become a two-level directory. For example,  firstLevel is called  "inputData". Second level are directories such as Hugo, Histories and Tolstoy)

(type in SSH terminal)
tar xfz Hugo.tar.gz

tar xfz Tolstoy.tar.gz

tar xfz shakespeare.tar.gz


4)
hadoop fs -put WordCount.jar /


hadoop fs -put /histories/. /tmp/inputData

hadoop fs -put /comedies/. /tmp/inputData

hadoop fs -put /tragedies/. /tmp/inputData

hadoop fs -put /poetry/. /tmp/inputData

hadoop fs -put /Tolstoy/. /tmp/inputData

hadoop fs -put /Hugo/. /tmp/inputData



5)
type in GCP cluster SSH, to run the program

"hadoop jar WordCount.jar /tmp/inputData/ /tmp/output8/ "


to retrieve output to the google terminal:

"hadoop fs -get /tmp/output8"


"cd output8"

"more part-r-00000"


--------------------------------
For the GUI:

Download "input1.txt" and "MyGUI.java"

and just run it in the command prompt



Functions not working:

NOt running in the Docker

frontend GUI application cannot find the wordcount


Functions Working:

GUI application can receive user input

inverted index, for wordcount in each file can work

no duplicates of words in different reducers



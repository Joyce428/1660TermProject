# 1660TermProject

How to get the application running?

1, create cluster
2)upload WordCount.jar to cluster

3)upload data files to one directory (in Cluster SSH) (this can be a two-level directory. For example,  firstLevel is called  "inputData". Second level are directories such as Hugo, Histories and Tolstoy)

(type in SSH terminal)
tar xfz Hugo.tar.gz
tar xfz Tolstoy.tar.gz
tar xfz shakespeare.tar.gz


)
hadoop fs -put WordCount.jar /

type in GCP cluster SSH    
"hadoop jar WordCount.jar /tmp/inputData/ /tmp/output8/ "




Functions not working:
NOt running in the Docker
frontend GUI application cannot find the wordcount


GUI application can receive input

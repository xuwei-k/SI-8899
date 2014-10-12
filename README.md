# https://issues.scala-lang.org/browse/SI-8899


## https://travis-ci.org/xuwei-k/SI-8899/builds/37729416


```
[error] (run-main-1) java.lang.AbstractMethodError
java.lang.AbstractMethodError
        at scala.collection.TraversableLike$class.filter(TraversableLike.scala:270)
        at si8899.MyMap.filter(MyMap.scala:3)
        at si8899.Main$.main(Main.scala:7)
        at si8899.Main.main(Main.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:483)
```



### LICENSE

public domain

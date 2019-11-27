# JNI example with C/C++

## STEP 1: generate JNI header
```bash
/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/bin/javac \
-h . MyJNIExample.java
```


## STEP 2 (C): compile C binary files
### for linux
```bash
gcc -fPIC -shared -o libhelloc.so    \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/ \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/darwin/ \
MyJNIExample.c
```

### for TODO macOS
```bash
gcc -dynamiclib -o libhelloc.dylib  \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/ \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/darwin/ \
MyJNIExample.c
```

## STEP 2 (C++): compile C++ binary files
### for linux
```bash
gcc -fPIC -shared -fPIC -o libhellocpp.so    \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/ \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/darwin/ \
MyJNIExample.cpp
```
 
### for macOS
```bash
g++ -fPIC -dynamiclib -o libhellocpp.dylib  \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/ \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/darwin/ \
MyJNIExample.cpp
```


## STEP 3: run example
```bash
/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/bin/java -Djava.library.path=. MyJNIExample
```

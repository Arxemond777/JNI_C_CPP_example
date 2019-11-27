// STEP 1
/**
 * /Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/bin/javac -h . MyJNIExample.java
 */

// STEP 2 (C)
/** TODO linux
gcc -fPIC -shared -o libhelloc.so    \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/ \
-I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/darwin/ \
 MyJNIExample.c
*/
/** TODO macOS
 gcc -dynamiclib -o libhelloc.dylib  \
 -I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/ \
 -I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/darwin/ \
 MyJNIExample.c
 */

// STEP 2 (C++)
/** TODO linux
 gcc -fPIC -shared -fPIC -o libhellocpp.so    \
 -I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/ \
 -I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/darwin/ \
 MyJNIExample.cpp
 */
/** TODO macOS
 g++ -fPIC -dynamiclib -o libhellocpp.dylib  \
 -I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/ \
 -I/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/include/darwin/ \
 MyJNIExample.cpp
 */

// STEP 3
// /Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/bin/java -Djava.library.path=. MyJNIExample


public class MyJNIExample {
    static {
        System.loadLibrary("helloc");
        System.loadLibrary("hellocpp");
    }

    private static native void sayHelloC();
    private native void sayHelloCpp();
//    private static native void sayHelloCpp();

    public static void main(String[] args) {
        sayHelloC();  // Create an instance and invoke the native method
        new MyJNIExample().sayHelloCpp();  // Create an instance and invoke the native method
//        sayHelloCpp();  // Create an instance and invoke the native method
    }
}
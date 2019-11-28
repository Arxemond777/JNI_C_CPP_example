#include <jni.h>
#include <iostream>
#include "MyJNIExample.h"
using namespace std;

JNIEXPORT void JNICALL Java_MyJNIExample_sayHelloCppStatic(JNIEnv *env, jclass thisObj) {
	cout << "Hello World from C++. The static method Java!" << endl;
   return;
}
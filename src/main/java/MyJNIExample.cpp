#include <jni.h>
#include <iostream>
#include "MyJNIExample.h"
using namespace std;

//JNIEXPORT void JNICALL Java_MyJNIExample_sayHelloCpp(JNIEnv *env, jobject thisObj) {
JNIEXPORT void JNICALL Java_MyJNIExample_sayHelloCpp(JNIEnv *env, jclass thisObj) {
	cout << "Hello World from C++!" << endl;
   return;
}
#include <jni.h>
#include <stdio.h>
#include "MyJNIExample.h"

JNIEXPORT void JNICALL Java_MyJNIExample_sayHelloC(JNIEnv *env, jobject thisObj) {
//JNIEXPORT void JNICALL Java_MyJNIExample_sayHelloC(JNIEnv *env, jclass thisObj) {
   printf("Hello World from C!\n");
   return;
}
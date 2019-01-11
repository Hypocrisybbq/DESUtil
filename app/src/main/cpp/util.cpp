//
// Created by chen on 2019/1/10.
//

#include <jni.h>

extern "C" {
JNIEXPORT jstring JNICALL Java_com_example_chen_desutil_Util_DESEncrypt
        (JNIEnv *env, jclass, jobject, jstring, jstring) {

    return env->NewStringUTF("Hello");
} ;
}
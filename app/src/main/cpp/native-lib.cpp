#include <jni.h>
#include <opencv2/opencv.hpp>

extern "C"
JNIEXPORT jbyteArray JNICALL
Java_com_example_FLAMPrathamesh_MainActivity_processFrame(
        JNIEnv *env, jobject, jbyteArray frameData) {
    return frameData;
}

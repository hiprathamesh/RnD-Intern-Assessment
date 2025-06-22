cmake_minimum_required(VERSION 3.4.1)

add_library( native-lib SHARED native-lib.cpp )

find_package(OpenCV REQUIRED)

target_link_libraries(
        native-lib
        ${OpenCV_LIBS}
        android
        log)

package com.example.flamprathamesh

import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10
import android.opengl.GLSurfaceView

class GLRenderer : GLSurfaceView.Renderer {
    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {}
    override fun onDrawFrame(gl: GL10?) {}
    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {}
}

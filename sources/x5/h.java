package x5;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import e5.x;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public e5.f f40012a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f40013b;

    /* renamed from: c, reason: collision with root package name */
    public Error f40014c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f40015d;

    /* renamed from: e, reason: collision with root package name */
    public i f40016e;

    public final void a(int i10) {
        boolean z10;
        boolean z11;
        int[] iArr;
        boolean z12;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z13;
        this.f40012a.getClass();
        e5.f fVar = this.f40012a;
        fVar.getClass();
        boolean z14 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e5.a.g("eglGetDisplay failed", z10);
        int[] iArr3 = new int[2];
        e5.a.g("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
        fVar.f15013c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr4 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, e5.f.f15010g, 0, eGLConfigArr, 0, 1, iArr4, 0);
        if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
        int i11 = x.f15050a;
        e5.a.g(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = fVar.f15013c;
        if (i10 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        e5.a.g("eglCreateContext failed", z12);
        fVar.f15014d = eglCreateContext;
        EGLDisplay eGLDisplay2 = fVar.f15013c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            e5.a.g("eglCreatePbufferSurface failed", z13);
        }
        e5.a.g("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        fVar.f15015e = eglCreatePbufferSurface;
        int[] iArr5 = fVar.f15012b;
        GLES20.glGenTextures(1, iArr5, 0);
        e5.a.f();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
        fVar.f15016f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(fVar);
        SurfaceTexture surfaceTexture2 = this.f40012a.f15016f;
        surfaceTexture2.getClass();
        if (i10 != 0) {
            z14 = true;
        }
        this.f40016e = new i(this, surfaceTexture2, z14);
    }

    public final void b() {
        this.f40012a.getClass();
        e5.f fVar = this.f40012a;
        fVar.f15011a.removeCallbacks(fVar);
        try {
            SurfaceTexture surfaceTexture = fVar.f15016f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, fVar.f15012b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = fVar.f15013c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = fVar.f15013c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = fVar.f15015e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(fVar.f15013c, fVar.f15015e);
            }
            EGLContext eGLContext = fVar.f15014d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(fVar.f15013c, eGLContext);
            }
            if (x.f15050a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = fVar.f15013c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(fVar.f15013c);
            }
            fVar.f15013c = null;
            fVar.f15014d = null;
            fVar.f15015e = null;
            fVar.f15016f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (GlUtil$GlException e10) {
                e5.m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f40015d = new IllegalStateException(e10);
                synchronized (this) {
                    notify();
                }
            } catch (Error e11) {
                e5.m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f40014c = e11;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e12) {
                e5.m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                this.f40015d = e12;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}

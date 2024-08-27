package x5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import e5.x;

/* loaded from: classes.dex */
public final class i extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f40017d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f40018e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40019a;

    /* renamed from: b, reason: collision with root package name */
    public final h f40020b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40021c;

    public i(h hVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f40020b = hVar;
        this.f40019a = z10;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i10 = x.f15050a;
        if (i10 < 24 || ((i10 < 26 && ("samsung".equals(x.f15052c) || "XT1650".equals(x.f15053d))) || ((i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i10 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (i.class) {
            try {
                z10 = true;
                if (!f40018e) {
                    f40017d = a(context);
                    f40018e = true;
                }
                if (f40017d == 0) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [x5.h, android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object] */
    public static i c(Context context, boolean z10) {
        boolean z11;
        int i10;
        boolean z12 = false;
        if (z10 && !b(context)) {
            z11 = false;
        } else {
            z11 = true;
        }
        yk.j.H0(z11);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z10) {
            i10 = f40017d;
        } else {
            i10 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f40013b = handler;
        handlerThread.f40012a = new e5.f(handler);
        synchronized (handlerThread) {
            handlerThread.f40013b.obtainMessage(1, i10, 0).sendToTarget();
            while (handlerThread.f40016e == null && handlerThread.f40015d == null && handlerThread.f40014c == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f40015d;
        if (runtimeException == null) {
            Error error = handlerThread.f40014c;
            if (error == null) {
                i iVar = handlerThread.f40016e;
                iVar.getClass();
                return iVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f40020b) {
            try {
                if (!this.f40021c) {
                    h hVar = this.f40020b;
                    hVar.f40013b.getClass();
                    hVar.f40013b.sendEmptyMessage(2);
                    this.f40021c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

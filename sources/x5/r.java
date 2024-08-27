package x5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import e5.x;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final r f40036e = new r();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f40037a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f40038b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f40039c;

    /* renamed from: d, reason: collision with root package name */
    public int f40040d;

    public r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = x.f15050a;
        Handler handler = new Handler(looper, this);
        this.f40038b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f40037a = j10;
        Choreographer choreographer = this.f40039c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f40039c;
                if (choreographer != null) {
                    int i11 = this.f40040d - 1;
                    this.f40040d = i11;
                    if (i11 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f40037a = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f40039c;
            if (choreographer2 != null) {
                int i12 = this.f40040d + 1;
                this.f40040d = i12;
                if (i12 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f40039c = Choreographer.getInstance();
        } catch (RuntimeException e10) {
            e5.m.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
        }
        return true;
    }
}

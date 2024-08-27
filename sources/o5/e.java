package o5;

import android.media.MediaCodec;
import android.os.HandlerThread;
import h.r0;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f29598g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f29599h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f29600a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f29601b;

    /* renamed from: c, reason: collision with root package name */
    public h.f f29602c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f29603d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f29604e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29605f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        r0 r0Var = new r0(3);
        this.f29600a = mediaCodec;
        this.f29601b = handlerThread;
        this.f29604e = r0Var;
        this.f29603d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f29598g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        if (this.f29605f) {
            try {
                h.f fVar = this.f29602c;
                fVar.getClass();
                fVar.removeCallbacksAndMessages(null);
                r0 r0Var = this.f29604e;
                r0Var.d();
                h.f fVar2 = this.f29602c;
                fVar2.getClass();
                fVar2.obtainMessage(2).sendToTarget();
                synchronized (r0Var) {
                    while (!r0Var.f17735a) {
                        r0Var.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }
}

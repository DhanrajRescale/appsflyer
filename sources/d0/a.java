package d0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import t0.h2;

/* loaded from: classes.dex */
public final class a implements s0, h2, Runnable, Choreographer.FrameCallback {

    /* renamed from: h, reason: collision with root package name */
    public static long f13127h;

    /* renamed from: a, reason: collision with root package name */
    public final View f13128a;

    /* renamed from: c, reason: collision with root package name */
    public long f13130c;

    /* renamed from: d, reason: collision with root package name */
    public long f13131d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13132e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13134g;

    /* renamed from: b, reason: collision with root package name */
    public final v0.h f13129b = new v0.h(new t0[16]);

    /* renamed from: f, reason: collision with root package name */
    public final Choreographer f13133f = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f13128a = r5
            v0.h r0 = new v0.h
            r1 = 16
            d0.t0[] r1 = new d0.t0[r1]
            r0.<init>(r1)
            r4.f13129b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f13133f = r0
            long r0 = d0.a.f13127h
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r5 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            d0.a.f13127h = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a.<init>(android.view.View):void");
    }

    @Override // t0.h2
    public final void a() {
    }

    @Override // t0.h2
    public final void b() {
        this.f13134g = false;
        this.f13128a.removeCallbacks(this);
        this.f13133f.removeFrameCallback(this);
    }

    @Override // t0.h2
    public final void d() {
        this.f13134g = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.f13134g) {
            this.f13128a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        v0.h hVar = this.f13129b;
        if (!hVar.k() && this.f13132e && this.f13134g) {
            View view = this.f13128a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()) + f13127h;
                if (System.nanoTime() > nanos) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = false;
                while (hVar.l() && !z12) {
                    t0 t0Var = (t0) hVar.f37653a[0];
                    if (!t0Var.a()) {
                        hVar.n(0);
                    } else if (t0Var.f13224c != null) {
                        long nanoTime = System.nanoTime();
                        z11 = z12;
                        if (this.f13131d + nanoTime < nanos || z10) {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                t0Var.c();
                                long nanoTime2 = System.nanoTime() - nanoTime;
                                long j10 = this.f13131d;
                                if (j10 != 0) {
                                    long j11 = 4;
                                    nanoTime2 = (nanoTime2 / j11) + ((j10 / j11) * 3);
                                }
                                this.f13131d = nanoTime2;
                                z10 = false;
                                z12 = z11;
                            } finally {
                            }
                        } else {
                            z12 = true;
                        }
                    } else {
                        z11 = z12;
                        long nanoTime3 = System.nanoTime();
                        if (this.f13130c + nanoTime3 >= nanos && !z10) {
                            z12 = true;
                        } else {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                t0Var.b();
                                long nanoTime4 = System.nanoTime() - nanoTime3;
                                long j12 = this.f13130c;
                                if (j12 != 0) {
                                    long j13 = 4;
                                    nanoTime4 = (nanoTime4 / j13) + ((j12 / j13) * 3);
                                }
                                this.f13130c = nanoTime4;
                                Unit unit = Unit.f23355a;
                                z10 = false;
                                z12 = z11;
                            } finally {
                            }
                        }
                    }
                }
                if (z12) {
                    this.f13133f.postFrameCallback(this);
                    return;
                } else {
                    this.f13132e = false;
                    return;
                }
            }
        }
        this.f13132e = false;
    }
}

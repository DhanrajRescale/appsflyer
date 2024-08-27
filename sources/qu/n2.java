package qu;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class n2 extends vu.y implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f32245e;

    public n2(long j10, au.c cVar) {
        super(cVar, cVar.getContext());
        this.f32245e = j10;
    }

    @Override // qu.a, qu.x1
    public final String b0() {
        return super.b0() + "(timeMillis=" + this.f32245e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp.j.Q(this.f32177c);
        w(new TimeoutCancellationException("Timed out waiting for " + this.f32245e + " ms", this));
    }
}

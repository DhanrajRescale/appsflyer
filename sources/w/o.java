package w;

import t0.l3;
import t0.o3;

/* loaded from: classes.dex */
public final class o implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f38621a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.n1 f38622b;

    /* renamed from: c, reason: collision with root package name */
    public t f38623c;

    /* renamed from: d, reason: collision with root package name */
    public long f38624d;

    /* renamed from: e, reason: collision with root package name */
    public long f38625e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38626f;

    public /* synthetic */ o(y1 y1Var, Object obj, t tVar, int i10) {
        this(y1Var, obj, (i10 & 4) != 0 ? null : tVar, (i10 & 8) != 0 ? Long.MIN_VALUE : 0L, (i10 & 16) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    public final Object b() {
        return this.f38621a.f38735b.invoke(this.f38623c);
    }

    @Override // t0.l3
    public final Object getValue() {
        return this.f38622b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f38622b.getValue() + ", velocity=" + b() + ", isRunning=" + this.f38626f + ", lastFrameTimeNanos=" + this.f38624d + ", finishedTimeNanos=" + this.f38625e + ')';
    }

    public o(y1 y1Var, Object obj, t tVar, long j10, long j11, boolean z10) {
        t tVar2;
        this.f38621a = y1Var;
        this.f38622b = t0.t.n0(obj, o3.f35116a);
        if (tVar != null) {
            tVar2 = e.l(tVar);
        } else {
            tVar2 = (t) y1Var.f38734a.invoke(obj);
            tVar2.d();
        }
        this.f38623c = tVar2;
        this.f38624d = j10;
        this.f38625e = j11;
        this.f38626f = z10;
    }
}

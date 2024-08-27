package l0;

/* loaded from: classes.dex */
public final class q0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23811a;

    /* renamed from: b, reason: collision with root package name */
    public final q f23812b;

    /* renamed from: c, reason: collision with root package name */
    public final o f23813c;

    public q0(boolean z10, q qVar, o oVar) {
        this.f23811a = z10;
        this.f23812b = qVar;
        this.f23813c = oVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SingleSelectionLayout(isStartHandle=");
        sb2.append(this.f23811a);
        sb2.append(", crossed=");
        o oVar = this.f23813c;
        sb2.append(jr.h.B(oVar.b()));
        sb2.append(", info=\n\t");
        sb2.append(oVar);
        sb2.append(')');
        return sb2.toString();
    }
}

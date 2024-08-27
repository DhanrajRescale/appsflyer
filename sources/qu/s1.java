package qu;

/* loaded from: classes2.dex */
public final class s1 extends i {

    /* renamed from: i, reason: collision with root package name */
    public final x1 f32265i;

    public s1(yt.a aVar, x1 x1Var) {
        super(1, aVar);
        this.f32265i = x1Var;
    }

    @Override // qu.i
    public final Throwable o(x1 x1Var) {
        Throwable c10;
        Object P = this.f32265i.P();
        if ((P instanceof u1) && (c10 = ((u1) P).c()) != null) {
            return c10;
        }
        if (P instanceof t) {
            return ((t) P).f32267a;
        }
        return x1Var.v();
    }

    @Override // qu.i
    public final String y() {
        return "AwaitContinuation";
    }
}

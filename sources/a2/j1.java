package a2;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f91a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f92b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f93c = new i1(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final i1 f94d = new i1(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final i1 f95e = new i1(this, 1);

    public j1(m1 m1Var) {
        this.f91a = m1Var;
    }

    public final i0 a() {
        i0 i0Var = this.f92b;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }
}

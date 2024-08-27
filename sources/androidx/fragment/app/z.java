package androidx.fragment.app;

/* loaded from: classes.dex */
public final class z implements p.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1866a;

    public /* synthetic */ z(Object obj) {
        this.f1866a = obj;
    }

    @Override // p.a
    public final Object apply(Object obj) {
        g0 g0Var = (g0) this.f1866a;
        Object obj2 = g0Var.mHost;
        if (obj2 instanceof e.i) {
            return ((e.i) obj2).getActivityResultRegistry();
        }
        return g0Var.requireActivity().getActivityResultRegistry();
    }
}

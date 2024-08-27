package c2;

/* loaded from: classes.dex */
public final class h implements l1.j {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7711a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f7712b;

    @Override // l1.j
    public final boolean a() {
        Boolean bool = f7712b;
        if (bool != null) {
            return bool.booleanValue();
        }
        t0.t.D0("canFocus is read before it is written");
        throw null;
    }

    @Override // l1.j
    public final void b(boolean z10) {
        f7712b = Boolean.valueOf(z10);
    }
}

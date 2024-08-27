package ba;

/* loaded from: classes.dex */
public final class ph extends oh {

    /* renamed from: t, reason: collision with root package name */
    public long f5768t;

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5768t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5768t != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.f5768t = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}

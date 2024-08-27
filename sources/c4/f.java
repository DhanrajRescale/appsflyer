package c4;

/* loaded from: classes.dex */
public final class f extends c3.e {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7944d;

    public f(int i10) {
        super(i10, 1);
        this.f7944d = new Object();
    }

    @Override // c3.e, c4.e
    public final boolean b(Object obj) {
        boolean b10;
        synchronized (this.f7944d) {
            b10 = super.b(obj);
        }
        return b10;
    }

    @Override // c3.e, c4.e
    public final Object c() {
        Object c10;
        synchronized (this.f7944d) {
            c10 = super.c();
        }
        return c10;
    }
}

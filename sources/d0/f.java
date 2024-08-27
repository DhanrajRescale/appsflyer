package d0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f13157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13158b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13159c;

    public f(int i10, int i11, q qVar) {
        this.f13157a = i10;
        this.f13158b = i11;
        this.f13159c = qVar;
        if (i10 >= 0) {
            if (i11 > 0) {
                return;
            } else {
                throw new IllegalArgumentException(jr.h.n("size should be >0, but was ", i11).toString());
            }
        }
        throw new IllegalArgumentException(jr.h.n("startIndex should be >= 0, but was ", i10).toString());
    }
}

package u5;

import lp.e0;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36787a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36788b;

    public g(b5.v vVar, int i10) {
        this.f36787a = (vVar.f3644d & 1) != 0;
        this.f36788b = p.f(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return e0.f24968a.c(this.f36788b, gVar.f36788b).c(this.f36787a, gVar.f36787a).e();
    }
}

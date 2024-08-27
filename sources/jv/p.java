package jv;

/* loaded from: classes2.dex */
public final class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public final lv.o f21714a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21715b;

    public p(lv.o oVar, String str) {
        this.f21714a = oVar;
        this.f21715b = str;
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        hv.q qVar = (hv.q) oVar.f(this.f21714a);
        if (qVar == null) {
            return false;
        }
        sb2.append(qVar.m());
        return true;
    }

    public final String toString() {
        return this.f21715b;
    }
}

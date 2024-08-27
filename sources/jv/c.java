package jv;

/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final char f21679a;

    public c(char c10) {
        this.f21679a = c10;
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        sb2.append(this.f21679a);
        return true;
    }

    public final String toString() {
        char c10 = this.f21679a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}

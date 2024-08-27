package d2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    public static d f13398d;

    /* renamed from: c, reason: collision with root package name */
    public j2.e0 f13399c;

    @Override // d2.g
    public final int[] a(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        u2.h hVar = u2.h.f36681b;
        if (i10 < 0) {
            j2.e0 e0Var = this.f13399c;
            if (e0Var != null) {
                i11 = e0Var.f(0);
            } else {
                Intrinsics.k("layoutResult");
                throw null;
            }
        } else {
            j2.e0 e0Var2 = this.f13399c;
            if (e0Var2 != null) {
                int f10 = e0Var2.f(i10);
                if (e(f10, hVar) == i10) {
                    i11 = f10;
                } else {
                    i11 = f10 + 1;
                }
            } else {
                Intrinsics.k("layoutResult");
                throw null;
            }
        }
        j2.e0 e0Var3 = this.f13399c;
        if (e0Var3 != null) {
            if (i11 >= e0Var3.f20704b.f20735f) {
                return null;
            }
            return c(e(i11, hVar), e(i11, u2.h.f36680a) + 1);
        }
        Intrinsics.k("layoutResult");
        throw null;
    }

    @Override // d2.g
    public final int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = d().length();
        u2.h hVar = u2.h.f36680a;
        if (i10 > length) {
            j2.e0 e0Var = this.f13399c;
            if (e0Var != null) {
                i11 = e0Var.f(d().length());
            } else {
                Intrinsics.k("layoutResult");
                throw null;
            }
        } else {
            j2.e0 e0Var2 = this.f13399c;
            if (e0Var2 != null) {
                int f10 = e0Var2.f(i10);
                if (e(f10, hVar) + 1 == i10) {
                    i11 = f10;
                } else {
                    i11 = f10 - 1;
                }
            } else {
                Intrinsics.k("layoutResult");
                throw null;
            }
        }
        if (i11 < 0) {
            return null;
        }
        return c(e(i11, u2.h.f36681b), e(i11, hVar) + 1);
    }

    public final int e(int i10, u2.h hVar) {
        j2.e0 e0Var = this.f13399c;
        if (e0Var != null) {
            int j10 = e0Var.j(i10);
            j2.e0 e0Var2 = this.f13399c;
            if (e0Var2 != null) {
                if (hVar != e0Var2.m(j10)) {
                    j2.e0 e0Var3 = this.f13399c;
                    if (e0Var3 != null) {
                        return e0Var3.j(i10);
                    }
                    Intrinsics.k("layoutResult");
                    throw null;
                }
                if (this.f13399c != null) {
                    return r6.e(i10, false) - 1;
                }
                Intrinsics.k("layoutResult");
                throw null;
            }
            Intrinsics.k("layoutResult");
            throw null;
        }
        Intrinsics.k("layoutResult");
        throw null;
    }
}

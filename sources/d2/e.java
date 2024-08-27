package d2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: e, reason: collision with root package name */
    public static e f13407e;

    /* renamed from: c, reason: collision with root package name */
    public j2.e0 f13408c;

    /* renamed from: d, reason: collision with root package name */
    public h2.o f13409d;

    @Override // d2.g
    public final int[] a(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            h2.o oVar = this.f13409d;
            if (oVar != null) {
                int round = Math.round(oVar.e().b());
                if (i10 <= 0) {
                    i10 = 0;
                }
                j2.e0 e0Var = this.f13408c;
                if (e0Var != null) {
                    int f10 = e0Var.f(i10);
                    j2.e0 e0Var2 = this.f13408c;
                    if (e0Var2 != null) {
                        float k10 = e0Var2.k(f10) + round;
                        j2.e0 e0Var3 = this.f13408c;
                        if (e0Var3 != null) {
                            if (k10 < e0Var3.k(e0Var3.f20704b.f20735f - 1)) {
                                j2.e0 e0Var4 = this.f13408c;
                                if (e0Var4 != null) {
                                    i11 = e0Var4.g(k10);
                                } else {
                                    Intrinsics.k("layoutResult");
                                    throw null;
                                }
                            } else {
                                j2.e0 e0Var5 = this.f13408c;
                                if (e0Var5 != null) {
                                    i11 = e0Var5.f20704b.f20735f;
                                } else {
                                    Intrinsics.k("layoutResult");
                                    throw null;
                                }
                            }
                            return c(i10, e(i11 - 1, u2.h.f36680a) + 1);
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
            Intrinsics.k("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // d2.g
    public final int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            h2.o oVar = this.f13409d;
            if (oVar != null) {
                int round = Math.round(oVar.e().b());
                int length = d().length();
                if (length <= i10) {
                    i10 = length;
                }
                j2.e0 e0Var = this.f13408c;
                if (e0Var != null) {
                    int f10 = e0Var.f(i10);
                    j2.e0 e0Var2 = this.f13408c;
                    if (e0Var2 != null) {
                        float k10 = e0Var2.k(f10) - round;
                        if (k10 > s0.g.f34069a) {
                            j2.e0 e0Var3 = this.f13408c;
                            if (e0Var3 != null) {
                                i11 = e0Var3.g(k10);
                            } else {
                                Intrinsics.k("layoutResult");
                                throw null;
                            }
                        } else {
                            i11 = 0;
                        }
                        if (i10 == d().length() && i11 < f10) {
                            i11++;
                        }
                        return c(e(i11, u2.h.f36681b), i10);
                    }
                    Intrinsics.k("layoutResult");
                    throw null;
                }
                Intrinsics.k("layoutResult");
                throw null;
            }
            Intrinsics.k("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i10, u2.h hVar) {
        j2.e0 e0Var = this.f13408c;
        if (e0Var != null) {
            int j10 = e0Var.j(i10);
            j2.e0 e0Var2 = this.f13408c;
            if (e0Var2 != null) {
                if (hVar != e0Var2.m(j10)) {
                    j2.e0 e0Var3 = this.f13408c;
                    if (e0Var3 != null) {
                        return e0Var3.j(i10);
                    }
                    Intrinsics.k("layoutResult");
                    throw null;
                }
                if (this.f13408c != null) {
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

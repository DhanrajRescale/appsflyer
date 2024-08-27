package u0;

import java.util.ArrayList;
import t0.q2;

/* loaded from: classes.dex */
public final class t extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f36657c = new j0(1, 0, 2);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        boolean z10;
        boolean z11;
        t0.d dVar;
        int c10;
        int i10;
        int a10 = k0Var.a(0);
        if (q2Var.f35156n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (a10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (a10 != 0) {
                    int i11 = q2Var.f35161s;
                    int i12 = q2Var.f35163u;
                    int i13 = q2Var.f35162t;
                    int i14 = i11;
                    while (a10 > 0) {
                        i14 += dp.b.D0(q2Var.f35144b, q2Var.o(i14));
                        if (i14 > i13) {
                            t0.t.F("Parameter offset is out of bounds");
                            throw null;
                        }
                        a10--;
                    }
                    int D0 = dp.b.D0(q2Var.f35144b, q2Var.o(i14));
                    int f10 = q2Var.f(q2Var.f35144b, q2Var.o(q2Var.f35161s));
                    int f11 = q2Var.f(q2Var.f35144b, q2Var.o(i14));
                    int i15 = i14 + D0;
                    int f12 = q2Var.f(q2Var.f35144b, q2Var.o(i15));
                    int i16 = f12 - f11;
                    q2Var.s(i16, Math.max(q2Var.f35161s - 1, 0));
                    q2Var.r(D0);
                    int[] iArr = q2Var.f35144b;
                    int o10 = q2Var.o(i15) * 5;
                    vt.t.c(q2Var.o(i11) * 5, o10, (D0 * 5) + o10, iArr, iArr);
                    if (i16 > 0) {
                        Object[] objArr = q2Var.f35145c;
                        vt.t.f(objArr, f10, objArr, q2Var.g(f11 + i16), q2Var.g(f12 + i16));
                    }
                    int i17 = f11 + i16;
                    int i18 = i17 - f10;
                    int i19 = q2Var.f35153k;
                    int i20 = q2Var.f35154l;
                    int length = q2Var.f35145c.length;
                    int i21 = q2Var.f35155m;
                    int i22 = i11 + D0;
                    int i23 = i11;
                    while (i23 < i22) {
                        int o11 = q2Var.o(i23);
                        int i24 = i22;
                        int f13 = q2Var.f(iArr, o11) - i18;
                        int i25 = i18;
                        if (i21 < o11) {
                            i10 = 0;
                        } else {
                            i10 = i19;
                        }
                        iArr[(o11 * 5) + 4] = q2.h(q2.h(f13, i10, i20, length), q2Var.f35153k, q2Var.f35154l, q2Var.f35145c.length);
                        i23++;
                        i18 = i25;
                        i22 = i24;
                        i19 = i19;
                        i20 = i20;
                    }
                    int i26 = i15 + D0;
                    int n10 = q2Var.n();
                    int H0 = dp.b.H0(q2Var.f35146d, i15, n10);
                    ArrayList arrayList = new ArrayList();
                    if (H0 >= 0) {
                        while (H0 < q2Var.f35146d.size() && (c10 = q2Var.c((dVar = (t0.d) q2Var.f35146d.get(H0)))) >= i15 && c10 < i26) {
                            arrayList.add(dVar);
                            q2Var.f35146d.remove(H0);
                        }
                    }
                    int i27 = i11 - i15;
                    int size = arrayList.size();
                    for (int i28 = 0; i28 < size; i28++) {
                        t0.d dVar2 = (t0.d) arrayList.get(i28);
                        int c11 = q2Var.c(dVar2) + i27;
                        if (c11 >= q2Var.f35149g) {
                            dVar2.f34969a = -(n10 - c11);
                        } else {
                            dVar2.f34969a = c11;
                        }
                        q2Var.f35146d.add(dp.b.H0(q2Var.f35146d, c11, n10), dVar2);
                    }
                    if (!q2Var.B(i15, D0)) {
                        q2Var.l(i12, q2Var.f35162t, i11);
                        if (i16 > 0) {
                            q2Var.C(i17, i16, i15 - 1);
                            return;
                        }
                        return;
                    }
                    t0.t.F("Unexpectedly removed anchors");
                    throw null;
                }
                return;
            }
            t0.t.F("Parameter offset is out of bounds");
            throw null;
        }
        t0.t.F("Cannot move a group while inserting");
        throw null;
    }

    @Override // u0.j0
    public final String b(int i10) {
        if (t0.t.P(i10, 0)) {
            return "offset";
        }
        return super.b(i10);
    }
}

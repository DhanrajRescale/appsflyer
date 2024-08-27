package u0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import t0.b1;
import t0.c1;
import t0.t0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t0.r f36605a;

    /* renamed from: b, reason: collision with root package name */
    public a f36606b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36607c;

    /* renamed from: f, reason: collision with root package name */
    public int f36610f;

    /* renamed from: g, reason: collision with root package name */
    public int f36611g;

    /* renamed from: l, reason: collision with root package name */
    public int f36616l;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f36608d = new t0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f36609e = true;

    /* renamed from: h, reason: collision with root package name */
    public final l9.c f36612h = new l9.c();

    /* renamed from: i, reason: collision with root package name */
    public int f36613i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f36614j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f36615k = -1;

    public b(t0.r rVar, a aVar) {
        this.f36605a = rVar;
        this.f36606b = aVar;
    }

    public final void a(ArrayList arrayList, b1.e eVar) {
        a aVar = this.f36606b;
        aVar.getClass();
        if (!arrayList.isEmpty()) {
            g gVar = g.f36627c;
            l0 l0Var = aVar.f36603b;
            l0Var.h0(gVar);
            t0.t.x0(l0Var, 1, arrayList);
            t0.t.x0(l0Var, 0, eVar);
            int i10 = l0Var.f36648h;
            int i11 = gVar.f36634a;
            int a02 = l0.a0(l0Var, i11);
            int i12 = gVar.f36635b;
            if (i10 != a02 || l0Var.f36649i != l0.a0(l0Var, i12)) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (((1 << i14) & l0Var.f36648h) != 0) {
                        if (i13 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(gVar.b(i14));
                        i13++;
                    }
                }
                String sb3 = sb2.toString();
                StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (((1 << i16) & l0Var.f36649i) != 0) {
                        if (i13 > 0) {
                            p10.append(", ");
                        }
                        p10.append(gVar.c(i16));
                        i15++;
                    }
                }
                String sb4 = p10.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(gVar);
                sb5.append(". Not all arguments were provided. Missing ");
                nn.d.w(sb5, i13, " int arguments (", sb3, ") and ");
                nn.d.x(sb5, i15, " object arguments (", sb4, ").");
                throw null;
            }
        }
    }

    public final void b(b1 b1Var, t0.v vVar, c1 c1Var, c1 c1Var2) {
        a aVar = this.f36606b;
        aVar.getClass();
        h hVar = h.f36629c;
        l0 l0Var = aVar.f36603b;
        l0Var.h0(hVar);
        t0.t.x0(l0Var, 0, b1Var);
        t0.t.x0(l0Var, 1, vVar);
        t0.t.x0(l0Var, 3, c1Var2);
        t0.t.x0(l0Var, 2, c1Var);
        int i10 = l0Var.f36648h;
        int i11 = hVar.f36634a;
        int a02 = l0.a0(l0Var, i11);
        int i12 = hVar.f36635b;
        if (i10 == a02 && l0Var.f36649i == l0.a0(l0Var, i12)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & l0Var.f36648h) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(hVar.b(i14));
                i13++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            if (((1 << i16) & l0Var.f36649i) != 0) {
                if (i13 > 0) {
                    p10.append(", ");
                }
                p10.append(hVar.c(i16));
                i15++;
            }
        }
        String sb4 = p10.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(hVar);
        sb5.append(". Not all arguments were provided. Missing ");
        nn.d.w(sb5, i13, " int arguments (", sb3, ") and ");
        nn.d.x(sb5, i15, " object arguments (", sb4, ").");
        throw null;
    }

    public final void c(b1.e eVar, t0.d dVar) {
        f();
        a aVar = this.f36606b;
        aVar.getClass();
        j jVar = j.f36633c;
        l0 l0Var = aVar.f36603b;
        l0Var.h0(jVar);
        t0.t.x0(l0Var, 0, eVar);
        t0.t.x0(l0Var, 1, dVar);
        int i10 = l0Var.f36648h;
        int i11 = jVar.f36634a;
        int a02 = l0.a0(l0Var, i11);
        int i12 = jVar.f36635b;
        if (i10 == a02 && l0Var.f36649i == l0.a0(l0Var, i12)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & l0Var.f36648h) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(jVar.b(i14));
                i13++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            if (((1 << i16) & l0Var.f36649i) != 0) {
                if (i13 > 0) {
                    p10.append(", ");
                }
                p10.append(jVar.c(i16));
                i15++;
            }
        }
        String sb4 = p10.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(jVar);
        sb5.append(". Not all arguments were provided. Missing ");
        nn.d.w(sb5, i13, " int arguments (", sb3, ") and ");
        nn.d.x(sb5, i15, " object arguments (", sb4, ").");
        throw null;
    }

    public final void d(a aVar, b1.e eVar) {
        a aVar2 = this.f36606b;
        aVar2.getClass();
        if (aVar.f36603b.e0()) {
            f fVar = f.f36625c;
            l0 l0Var = aVar2.f36603b;
            l0Var.h0(fVar);
            t0.t.x0(l0Var, 0, aVar);
            t0.t.x0(l0Var, 1, eVar);
            int i10 = l0Var.f36648h;
            int i11 = fVar.f36634a;
            int a02 = l0.a0(l0Var, i11);
            int i12 = fVar.f36635b;
            if (i10 != a02 || l0Var.f36649i != l0.a0(l0Var, i12)) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (((1 << i14) & l0Var.f36648h) != 0) {
                        if (i13 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(fVar.b(i14));
                        i13++;
                    }
                }
                String sb3 = sb2.toString();
                StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (((1 << i16) & l0Var.f36649i) != 0) {
                        if (i13 > 0) {
                            p10.append(", ");
                        }
                        p10.append(fVar.c(i16));
                        i15++;
                    }
                }
                String sb4 = p10.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(fVar);
                sb5.append(". Not all arguments were provided. Missing ");
                nn.d.w(sb5, i13, " int arguments (", sb3, ") and ");
                nn.d.x(sb5, i15, " object arguments (", sb4, ").");
                throw null;
            }
        }
    }

    public final void e() {
        l9.c cVar = this.f36612h;
        if (!cVar.f24251a.isEmpty()) {
            cVar.f24251a.remove(r0.size() - 1);
        } else {
            this.f36611g++;
        }
    }

    public final void f() {
        boolean z10;
        b bVar = this;
        int i10 = bVar.f36611g;
        int i11 = 0;
        if (i10 > 0) {
            a aVar = bVar.f36606b;
            aVar.getClass();
            h0 h0Var = h0.f36630c;
            l0 l0Var = aVar.f36603b;
            l0Var.h0(h0Var);
            t0.t.w0(l0Var, 0, i10);
            int i12 = l0Var.f36648h;
            int i13 = h0Var.f36634a;
            int a02 = l0.a0(l0Var, i13);
            int i14 = h0Var.f36635b;
            if (i12 == a02 && l0Var.f36649i == l0.a0(l0Var, i14)) {
                bVar.f36611g = 0;
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i15 = 0;
                while (i15 < i13) {
                    int i16 = i13;
                    if (((1 << i15) & l0Var.f36648h) != 0) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(h0Var.b(i15));
                        i11++;
                    }
                    i15++;
                    i13 = i16;
                }
                String sb3 = sb2.toString();
                StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                int i17 = 0;
                int i18 = 0;
                while (i18 < i14) {
                    int i19 = i14;
                    if (((1 << i18) & l0Var.f36649i) != 0) {
                        if (i11 > 0) {
                            p10.append(", ");
                        }
                        p10.append(h0Var.c(i18));
                        i17++;
                    }
                    i18++;
                    i14 = i19;
                }
                String sb4 = p10.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(h0Var);
                sb5.append(". Not all arguments were provided. Missing ");
                nn.d.w(sb5, i11, " int arguments (", sb3, ") and ");
                nn.d.x(sb5, i17, " object arguments (", sb4, ").");
                throw null;
            }
        } else {
            bVar = this;
        }
        l9.c cVar = bVar.f36612h;
        if (!cVar.f24251a.isEmpty()) {
            a aVar2 = bVar.f36606b;
            ArrayList arrayList = cVar.f24251a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i20 = 0; i20 < size; i20++) {
                objArr[i20] = arrayList.get(i20);
            }
            aVar2.getClass();
            if (size == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                k kVar = k.f36636c;
                l0 l0Var2 = aVar2.f36603b;
                l0Var2.h0(kVar);
                t0.t.x0(l0Var2, 0, objArr);
                int i21 = l0Var2.f36648h;
                int i22 = kVar.f36634a;
                int a03 = l0.a0(l0Var2, i22);
                int i23 = kVar.f36635b;
                if (i21 != a03 || l0Var2.f36649i != l0.a0(l0Var2, i23)) {
                    StringBuilder sb6 = new StringBuilder();
                    int i24 = 0;
                    for (int i25 = 0; i25 < i22; i25++) {
                        if (((1 << i25) & l0Var2.f36648h) != 0) {
                            if (i24 > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(kVar.b(i25));
                            i24++;
                        }
                    }
                    String sb7 = sb6.toString();
                    StringBuilder p11 = nn.d.p(sb7, "StringBuilder().apply(builderAction).toString()");
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i23) {
                        int i28 = i23;
                        if (((1 << i26) & l0Var2.f36649i) != 0) {
                            if (i24 > 0) {
                                p11.append(", ");
                            }
                            p11.append(kVar.c(i26));
                            i27++;
                        }
                        i26++;
                        i23 = i28;
                    }
                    String sb8 = p11.toString();
                    Intrinsics.checkNotNullExpressionValue(sb8, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb9 = new StringBuilder("Error while pushing ");
                    sb9.append(kVar);
                    sb9.append(". Not all arguments were provided. Missing ");
                    nn.d.w(sb9, i24, " int arguments (", sb7, ") and ");
                    nn.d.x(sb9, i27, " object arguments (", sb8, ").");
                    throw null;
                }
            }
            arrayList.clear();
        }
    }

    public final void g() {
        int i10 = this.f36616l;
        if (i10 > 0) {
            int i11 = this.f36613i;
            if (i11 >= 0) {
                f();
                a aVar = this.f36606b;
                aVar.getClass();
                y yVar = y.f36662c;
                l0 l0Var = aVar.f36603b;
                l0Var.h0(yVar);
                t0.t.w0(l0Var, 0, i11);
                t0.t.w0(l0Var, 1, i10);
                int i12 = l0Var.f36648h;
                int i13 = yVar.f36634a;
                int a02 = l0.a0(l0Var, i13);
                int i14 = yVar.f36635b;
                if (i12 == a02 && l0Var.f36649i == l0.a0(l0Var, i14)) {
                    this.f36613i = -1;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i13) {
                        int i17 = i13;
                        if (((1 << i15) & l0Var.f36648h) != 0) {
                            if (i16 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(yVar.b(i15));
                            i16++;
                        }
                        i15++;
                        i13 = i17;
                    }
                    String sb3 = sb2.toString();
                    StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                    int i18 = 0;
                    int i19 = 0;
                    while (i19 < i14) {
                        int i20 = i14;
                        if (((1 << i19) & l0Var.f36649i) != 0) {
                            if (i16 > 0) {
                                p10.append(", ");
                            }
                            p10.append(yVar.c(i19));
                            i18++;
                        }
                        i19++;
                        i14 = i20;
                    }
                    String sb4 = p10.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(yVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    nn.d.w(sb5, i16, " int arguments (", sb3, ") and ");
                    nn.d.x(sb5, i18, " object arguments (", sb4, ").");
                    throw null;
                }
            } else {
                int i21 = this.f36615k;
                int i22 = this.f36614j;
                f();
                a aVar2 = this.f36606b;
                aVar2.getClass();
                u uVar = u.f36658c;
                l0 l0Var2 = aVar2.f36603b;
                l0Var2.h0(uVar);
                t0.t.w0(l0Var2, 1, i21);
                t0.t.w0(l0Var2, 0, i22);
                t0.t.w0(l0Var2, 2, i10);
                int i23 = l0Var2.f36648h;
                int i24 = uVar.f36634a;
                int a03 = l0.a0(l0Var2, i24);
                int i25 = uVar.f36635b;
                if (i23 == a03 && l0Var2.f36649i == l0.a0(l0Var2, i25)) {
                    this.f36614j = -1;
                    this.f36615k = -1;
                } else {
                    int i26 = 0;
                    StringBuilder sb6 = new StringBuilder();
                    for (int i27 = 0; i27 < i24; i27++) {
                        if (((1 << i27) & l0Var2.f36648h) != 0) {
                            if (i26 > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(uVar.b(i27));
                            i26++;
                        }
                    }
                    String sb7 = sb6.toString();
                    StringBuilder p11 = nn.d.p(sb7, "StringBuilder().apply(builderAction).toString()");
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i25) {
                        int i30 = i25;
                        if (((1 << i28) & l0Var2.f36649i) != 0) {
                            if (i26 > 0) {
                                p11.append(", ");
                            }
                            p11.append(uVar.c(i28));
                            i29++;
                        }
                        i28++;
                        i25 = i30;
                    }
                    String sb8 = p11.toString();
                    Intrinsics.checkNotNullExpressionValue(sb8, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb9 = new StringBuilder("Error while pushing ");
                    sb9.append(uVar);
                    sb9.append(". Not all arguments were provided. Missing ");
                    nn.d.w(sb9, i26, " int arguments (", sb7, ") and ");
                    nn.d.x(sb9, i29, " object arguments (", sb8, ").");
                    throw null;
                }
            }
            this.f36616l = 0;
        }
    }

    public final void h(boolean z10) {
        int i10;
        boolean z11;
        t0.r rVar = this.f36605a;
        if (z10) {
            i10 = rVar.F.f35093i;
        } else {
            i10 = rVar.F.f35091g;
        }
        int i11 = i10 - this.f36610f;
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i11 > 0) {
                a aVar = this.f36606b;
                aVar.getClass();
                d dVar = d.f36621c;
                l0 l0Var = aVar.f36603b;
                l0Var.h0(dVar);
                t0.t.w0(l0Var, 0, i11);
                int i12 = l0Var.f36648h;
                int i13 = dVar.f36634a;
                int a02 = l0.a0(l0Var, i13);
                int i14 = dVar.f36635b;
                if (i12 == a02 && l0Var.f36649i == l0.a0(l0Var, i14)) {
                    this.f36610f = i10;
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                int i15 = 0;
                for (int i16 = 0; i16 < i13; i16++) {
                    if (((1 << i16) & l0Var.f36648h) != 0) {
                        if (i15 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(dVar.b(i16));
                        i15++;
                    }
                }
                String sb3 = sb2.toString();
                StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                int i17 = 0;
                for (int i18 = 0; i18 < i14; i18++) {
                    if (((1 << i18) & l0Var.f36649i) != 0) {
                        if (i15 > 0) {
                            p10.append(", ");
                        }
                        p10.append(dVar.c(i18));
                        i17++;
                    }
                }
                String sb4 = p10.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(dVar);
                sb5.append(". Not all arguments were provided. Missing ");
                nn.d.w(sb5, i15, " int arguments (", sb3, ") and ");
                nn.d.x(sb5, i17, " object arguments (", sb4, ").");
                throw null;
            }
            return;
        }
        t0.t.F("Tried to seek backward");
        throw null;
    }

    public final void i(int i10, int i11) {
        boolean z10;
        if (i11 > 0) {
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f36613i == i10) {
                    this.f36616l += i11;
                    return;
                }
                g();
                this.f36613i = i10;
                this.f36616l = i11;
                return;
            }
            t0.t.F("Invalid remove index " + i10);
            throw null;
        }
    }
}

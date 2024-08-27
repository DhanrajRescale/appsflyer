package c2;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f7629a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7631c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7632d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7633e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7634f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7635g;

    /* renamed from: h, reason: collision with root package name */
    public b f7636h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7630b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f7637i = new HashMap();

    public a(b bVar) {
        this.f7629a = bVar;
    }

    public static final void a(a aVar, a2.a aVar2, int i10, i1 i1Var) {
        float d10;
        aVar.getClass();
        float f10 = i10;
        long g10 = t0.t.g(f10, f10);
        while (true) {
            g10 = aVar.b(i1Var, g10);
            i1Var = i1Var.f7723m;
            Intrinsics.c(i1Var);
            if (Intrinsics.a(i1Var, aVar.f7629a.j())) {
                break;
            } else if (aVar.c(i1Var).containsKey(aVar2)) {
                float d11 = aVar.d(i1Var, aVar2);
                g10 = t0.t.g(d11, d11);
            }
        }
        if (aVar2 instanceof a2.p) {
            d10 = m1.c.e(g10);
        } else {
            d10 = m1.c.d(g10);
        }
        int round = Math.round(d10);
        HashMap hashMap = aVar.f7637i;
        if (hashMap.containsKey(aVar2)) {
            int intValue = ((Number) vt.p0.e(aVar2, hashMap)).intValue();
            a2.p pVar = a2.d.f47a;
            round = ((Number) aVar2.f22a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
        }
        hashMap.put(aVar2, Integer.valueOf(round));
    }

    public abstract long b(i1 i1Var, long j10);

    public abstract Map c(i1 i1Var);

    public abstract int d(i1 i1Var, a2.a aVar);

    public final boolean e() {
        return this.f7631c || this.f7633e || this.f7634f || this.f7635g;
    }

    public final boolean f() {
        i();
        if (this.f7636h != null) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.f7630b = true;
        b bVar = this.f7629a;
        b l10 = bVar.l();
        if (l10 == null) {
            return;
        }
        if (this.f7631c) {
            l10.V();
        } else if (this.f7633e || this.f7632d) {
            l10.requestLayout();
        }
        if (this.f7634f) {
            bVar.V();
        }
        if (this.f7635g) {
            bVar.requestLayout();
        }
        l10.c().g();
    }

    public final void h() {
        HashMap hashMap = this.f7637i;
        hashMap.clear();
        t.g0 g0Var = new t.g0(this, 28);
        b bVar = this.f7629a;
        bVar.L(g0Var);
        hashMap.putAll(c(bVar.j()));
        this.f7630b = false;
    }

    public final void i() {
        a c10;
        a c11;
        boolean e10 = e();
        b bVar = this.f7629a;
        if (!e10) {
            b l10 = bVar.l();
            if (l10 == null) {
                return;
            }
            bVar = l10.c().f7636h;
            if (bVar == null || !bVar.c().e()) {
                b bVar2 = this.f7636h;
                if (bVar2 != null && !bVar2.c().e()) {
                    b l11 = bVar2.l();
                    if (l11 != null && (c11 = l11.c()) != null) {
                        c11.i();
                    }
                    b l12 = bVar2.l();
                    if (l12 != null && (c10 = l12.c()) != null) {
                        bVar = c10.f7636h;
                    } else {
                        bVar = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.f7636h = bVar;
    }
}

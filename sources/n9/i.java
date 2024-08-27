package n9;

import t0.j0;
import t0.n1;
import t0.o3;
import x.w1;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f28442a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f28443b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f28444c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f28445d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f28446e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f28447f;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f28448g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f28449h;

    /* renamed from: i, reason: collision with root package name */
    public final n1 f28450i;

    /* renamed from: j, reason: collision with root package name */
    public final n1 f28451j;

    /* renamed from: k, reason: collision with root package name */
    public final n1 f28452k;

    /* renamed from: l, reason: collision with root package name */
    public final n1 f28453l;

    /* renamed from: m, reason: collision with root package name */
    public final j0 f28454m;

    /* renamed from: n, reason: collision with root package name */
    public final w1 f28455n;

    public i() {
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f35116a;
        this.f28442a = t0.t.n0(bool, o3Var);
        this.f28443b = t0.t.n0(1, o3Var);
        this.f28444c = t0.t.n0(1, o3Var);
        this.f28445d = t0.t.n0(bool, o3Var);
        this.f28446e = t0.t.n0(null, o3Var);
        this.f28447f = t0.t.n0(Float.valueOf(1.0f), o3Var);
        this.f28448g = t0.t.n0(bool, o3Var);
        this.f28449h = t0.t.N(new g(this, 1));
        this.f28450i = t0.t.n0(null, o3Var);
        Float valueOf = Float.valueOf(s0.g.f34069a);
        this.f28451j = t0.t.n0(valueOf, o3Var);
        this.f28452k = t0.t.n0(valueOf, o3Var);
        this.f28453l = t0.t.n0(Long.MIN_VALUE, o3Var);
        this.f28454m = t0.t.N(new g(this, 0));
        t0.t.N(new g(this, 2));
        this.f28455n = new w1();
    }

    public static final boolean b(i iVar, int i10, long j10) {
        long longValue;
        float floatValue;
        float f10;
        j9.i iVar2 = (j9.i) iVar.f28450i.getValue();
        if (iVar2 == null) {
            return true;
        }
        n1 n1Var = iVar.f28453l;
        if (((Number) n1Var.getValue()).longValue() == Long.MIN_VALUE) {
            longValue = 0;
        } else {
            longValue = j10 - ((Number) n1Var.getValue()).longValue();
        }
        n1Var.setValue(Long.valueOf(j10));
        n1 n1Var2 = iVar.f28446e;
        a3.a.u(n1Var2.getValue());
        a3.a.u(n1Var2.getValue());
        float b10 = ((float) (longValue / 1000000)) / iVar2.b();
        j0 j0Var = iVar.f28449h;
        float floatValue2 = ((Number) j0Var.getValue()).floatValue() * b10;
        float floatValue3 = ((Number) j0Var.getValue()).floatValue();
        n1 n1Var3 = iVar.f28451j;
        if (floatValue3 < s0.g.f34069a) {
            floatValue = s0.g.f34069a - (((Number) n1Var3.getValue()).floatValue() + floatValue2);
        } else {
            floatValue = (((Number) n1Var3.getValue()).floatValue() + floatValue2) - 1.0f;
        }
        if (floatValue < s0.g.f34069a) {
            iVar.h(kotlin.ranges.d.e(((Number) n1Var3.getValue()).floatValue(), s0.g.f34069a, 1.0f) + floatValue2);
            return true;
        }
        int i11 = (int) (floatValue / 1.0f);
        int i12 = i11 + 1;
        if (iVar.f() + i12 > i10) {
            iVar.h(iVar.e());
            iVar.g(i10);
            return false;
        }
        iVar.g(iVar.f() + i12);
        float f11 = floatValue - (i11 * 1.0f);
        if (((Number) j0Var.getValue()).floatValue() < s0.g.f34069a) {
            f10 = 1.0f - f11;
        } else {
            f10 = s0.g.f34069a + f11;
        }
        iVar.h(f10);
        return true;
    }

    public static final void d(i iVar, boolean z10) {
        iVar.f28442a.setValue(Boolean.valueOf(z10));
    }

    public final float e() {
        return ((Number) this.f28454m.getValue()).floatValue();
    }

    public final int f() {
        return ((Number) this.f28443b.getValue()).intValue();
    }

    public final void g(int i10) {
        this.f28443b.setValue(Integer.valueOf(i10));
    }

    @Override // t0.l3
    public final Object getValue() {
        return Float.valueOf(((Number) this.f28452k.getValue()).floatValue());
    }

    public final void h(float f10) {
        j9.i iVar;
        this.f28451j.setValue(Float.valueOf(f10));
        if (((Boolean) this.f28448g.getValue()).booleanValue() && (iVar = (j9.i) this.f28450i.getValue()) != null) {
            f10 -= f10 % (1 / iVar.f21178m);
        }
        this.f28452k.setValue(Float.valueOf(f10));
    }
}

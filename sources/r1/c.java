package r1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import n1.z0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f32845b;

    /* renamed from: h, reason: collision with root package name */
    public n1.h f32851h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f32852i;

    /* renamed from: l, reason: collision with root package name */
    public float f32855l;

    /* renamed from: m, reason: collision with root package name */
    public float f32856m;

    /* renamed from: n, reason: collision with root package name */
    public float f32857n;

    /* renamed from: q, reason: collision with root package name */
    public float f32860q;

    /* renamed from: r, reason: collision with root package name */
    public float f32861r;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f32846c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f32847d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f32848e = n1.t.f28177i;

    /* renamed from: f, reason: collision with root package name */
    public List f32849f = h0.f32945a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32850g = true;

    /* renamed from: j, reason: collision with root package name */
    public final t.g0 f32853j = new t.g0(this, 25);

    /* renamed from: k, reason: collision with root package name */
    public String f32854k = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: o, reason: collision with root package name */
    public float f32858o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f32859p = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32862s = true;

    @Override // r1.c0
    public final void a(p1.h hVar) {
        if (this.f32862s) {
            float[] fArr = this.f32845b;
            if (fArr == null) {
                fArr = new float[]{1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};
                this.f32845b = fArr;
            } else {
                n1.k0.c(fArr);
            }
            n1.k0.e(fArr, this.f32860q + this.f32856m, this.f32861r + this.f32857n);
            double d10 = (this.f32855l * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d10);
            float sin = (float) Math.sin(d10);
            float f10 = fArr[0];
            float f11 = fArr[4];
            float f12 = (sin * f11) + (cos * f10);
            float f13 = -sin;
            float f14 = (f11 * cos) + (f10 * f13);
            float f15 = fArr[1];
            float f16 = fArr[5];
            float f17 = (sin * f16) + (cos * f15);
            float f18 = (f16 * cos) + (f15 * f13);
            float f19 = fArr[2];
            float f20 = fArr[6];
            float f21 = (sin * f20) + (cos * f19);
            float f22 = (f20 * cos) + (f19 * f13);
            float f23 = fArr[3];
            float f24 = fArr[7];
            float f25 = (sin * f24) + (cos * f23);
            float f26 = (cos * f24) + (f13 * f23);
            fArr[0] = f12;
            fArr[1] = f17;
            fArr[2] = f21;
            fArr[3] = f25;
            fArr[4] = f14;
            fArr[5] = f18;
            fArr[6] = f22;
            fArr[7] = f26;
            float f27 = this.f32858o;
            float f28 = this.f32859p;
            fArr[0] = f12 * f27;
            fArr[1] = f17 * f27;
            fArr[2] = f21 * f27;
            fArr[3] = f25 * f27;
            fArr[4] = f14 * f28;
            fArr[5] = f18 * f28;
            fArr[6] = f22 * f28;
            fArr[7] = f26 * f28;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            n1.k0.e(fArr, -this.f32856m, -this.f32857n);
            this.f32862s = false;
        }
        if (this.f32850g) {
            if (!this.f32849f.isEmpty()) {
                n1.h hVar2 = this.f32851h;
                if (hVar2 == null) {
                    hVar2 = androidx.compose.ui.graphics.a.h();
                    this.f32851h = hVar2;
                }
                b.b(this.f32849f, hVar2);
            }
            this.f32850g = false;
        }
        p1.b f02 = hVar.f0();
        long b10 = f02.b();
        f02.a().h();
        float[] fArr2 = this.f32845b;
        p1.d dVar = f02.f30498a;
        if (fArr2 != null) {
            dVar.f30504a.a().l(fArr2);
        }
        n1.h hVar3 = this.f32851h;
        if ((!this.f32849f.isEmpty()) && hVar3 != null) {
            dVar.f30504a.a().u(hVar3, 1);
        }
        ArrayList arrayList = this.f32846c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) arrayList.get(i10)).a(hVar);
        }
        f02.a().s();
        f02.c(b10);
    }

    @Override // r1.c0
    public final Function1 b() {
        return this.f32852i;
    }

    @Override // r1.c0
    public final void d(t.g0 g0Var) {
        this.f32852i = g0Var;
    }

    public final void e(int i10, c0 c0Var) {
        ArrayList arrayList = this.f32846c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.f32853j);
        c();
    }

    public final void f(long j10) {
        if (this.f32847d && j10 != 16) {
            long j11 = this.f32848e;
            if (j11 == 16) {
                this.f32848e = j10;
                return;
            }
            vt.i0 i0Var = h0.f32945a;
            if (n1.t.i(j11) != n1.t.i(j10) || n1.t.h(j11) != n1.t.h(j10) || n1.t.f(j11) != n1.t.f(j10)) {
                this.f32847d = false;
                this.f32848e = n1.t.f28177i;
            }
        }
    }

    public final void g(c0 c0Var) {
        if (c0Var instanceof h) {
            h hVar = (h) c0Var;
            n1.p pVar = hVar.f32926b;
            if (this.f32847d && pVar != null) {
                if (pVar instanceof z0) {
                    f(((z0) pVar).f28221a);
                } else {
                    this.f32847d = false;
                    this.f32848e = n1.t.f28177i;
                }
            }
            n1.p pVar2 = hVar.f32931g;
            if (this.f32847d && pVar2 != null) {
                if (pVar2 instanceof z0) {
                    f(((z0) pVar2).f28221a);
                    return;
                } else {
                    this.f32847d = false;
                    this.f32848e = n1.t.f28177i;
                    return;
                }
            }
            return;
        }
        if (c0Var instanceof c) {
            c cVar = (c) c0Var;
            if (cVar.f32847d && this.f32847d) {
                f(cVar.f32848e);
            } else {
                this.f32847d = false;
                this.f32848e = n1.t.f28177i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f32854k);
        ArrayList arrayList = this.f32846c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(c0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}

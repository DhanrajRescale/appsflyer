package q0;

import android.view.ViewGroup;
import c2.j0;
import java.util.HashMap;
import t0.g1;
import t0.h2;
import t0.l3;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class a extends w implements h2, t {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31455c;

    /* renamed from: d, reason: collision with root package name */
    public final float f31456d;

    /* renamed from: e, reason: collision with root package name */
    public final l3 f31457e;

    /* renamed from: f, reason: collision with root package name */
    public final l3 f31458f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f31459g;

    /* renamed from: h, reason: collision with root package name */
    public s f31460h;

    /* renamed from: i, reason: collision with root package name */
    public final n1 f31461i;

    /* renamed from: j, reason: collision with root package name */
    public final n1 f31462j;

    /* renamed from: k, reason: collision with root package name */
    public long f31463k;

    /* renamed from: l, reason: collision with root package name */
    public int f31464l;

    /* renamed from: m, reason: collision with root package name */
    public final x.a f31465m;

    public a(boolean z10, float f10, g1 g1Var, g1 g1Var2, ViewGroup viewGroup) {
        super(z10, g1Var2);
        this.f31455c = z10;
        this.f31456d = f10;
        this.f31457e = g1Var;
        this.f31458f = g1Var2;
        this.f31459g = viewGroup;
        o3 o3Var = o3.f35116a;
        this.f31461i = t0.t.n0(null, o3Var);
        this.f31462j = t0.t.n0(Boolean.TRUE, o3Var);
        this.f31463k = m1.f.f27251b;
        this.f31464l = -1;
        this.f31465m = new x.a(this, 17);
    }

    @Override // q0.t
    public final void G() {
        this.f31461i.setValue(null);
    }

    @Override // t0.h2
    public final void a() {
        s sVar = this.f31460h;
        if (sVar != null) {
            G();
            u uVar = sVar.f31539d;
            v vVar = (v) uVar.f31541a.get(this);
            if (vVar != null) {
                vVar.c();
                HashMap hashMap = uVar.f31541a;
                v vVar2 = (v) hashMap.get(this);
                if (vVar2 != null) {
                }
                hashMap.remove(this);
                sVar.f31538c.add(vVar);
            }
        }
    }

    @Override // t0.h2
    public final void b() {
        s sVar = this.f31460h;
        if (sVar != null) {
            G();
            u uVar = sVar.f31539d;
            v vVar = (v) uVar.f31541a.get(this);
            if (vVar != null) {
                vVar.c();
                HashMap hashMap = uVar.f31541a;
                v vVar2 = (v) hashMap.get(this);
                if (vVar2 != null) {
                }
                hashMap.remove(this);
                sVar.f31538c.add(vVar);
            }
        }
    }

    @Override // x.k1
    public final void c(p1.e eVar) {
        int m02;
        float c02;
        j0 j0Var = (j0) eVar;
        this.f31463k = j0Var.f7740a.d();
        float f10 = this.f31456d;
        if (Float.isNaN(f10)) {
            m02 = ku.c.b(r.a(eVar, this.f31455c, j0Var.f7740a.d()));
        } else {
            m02 = j0Var.f7740a.m0(f10);
        }
        this.f31464l = m02;
        long j10 = ((n1.t) this.f31457e.getValue()).f28179a;
        float f11 = ((i) this.f31458f.getValue()).f31503d;
        j0Var.a();
        if (Float.isNaN(f10)) {
            c02 = r.a(eVar, this.f31550a, j0Var.f7740a.d());
        } else {
            c02 = j0Var.c0(f10);
        }
        this.f31551b.b(eVar, c02, j10);
        n1.r a10 = j0Var.f7740a.f30501b.a();
        ((Boolean) this.f31462j.getValue()).booleanValue();
        v vVar = (v) this.f31461i.getValue();
        if (vVar != null) {
            vVar.e(j0Var.f7740a.d(), j10, f11, this.f31464l);
            vVar.draw(n1.d.a(a10));
        }
    }

    @Override // t0.h2
    public final void d() {
    }
}

package u5;

import android.text.TextUtils;
import b5.j1;
import com.google.android.gms.common.api.Api;
import e5.x;
import lp.e0;
import lp.h1;
import lp.i1;
import lp.o0;
import lp.q1;

/* loaded from: classes.dex */
public final class f extends n implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f36769e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f36770f;

    /* renamed from: g, reason: collision with root package name */
    public final String f36771g;

    /* renamed from: h, reason: collision with root package name */
    public final i f36772h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f36773i;

    /* renamed from: j, reason: collision with root package name */
    public final int f36774j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36775k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36776l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f36777m;

    /* renamed from: n, reason: collision with root package name */
    public final int f36778n;

    /* renamed from: o, reason: collision with root package name */
    public final int f36779o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f36780p;

    /* renamed from: q, reason: collision with root package name */
    public final int f36781q;

    /* renamed from: r, reason: collision with root package name */
    public final int f36782r;

    /* renamed from: s, reason: collision with root package name */
    public final int f36783s;

    /* renamed from: t, reason: collision with root package name */
    public final int f36784t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f36785u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f36786v;

    public f(int i10, j1 j1Var, int i11, i iVar, int i12, boolean z10, e eVar) {
        super(i10, i11, j1Var);
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        this.f36772h = iVar;
        this.f36771g = p.h(this.f36812d.f3643c);
        int i16 = 0;
        this.f36773i = p.f(i12, false);
        int i17 = 0;
        while (true) {
            int size = iVar.f3476n.size();
            i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i17 < size) {
                i14 = p.d(this.f36812d, (String) iVar.f3476n.get(i17), false);
                if (i14 > 0) {
                    break;
                } else {
                    i17++;
                }
            } else {
                i14 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f36775k = i17;
        this.f36774j = i14;
        this.f36776l = p.a(this.f36812d.f3645e, iVar.f3477o);
        b5.v vVar = this.f36812d;
        int i18 = vVar.f3645e;
        if (i18 != 0 && (i18 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f36777m = z11;
        if ((vVar.f3644d & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f36780p = z12;
        int i19 = vVar.f3665y;
        this.f36781q = i19;
        this.f36782r = vVar.f3666z;
        int i20 = vVar.f3648h;
        this.f36783s = i20;
        if ((i20 == -1 || i20 <= iVar.f3479q) && ((i19 == -1 || i19 <= iVar.f3478p) && eVar.apply(vVar))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f36770f = z13;
        String[] x10 = x.x();
        int i21 = 0;
        while (true) {
            if (i21 < x10.length) {
                i15 = p.d(this.f36812d, x10[i21], false);
                if (i15 > 0) {
                    break;
                } else {
                    i21++;
                }
            } else {
                i15 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f36778n = i21;
        this.f36779o = i15;
        int i22 = 0;
        while (true) {
            o0 o0Var = iVar.f3480r;
            if (i22 < o0Var.size()) {
                String str = this.f36812d.f3652l;
                if (str != null && str.equals(o0Var.get(i22))) {
                    i13 = i22;
                    break;
                }
                i22++;
            } else {
                break;
            }
        }
        this.f36784t = i13;
        if (i5.f.h(i12) == 128) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f36785u = z14;
        if (i5.f.i(i12) == 64) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f36786v = z15;
        i iVar2 = this.f36772h;
        if (p.f(i12, iVar2.X) && ((z16 = this.f36770f) || iVar2.E)) {
            i16 = (!p.f(i12, false) || !z16 || this.f36812d.f3648h == -1 || iVar2.f3486x || iVar2.f3485w || (!iVar2.Z && z10)) ? 1 : 2;
        }
        this.f36769e = i16;
    }

    @Override // u5.n
    public final int a() {
        return this.f36769e;
    }

    @Override // u5.n
    public final boolean b(n nVar) {
        int i10;
        String str;
        int i11;
        f fVar = (f) nVar;
        i iVar = this.f36772h;
        boolean z10 = iVar.H;
        b5.v vVar = fVar.f36812d;
        b5.v vVar2 = this.f36812d;
        if ((z10 || ((i11 = vVar2.f3665y) != -1 && i11 == vVar.f3665y)) && ((iVar.F || ((str = vVar2.f3652l) != null && TextUtils.equals(str, vVar.f3652l))) && (iVar.G || ((i10 = vVar2.f3666z) != -1 && i10 == vVar.f3666z)))) {
            if (!iVar.I) {
                if (this.f36785u != fVar.f36785u || this.f36786v != fVar.f36786v) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        i1 a10;
        i1 i1Var;
        boolean z10 = this.f36773i;
        boolean z11 = this.f36770f;
        if (z11 && z10) {
            a10 = p.f36827j;
        } else {
            a10 = p.f36827j.a();
        }
        e0 c10 = e0.f24968a.c(z10, fVar.f36773i);
        Integer valueOf = Integer.valueOf(this.f36775k);
        Integer valueOf2 = Integer.valueOf(fVar.f36775k);
        h1.f24991a.getClass();
        q1 q1Var = q1.f25045a;
        e0 b10 = c10.b(valueOf, valueOf2, q1Var).a(this.f36774j, fVar.f36774j).a(this.f36776l, fVar.f36776l).c(this.f36780p, fVar.f36780p).c(this.f36777m, fVar.f36777m).b(Integer.valueOf(this.f36778n), Integer.valueOf(fVar.f36778n), q1Var).a(this.f36779o, fVar.f36779o).c(z11, fVar.f36770f).b(Integer.valueOf(this.f36784t), Integer.valueOf(fVar.f36784t), q1Var);
        int i10 = this.f36783s;
        Integer valueOf3 = Integer.valueOf(i10);
        int i11 = fVar.f36783s;
        Integer valueOf4 = Integer.valueOf(i11);
        if (this.f36772h.f3485w) {
            i1Var = p.f36827j.a();
        } else {
            i1Var = p.f36828k;
        }
        e0 b11 = b10.b(valueOf3, valueOf4, i1Var).c(this.f36785u, fVar.f36785u).c(this.f36786v, fVar.f36786v).b(Integer.valueOf(this.f36781q), Integer.valueOf(fVar.f36781q), a10).b(Integer.valueOf(this.f36782r), Integer.valueOf(fVar.f36782r), a10);
        Integer valueOf5 = Integer.valueOf(i10);
        Integer valueOf6 = Integer.valueOf(i11);
        if (!x.a(this.f36771g, fVar.f36771g)) {
            a10 = p.f36828k;
        }
        return b11.b(valueOf5, valueOf6, a10).e();
    }
}

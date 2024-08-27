package u5;

import e5.x;
import lp.c0;
import lp.e0;
import lp.h1;
import lp.i1;
import lp.q1;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f36813e;

    /* renamed from: f, reason: collision with root package name */
    public final i f36814f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36815g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36816h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36817i;

    /* renamed from: j, reason: collision with root package name */
    public final int f36818j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36819k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36820l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f36821m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f36822n;

    /* renamed from: o, reason: collision with root package name */
    public final int f36823o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f36824p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f36825q;

    /* renamed from: r, reason: collision with root package name */
    public final int f36826r;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(int r5, b5.j1 r6, int r7, u5.i r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.o.<init>(int, b5.j1, int, u5.i, int, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        i1 a10;
        i1 i1Var;
        if (oVar.f36813e && oVar.f36816h) {
            a10 = p.f36827j;
        } else {
            a10 = p.f36827j.a();
        }
        c0 c0Var = e0.f24968a;
        int i10 = oVar.f36817i;
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(oVar2.f36817i);
        if (oVar.f36814f.f3485w) {
            i1Var = p.f36827j.a();
        } else {
            i1Var = p.f36828k;
        }
        return c0Var.b(valueOf, valueOf2, i1Var).b(Integer.valueOf(oVar.f36818j), Integer.valueOf(oVar2.f36818j), a10).b(Integer.valueOf(i10), Integer.valueOf(oVar2.f36817i), a10).e();
    }

    public static int d(o oVar, o oVar2) {
        e0 c10 = e0.f24968a.c(oVar.f36816h, oVar2.f36816h).a(oVar.f36820l, oVar2.f36820l).c(oVar.f36821m, oVar2.f36821m).c(oVar.f36813e, oVar2.f36813e).c(oVar.f36815g, oVar2.f36815g);
        Integer valueOf = Integer.valueOf(oVar.f36819k);
        Integer valueOf2 = Integer.valueOf(oVar2.f36819k);
        h1.f24991a.getClass();
        e0 b10 = c10.b(valueOf, valueOf2, q1.f25045a);
        boolean z10 = oVar2.f36824p;
        boolean z11 = oVar.f36824p;
        e0 c11 = b10.c(z11, z10);
        boolean z12 = oVar2.f36825q;
        boolean z13 = oVar.f36825q;
        e0 c12 = c11.c(z13, z12);
        if (z11 && z13) {
            c12 = c12.a(oVar.f36826r, oVar2.f36826r);
        }
        return c12.e();
    }

    @Override // u5.n
    public final int a() {
        return this.f36823o;
    }

    @Override // u5.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.f36822n || x.a(this.f36812d.f3652l, oVar.f36812d.f3652l)) {
            if (!this.f36814f.D) {
                if (this.f36824p != oVar.f36824p || this.f36825q != oVar.f36825q) {
                }
            }
            return true;
        }
        return false;
    }
}

package b7;

import java.util.List;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f3881a;

    /* renamed from: b, reason: collision with root package name */
    public final z5.b0[] f3882b;

    public j0(List list) {
        this.f3881a = list;
        this.f3882b = new z5.b0[list.size()];
    }

    public final void a(long j10, e5.p pVar) {
        if (pVar.a() < 9) {
            return;
        }
        int g10 = pVar.g();
        int g11 = pVar.g();
        int u10 = pVar.u();
        if (g10 == 434 && g11 == 1195456820 && u10 == 3) {
            vl.b.k(j10, pVar, this.f3882b);
        }
    }

    public final void b(z5.r rVar, h0 h0Var) {
        boolean z10;
        int i10 = 0;
        while (true) {
            z5.b0[] b0VarArr = this.f3882b;
            if (i10 < b0VarArr.length) {
                h0Var.a();
                h0Var.b();
                z5.b0 f10 = rVar.f(h0Var.f3872d, 3);
                b5.v vVar = (b5.v) this.f3881a.get(i10);
                String str = vVar.f3652l;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                yk.j.F0(z10, "Invalid closed caption MIME type provided: " + str);
                b5.u uVar = new b5.u();
                h0Var.b();
                uVar.f3590a = h0Var.f3873e;
                uVar.f3600k = str;
                uVar.f3593d = vVar.f3644d;
                uVar.f3592c = vVar.f3643c;
                uVar.C = vVar.D;
                uVar.f3602m = vVar.f3654n;
                f10.e(new b5.v(uVar));
                b0VarArr[i10] = f10;
                i10++;
            } else {
                return;
            }
        }
    }
}

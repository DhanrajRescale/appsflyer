package l0;

import i0.l1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e f23763a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23764b;

    /* renamed from: c, reason: collision with root package name */
    public final j2.e0 f23765c;

    /* renamed from: d, reason: collision with root package name */
    public final p2.v f23766d;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f23767e;

    /* renamed from: f, reason: collision with root package name */
    public long f23768f;

    /* renamed from: g, reason: collision with root package name */
    public final j2.e f23769g;

    public i(j2.e eVar, long j10, j2.e0 e0Var, p2.v vVar, a1 a1Var) {
        this.f23763a = eVar;
        this.f23764b = j10;
        this.f23765c = e0Var;
        this.f23766d = vVar;
        this.f23767e = a1Var;
        this.f23768f = j10;
        this.f23769g = eVar;
    }

    public final Integer a() {
        j2.e0 e0Var = this.f23765c;
        if (e0Var != null) {
            int d10 = j2.f0.d(this.f23768f);
            p2.v vVar = this.f23766d;
            return Integer.valueOf(vVar.a(e0Var.e(e0Var.f(vVar.b(d10)), true)));
        }
        return null;
    }

    public final Integer b() {
        j2.e0 e0Var = this.f23765c;
        if (e0Var != null) {
            int e10 = j2.f0.e(this.f23768f);
            p2.v vVar = this.f23766d;
            return Integer.valueOf(vVar.a(e0Var.j(e0Var.f(vVar.b(e10)))));
        }
        return null;
    }

    public final Integer c() {
        int length;
        j2.e0 e0Var = this.f23765c;
        if (e0Var != null) {
            int m10 = m();
            while (true) {
                j2.e eVar = this.f23763a;
                if (m10 >= eVar.f20699a.length()) {
                    length = eVar.f20699a.length();
                    break;
                }
                int length2 = this.f23769g.f20699a.length() - 1;
                if (m10 <= length2) {
                    length2 = m10;
                }
                long o10 = e0Var.o(length2);
                int i10 = j2.f0.f20711c;
                int i11 = (int) (o10 & 4294967295L);
                if (i11 <= m10) {
                    m10++;
                } else {
                    length = this.f23766d.a(i11);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer d() {
        int i10;
        j2.e0 e0Var = this.f23765c;
        if (e0Var != null) {
            int m10 = m();
            while (true) {
                if (m10 <= 0) {
                    i10 = 0;
                    break;
                }
                int length = this.f23769g.f20699a.length() - 1;
                if (m10 <= length) {
                    length = m10;
                }
                long o10 = e0Var.o(length);
                int i11 = j2.f0.f20711c;
                int i12 = (int) (o10 >> 32);
                if (i12 >= m10) {
                    m10--;
                } else {
                    i10 = this.f23766d.a(i12);
                    break;
                }
            }
            return Integer.valueOf(i10);
        }
        return null;
    }

    public final boolean e() {
        u2.h hVar;
        j2.e0 e0Var = this.f23765c;
        if (e0Var != null) {
            hVar = e0Var.m(m());
        } else {
            hVar = null;
        }
        if (hVar != u2.h.f36681b) {
            return true;
        }
        return false;
    }

    public final int f(j2.e0 e0Var, int i10) {
        int m10 = m();
        a1 a1Var = this.f23767e;
        if (a1Var.f23709a == null) {
            a1Var.f23709a = Float.valueOf(e0Var.c(m10).f27239a);
        }
        int f10 = e0Var.f(m10) + i10;
        if (f10 < 0) {
            return 0;
        }
        if (f10 >= e0Var.f20704b.f20735f) {
            return this.f23769g.f20699a.length();
        }
        float d10 = e0Var.d(f10) - 1;
        Float f11 = a1Var.f23709a;
        Intrinsics.c(f11);
        float floatValue = f11.floatValue();
        if ((e() && floatValue >= e0Var.i(f10)) || (!e() && floatValue <= e0Var.h(f10))) {
            return e0Var.e(f10, true);
        }
        return this.f23766d.a(e0Var.l(t0.t.g(f11.floatValue(), d10)));
    }

    public final void g() {
        this.f23767e.f23709a = null;
        j2.e eVar = this.f23769g;
        if (eVar.f20699a.length() > 0) {
            int d10 = j2.f0.d(this.f23768f);
            String str = eVar.f20699a;
            int s7 = l1.s(d10, str);
            if (s7 == j2.f0.d(this.f23768f) && s7 != str.length()) {
                s7 = l1.s(s7 + 1, str);
            }
            l(s7, s7);
        }
    }

    public final void h() {
        this.f23767e.f23709a = null;
        j2.e eVar = this.f23769g;
        if (eVar.f20699a.length() > 0) {
            int e10 = j2.f0.e(this.f23768f);
            String str = eVar.f20699a;
            int t10 = l1.t(e10, str);
            if (t10 == j2.f0.e(this.f23768f) && t10 != 0) {
                t10 = l1.t(t10 - 1, str);
            }
            l(t10, t10);
        }
    }

    public final void i() {
        Integer a10;
        this.f23767e.f23709a = null;
        if (this.f23769g.f20699a.length() > 0 && (a10 = a()) != null) {
            int intValue = a10.intValue();
            l(intValue, intValue);
        }
    }

    public final void j() {
        Integer b10;
        this.f23767e.f23709a = null;
        if (this.f23769g.f20699a.length() > 0 && (b10 = b()) != null) {
            int intValue = b10.intValue();
            l(intValue, intValue);
        }
    }

    public final void k() {
        if (this.f23769g.f20699a.length() > 0) {
            int i10 = j2.f0.f20711c;
            this.f23768f = d2.w0.b((int) (this.f23764b >> 32), (int) (this.f23768f & 4294967295L));
        }
    }

    public final void l(int i10, int i11) {
        this.f23768f = d2.w0.b(i10, i11);
    }

    public final int m() {
        long j10 = this.f23768f;
        int i10 = j2.f0.f20711c;
        return this.f23766d.b((int) (j10 & 4294967295L));
    }
}

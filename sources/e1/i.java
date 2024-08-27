package e1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import t0.i3;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14879e = 0;

    /* renamed from: a, reason: collision with root package name */
    public n f14880a;

    /* renamed from: b, reason: collision with root package name */
    public int f14881b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14882c;

    /* renamed from: d, reason: collision with root package name */
    public int f14883d;

    public i(int i10, n nVar) {
        int i11;
        int numberOfTrailingZeros;
        this.f14880a = nVar;
        this.f14881b = i10;
        if (i10 != 0) {
            n e10 = e();
            i3 i3Var = p.f14904a;
            int[] iArr = e10.f14900d;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                long j10 = e10.f14898b;
                int i12 = e10.f14899c;
                if (j10 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                } else {
                    long j11 = e10.f14897a;
                    if (j11 != 0) {
                        i12 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                    }
                }
                i10 = numberOfTrailingZeros + i12;
            }
            synchronized (p.f14905b) {
                i11 = p.f14908e.a(i10);
            }
        } else {
            i11 = -1;
        }
        this.f14883d = i11;
    }

    public static void p(i iVar) {
        p.f14904a.b(iVar);
    }

    public final void a() {
        synchronized (p.f14905b) {
            b();
            o();
            Unit unit = Unit.f23355a;
        }
    }

    public void b() {
        p.f14906c = p.f14906c.e(d());
    }

    public void c() {
        this.f14882c = true;
        synchronized (p.f14905b) {
            int i10 = this.f14883d;
            if (i10 >= 0) {
                p.s(i10);
                this.f14883d = -1;
            }
            Unit unit = Unit.f23355a;
        }
    }

    public int d() {
        return this.f14881b;
    }

    public n e() {
        return this.f14880a;
    }

    public abstract Function1 f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final i j() {
        i3 i3Var = p.f14904a;
        i iVar = (i) i3Var.a();
        i3Var.b(this);
        return iVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(y yVar);

    public void o() {
        int i10 = this.f14883d;
        if (i10 >= 0) {
            p.s(i10);
            this.f14883d = -1;
        }
    }

    public void q(int i10) {
        this.f14881b = i10;
    }

    public void r(n nVar) {
        this.f14880a = nVar;
    }

    public void s(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract i t(Function1 function1);
}

package c0;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a0 implements x, a2.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f7438a;

    /* renamed from: b, reason: collision with root package name */
    public int f7439b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7440c;

    /* renamed from: d, reason: collision with root package name */
    public float f7441d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7442e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7443f;

    /* renamed from: g, reason: collision with root package name */
    public final qu.f0 f7444g;

    /* renamed from: h, reason: collision with root package name */
    public final w2.b f7445h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7446i;

    /* renamed from: j, reason: collision with root package name */
    public final List f7447j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7448k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7449l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7450m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a2.n0 f7451n;

    public a0(b0 b0Var, int i10, boolean z10, float f10, a2.n0 n0Var, float f11, boolean z11, qu.f0 f0Var, w2.b bVar, long j10, List list, int i11, int i12, int i13, int i14) {
        this.f7438a = b0Var;
        this.f7439b = i10;
        this.f7440c = z10;
        this.f7441d = f10;
        this.f7442e = f11;
        this.f7443f = z11;
        this.f7444g = f0Var;
        this.f7445h = bVar;
        this.f7446i = j10;
        this.f7447j = list;
        this.f7448k = i11;
        this.f7449l = i12;
        this.f7450m = i13;
        this.f7451n = n0Var;
    }

    @Override // a2.n0
    public final int a() {
        return this.f7451n.a();
    }

    @Override // a2.n0
    public final int b() {
        return this.f7451n.b();
    }

    @Override // a2.n0
    public final Map c() {
        return this.f7451n.c();
    }

    @Override // a2.n0
    public final void d() {
        this.f7451n.d();
    }

    @Override // a2.n0
    public final Function1 e() {
        return this.f7451n.e();
    }

    public final boolean f(int i10, boolean z10) {
        b0 b0Var;
        int i11;
        if (this.f7443f) {
            return false;
        }
        List list = this.f7447j;
        if (list.isEmpty() || (b0Var = this.f7438a) == null || (i11 = this.f7439b - i10) < 0 || i11 >= b0Var.f7478o) {
            return false;
        }
        b0 b0Var2 = (b0) vt.g0.u(list);
        b0 b0Var3 = (b0) vt.g0.C(list);
        if (b0Var2.f7480q || b0Var3.f7480q) {
            return false;
        }
        int i12 = this.f7449l;
        int i13 = this.f7448k;
        if (i10 < 0) {
            if (Math.min((b0Var2.f7476m + b0Var2.f7478o) - i13, (b0Var3.f7476m + b0Var3.f7478o) - i12) <= (-i10)) {
                return false;
            }
        } else if (Math.min(i13 - b0Var2.f7476m, i12 - b0Var3.f7476m) <= i10) {
            return false;
        }
        this.f7439b -= i10;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            b0 b0Var4 = (b0) list.get(i14);
            if (!b0Var4.f7480q) {
                b0Var4.f7476m += i10;
                int[] iArr = b0Var4.f7482s;
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    boolean z11 = b0Var4.f7466c;
                    if ((z11 && i15 % 2 == 1) || (!z11 && i15 % 2 == 0)) {
                        iArr[i15] = iArr[i15] + i10;
                    }
                }
                if (z10) {
                    int size2 = b0Var4.f7465b.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                    }
                }
            }
        }
        this.f7441d = i10;
        if (!this.f7440c && i10 > 0) {
            this.f7440c = true;
        }
        return true;
    }
}

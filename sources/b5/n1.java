package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n1 implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final String f3547f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f3548g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f3549h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3550i;

    /* renamed from: a, reason: collision with root package name */
    public final int f3551a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f3552b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3553c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3554d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f3555e;

    static {
        int i10 = e5.x.f15050a;
        f3547f = Integer.toString(0, 36);
        f3548g = Integer.toString(1, 36);
        f3549h = Integer.toString(3, 36);
        f3550i = Integer.toString(4, 36);
    }

    public n1(j1 j1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = j1Var.f3376a;
        this.f3551a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        yk.j.E0(z11);
        this.f3552b = j1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f3553c = z12;
        this.f3554d = (int[]) iArr.clone();
        this.f3555e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f3552b.f3378c;
    }

    public final boolean b() {
        for (boolean z10 : this.f3555e) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        for (int i10 = 0; i10 < this.f3554d.length; i10++) {
            if (d(i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i10) {
        if (this.f3554d[i10] != 4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n1.class != obj.getClass()) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (this.f3553c == n1Var.f3553c && this.f3552b.equals(n1Var.f3552b) && Arrays.equals(this.f3554d, n1Var.f3554d) && Arrays.equals(this.f3555e, n1Var.f3555e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3555e) + ((Arrays.hashCode(this.f3554d) + (((this.f3552b.hashCode() * 31) + (this.f3553c ? 1 : 0)) * 31)) * 31);
    }
}

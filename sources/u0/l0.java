package u0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import t0.q2;

/* loaded from: classes.dex */
public final class l0 extends bl.j {

    /* renamed from: c, reason: collision with root package name */
    public int f36643c;

    /* renamed from: e, reason: collision with root package name */
    public int f36645e;

    /* renamed from: g, reason: collision with root package name */
    public int f36647g;

    /* renamed from: h, reason: collision with root package name */
    public int f36648h;

    /* renamed from: i, reason: collision with root package name */
    public int f36649i;

    /* renamed from: b, reason: collision with root package name */
    public j0[] f36642b = new j0[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f36644d = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f36646f = new Object[16];

    public static final int a0(l0 l0Var, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    public final void b0() {
        this.f36643c = 0;
        this.f36645e = 0;
        vt.t.k(0, this.f36647g, this.f36646f);
        this.f36647g = 0;
    }

    public final void c0(t0.f fVar, q2 q2Var, t0.x xVar) {
        l0 l0Var;
        int i10;
        if (e0()) {
            k0 k0Var = new k0(this);
            do {
                l0Var = k0Var.f36640d;
                j0 j0Var = l0Var.f36642b[k0Var.f36637a];
                Intrinsics.c(j0Var);
                j0Var.a(k0Var, fVar, q2Var, xVar);
                int i11 = k0Var.f36637a;
                if (i11 >= l0Var.f36643c) {
                    break;
                }
                j0 j0Var2 = l0Var.f36642b[i11];
                Intrinsics.c(j0Var2);
                k0Var.f36638b += j0Var2.f36634a;
                k0Var.f36639c += j0Var2.f36635b;
                i10 = k0Var.f36637a + 1;
                k0Var.f36637a = i10;
            } while (i10 < l0Var.f36643c);
        }
        b0();
    }

    public final boolean d0() {
        return this.f36643c == 0;
    }

    public final boolean e0() {
        return this.f36643c != 0;
    }

    public final j0 f0() {
        j0 j0Var = this.f36642b[this.f36643c - 1];
        Intrinsics.c(j0Var);
        return j0Var;
    }

    public final void g0(j0 j0Var) {
        int i10 = j0Var.f36634a;
        int i11 = j0Var.f36635b;
        if (i10 == 0 && i11 == 0) {
            h0(j0Var);
            return;
        }
        al.d.e1("Cannot push " + j0Var + " without arguments because it expects " + i10 + " ints and " + i11 + " objects.");
        throw null;
    }

    public final void h0(j0 j0Var) {
        int i10;
        int i11;
        this.f36648h = 0;
        this.f36649i = 0;
        int i12 = this.f36643c;
        j0[] j0VarArr = this.f36642b;
        int length = j0VarArr.length;
        int i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i12 == length) {
            if (i12 > 1024) {
                i11 = 1024;
            } else {
                i11 = i12;
            }
            Object[] copyOf = Arrays.copyOf(j0VarArr, i12 + i11);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f36642b = (j0[]) copyOf;
        }
        int i14 = this.f36645e;
        int i15 = j0Var.f36634a;
        int i16 = i14 + i15;
        int[] iArr = this.f36644d;
        int length2 = iArr.length;
        if (i16 > length2) {
            if (length2 > 1024) {
                i10 = 1024;
            } else {
                i10 = length2;
            }
            int i17 = length2 + i10;
            if (i17 >= i16) {
                i16 = i17;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f36644d = copyOf2;
        }
        int i18 = this.f36647g;
        int i19 = j0Var.f36635b;
        int i20 = i18 + i19;
        Object[] objArr = this.f36646f;
        int length3 = objArr.length;
        if (i20 > length3) {
            if (length3 <= 1024) {
                i13 = length3;
            }
            int i21 = length3 + i13;
            if (i21 >= i20) {
                i20 = i21;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i20);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, newSize)");
            this.f36646f = copyOf3;
        }
        j0[] j0VarArr2 = this.f36642b;
        int i22 = this.f36643c;
        this.f36643c = i22 + 1;
        j0VarArr2[i22] = j0Var;
        this.f36645e += i15;
        this.f36647g += i19;
    }

    public final String toString() {
        return super.toString();
    }
}

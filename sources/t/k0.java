package t;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f34875a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f34876b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f34877c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f34878d;

    public k0() {
        this(0);
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f34878d;
        if (i11 != 0 && i10 <= this.f34876b[i11 - 1]) {
            g(i10, obj);
            return;
        }
        if (this.f34875a && i11 >= this.f34876b.length) {
            l0.a(this);
        }
        int i12 = this.f34878d;
        if (i12 >= this.f34876b.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f34876b, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f34876b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f34877c, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f34877c = copyOf2;
        }
        this.f34876b[i12] = i10;
        this.f34877c[i12] = obj;
        this.f34878d = i12 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k0 clone() {
        Object clone = super.clone();
        Intrinsics.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k0 k0Var = (k0) clone;
        k0Var.f34876b = (int[]) this.f34876b.clone();
        k0Var.f34877c = (Object[]) this.f34877c.clone();
        return k0Var;
    }

    public final boolean c(int i10) {
        if (this.f34875a) {
            l0.a(this);
        }
        if (u.a.a(this.f34878d, i10, this.f34876b) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(androidx.navigation.g gVar) {
        if (this.f34875a) {
            l0.a(this);
        }
        int i10 = this.f34878d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34877c[i11] == gVar) {
                if (i11 < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final Object e(int i10) {
        Object obj;
        Object obj2 = l0.f34880a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int a10 = u.a.a(this.f34878d, i10, this.f34876b);
        if (a10 < 0 || (obj = this.f34877c[a10]) == l0.f34880a) {
            return null;
        }
        return obj;
    }

    public final int f(int i10) {
        if (this.f34875a) {
            l0.a(this);
        }
        return this.f34876b[i10];
    }

    public final void g(int i10, Object obj) {
        int a10 = u.a.a(this.f34878d, i10, this.f34876b);
        if (a10 >= 0) {
            this.f34877c[a10] = obj;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f34878d;
        if (i11 < i12) {
            Object[] objArr = this.f34877c;
            if (objArr[i11] == l0.f34880a) {
                this.f34876b[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f34875a && i12 >= this.f34876b.length) {
            l0.a(this);
            i11 = ~u.a.a(this.f34878d, i10, this.f34876b);
        }
        int i13 = this.f34878d;
        if (i13 >= this.f34876b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] copyOf = Arrays.copyOf(this.f34876b, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f34876b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f34877c, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f34877c = copyOf2;
        }
        int i18 = this.f34878d;
        if (i18 - i11 != 0) {
            int[] iArr = this.f34876b;
            int i19 = i11 + 1;
            vt.t.c(i19, i11, i18, iArr, iArr);
            Object[] objArr2 = this.f34877c;
            vt.t.f(objArr2, i19, objArr2, i11, this.f34878d);
        }
        this.f34876b[i11] = i10;
        this.f34877c[i11] = obj;
        this.f34878d++;
    }

    public final int h() {
        if (this.f34875a) {
            l0.a(this);
        }
        return this.f34878d;
    }

    public final Object i(int i10) {
        if (this.f34875a) {
            l0.a(this);
        }
        return this.f34877c[i10];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f34878d * 28);
        sb2.append(UrlTreeKt.componentParamPrefixChar);
        int i10 = this.f34878d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i11));
            sb2.append('=');
            Object i12 = i(i11);
            if (i12 != this) {
                sb2.append(i12);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
        return sb3;
    }

    public k0(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f34876b = new int[i14];
        this.f34877c = new Object[i14];
    }
}

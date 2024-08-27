package t;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int[] f34897a;

    /* renamed from: b, reason: collision with root package name */
    public int f34898b;

    public s(int i10) {
        int[] iArr;
        if (i10 == 0) {
            iArr = l.f34879a;
        } else {
            iArr = new int[i10];
        }
        this.f34897a = iArr;
    }

    public final void a(int i10) {
        c(this.f34898b + 1);
        int[] iArr = this.f34897a;
        int i11 = this.f34898b;
        iArr[i11] = i10;
        this.f34898b = i11 + 1;
    }

    public final void b(int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= (i12 = this.f34898b)) {
            c(i12 + 1);
            int[] iArr = this.f34897a;
            int i13 = this.f34898b;
            if (i10 != i13) {
                vt.t.c(i10 + 1, i10, i13, iArr, iArr);
            }
            iArr[i10] = i11;
            this.f34898b++;
            return;
        }
        StringBuilder n10 = a3.a.n("Index ", i10, " must be in 0..");
        n10.append(this.f34898b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final void c(int i10) {
        int[] iArr = this.f34897a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f34897a = copyOf;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            int i10 = sVar.f34898b;
            int i11 = this.f34898b;
            if (i10 == i11) {
                int[] iArr = this.f34897a;
                int[] iArr2 = sVar.f34897a;
                IntRange k10 = kotlin.ranges.d.k(0, i11);
                int i12 = k10.f23381a;
                int i13 = k10.f23382b;
                if (i12 <= i13) {
                    while (iArr[i12] == iArr2[i12]) {
                        if (i12 != i13) {
                            i12++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int e(int i10) {
        if (i10 >= 0 && i10 < this.f34898b) {
            return this.f34897a[i10];
        }
        StringBuilder n10 = a3.a.n("Index ", i10, " must be in 0..");
        n10.append(this.f34898b - 1);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final int f() {
        return this.f34898b;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int[] iArr = this.f34897a;
        int i10 = this.f34898b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += Integer.hashCode(iArr[i12]) * 31;
        }
        return i11;
    }

    public final void h(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f34898b)) {
            int[] iArr = this.f34897a;
            int i12 = iArr[i10];
            if (i10 != i11 - 1) {
                vt.t.c(i10, i10 + 1, i11, iArr, iArr);
            }
            this.f34898b--;
            return;
        }
        StringBuilder n10 = a3.a.n("Index ", i10, " must be in 0..");
        n10.append(this.f34898b - 1);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f34897a;
        int i10 = this.f34898b;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                int i12 = iArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(i12);
                i11++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ s() {
        this(16);
    }
}

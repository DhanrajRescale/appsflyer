package vu;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import qu.y0;
import qu.z0;

/* loaded from: classes2.dex */
public class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38371b = AtomicIntegerFieldUpdater.newUpdater(g0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public y0[] f38372a;

    public final void a(y0 y0Var) {
        y0Var.e((z0) this);
        y0[] y0VarArr = this.f38372a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38371b;
        if (y0VarArr == null) {
            y0VarArr = new y0[4];
            this.f38372a = y0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= y0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(y0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            y0VarArr = (y0[]) copyOf;
            this.f38372a = y0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        y0VarArr[i10] = y0Var;
        y0Var.f32300b = i10;
        c(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qu.y0 b(int r9) {
        /*
            r8 = this;
            qu.y0[] r0 = r8.f38372a
            kotlin.jvm.internal.Intrinsics.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = vu.g0.f38371b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.Intrinsics.c(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.Intrinsics.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            qu.y0[] r5 = r8.f38372a
            kotlin.jvm.internal.Intrinsics.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.Intrinsics.c(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.Intrinsics.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.Intrinsics.c(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.Intrinsics.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.Intrinsics.c(r9)
            r2 = 0
            r9.e(r2)
            r9.f32300b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.g0.b(int):qu.y0");
    }

    public final void c(int i10) {
        while (i10 > 0) {
            y0[] y0VarArr = this.f38372a;
            Intrinsics.c(y0VarArr);
            int i11 = (i10 - 1) / 2;
            y0 y0Var = y0VarArr[i11];
            Intrinsics.c(y0Var);
            y0 y0Var2 = y0VarArr[i10];
            Intrinsics.c(y0Var2);
            if (y0Var.compareTo(y0Var2) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        y0[] y0VarArr = this.f38372a;
        Intrinsics.c(y0VarArr);
        y0 y0Var = y0VarArr[i11];
        Intrinsics.c(y0Var);
        y0 y0Var2 = y0VarArr[i10];
        Intrinsics.c(y0Var2);
        y0VarArr[i10] = y0Var;
        y0VarArr[i11] = y0Var2;
        y0Var.f32300b = i10;
        y0Var2.f32300b = i11;
    }
}

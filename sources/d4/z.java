package d4;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f13865a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f13866b;

    /* renamed from: c, reason: collision with root package name */
    public final View f13867c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13868d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f13869e;

    public z(View view) {
        this.f13867c = view;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent f12;
        if (!this.f13868d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return x1.a(f12, this.f13867c, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.f13868d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return x1.b(f12, this.f13867c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent f10;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f13868d || (f10 = f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f13867c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f13869e == null) {
                this.f13869e = new int[2];
            }
            iArr3 = this.f13869e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f13867c;
        if (f10 instanceof a0) {
            ((a0) f10).h(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                x1.c(f10, view2, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f10;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f13868d || (f10 = f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f13867c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f13869e == null) {
                this.f13869e = new int[2];
            }
            int[] iArr4 = this.f13869e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f13867c;
        if (f10 instanceof b0) {
            ((b0) f10).c(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f10 instanceof a0) {
                ((a0) f10).d(view2, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    x1.d(f10, view2, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 == 0) {
            return this.f13865a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f13866b;
    }

    public final boolean g(int i10) {
        if (f(i10) != null) {
            return true;
        }
        return false;
    }

    public final void h(boolean z10) {
        if (this.f13868d) {
            WeakHashMap weakHashMap = n1.f13788a;
            b1.z(this.f13867c);
        }
        this.f13868d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.g(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.f13868d
            if (r0 == 0) goto L7c
            android.view.View r0 = r8.f13867c
            android.view.ViewParent r2 = r0.getParent()
            r3 = r0
        L13:
            if (r2 == 0) goto L7c
            boolean r4 = r2 instanceof d4.a0
            java.lang.String r5 = "ViewParentCompat"
            java.lang.String r6 = "ViewParent "
            if (r4 == 0) goto L25
            r7 = r2
            d4.a0 r7 = (d4.a0) r7
            boolean r7 = r7.e(r3, r0, r9, r10)
            goto L2b
        L25:
            if (r10 != 0) goto L70
            boolean r7 = d4.x1.f(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L5b
        L2b:
            if (r7 == 0) goto L70
            if (r10 == 0) goto L35
            if (r10 == r1) goto L32
            goto L37
        L32:
            r8.f13866b = r2
            goto L37
        L35:
            r8.f13865a = r2
        L37:
            if (r4 == 0) goto L3f
            d4.a0 r2 = (d4.a0) r2
            r2.f(r3, r0, r9, r10)
            goto L5a
        L3f:
            if (r10 != 0) goto L5a
            d4.x1.e(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L45
            goto L5a
        L45:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r5, r10, r9)
        L5a:
            return r1
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r2)
            java.lang.String r6 = " does not implement interface method onStartNestedScroll"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r5, r6, r4)
        L70:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L77
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L77:
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L7c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.z.i(int, int):boolean");
    }

    public final void j(int i10) {
        ViewParent f10 = f(i10);
        if (f10 != null) {
            boolean z10 = f10 instanceof a0;
            View view = this.f13867c;
            if (z10) {
                ((a0) f10).g(view, i10);
            } else if (i10 == 0) {
                try {
                    x1.g(f10, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f13866b = null;
                    return;
                }
                return;
            }
            this.f13865a = null;
        }
    }
}

package ao;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class a extends al.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f2646b;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f2646b = bottomSheetBehavior;
    }

    @Override // al.d
    public final void H0(int i10) {
        if (i10 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f2646b;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.E(1);
            }
        }
    }

    @Override // al.d
    public final void I0(View view, int i10, int i11) {
        this.f2646b.u(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r7 > r4.E) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.y()) < java.lang.Math.abs(r6.getTop() - r4.E)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (java.lang.Math.abs(r7 - r4.E) < java.lang.Math.abs(r7 - r4.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (java.lang.Math.abs(r7 - r4.D) < java.lang.Math.abs(r7 - r4.G)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r7 < java.lang.Math.abs(r7 - r4.G)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r4.G)) goto L50;
     */
    @Override // al.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 6
            r3 = 3
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r5.f2646b
            if (r1 >= 0) goto L1d
            boolean r7 = r4.f11170b
            if (r7 == 0) goto L10
        Ld:
            r2 = r3
            goto Ld4
        L10:
            int r7 = r6.getTop()
            java.lang.System.currentTimeMillis()
            int r8 = r4.E
            if (r7 <= r8) goto Ld
            goto Ld4
        L1d:
            boolean r1 = r4.I
            if (r1 == 0) goto L6c
            boolean r1 = r4.F(r6, r8)
            if (r1 == 0) goto L6c
            float r7 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r8)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L3a
            int r7 = r4.f11174d
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L49
        L3a:
            int r7 = r6.getTop()
            int r8 = r4.T
            int r0 = r4.y()
            int r0 = r0 + r8
            int r0 = r0 / 2
            if (r7 <= r0) goto L4c
        L49:
            r2 = 5
            goto Ld4
        L4c:
            boolean r7 = r4.f11170b
            if (r7 == 0) goto L51
            goto Ld
        L51:
            int r7 = r6.getTop()
            int r8 = r4.y()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r0 = r4.E
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld4
            goto Ld
        L6c:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 4
            if (r0 == 0) goto L9a
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L7e
            goto L9a
        L7e:
            boolean r7 = r4.f11170b
            if (r7 == 0) goto L84
        L82:
            r2 = r1
            goto Ld4
        L84:
            int r7 = r6.getTop()
            int r8 = r4.E
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
            goto Ld4
        L9a:
            int r7 = r6.getTop()
            boolean r8 = r4.f11170b
            if (r8 == 0) goto Lb5
            int r8 = r4.D
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
            goto Ld
        Lb5:
            int r8 = r4.E
            if (r7 >= r8) goto Lc5
            int r8 = r4.G
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld4
            goto Ld
        Lc5:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
        Ld4:
            r4.getClass()
            r7 = 1
            r4.G(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.a.J0(android.view.View, float, float):void");
    }

    @Override // al.d
    public final int Y(View view, int i10) {
        return view.getLeft();
    }

    @Override // al.d
    public final int Z(View view, int i10) {
        return hl.f.F(i10, this.f2646b.y(), u0());
    }

    @Override // al.d
    public final boolean h1(View view, int i10) {
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.f2646b;
        int i11 = bottomSheetBehavior.L;
        if (i11 == 1 || bottomSheetBehavior.f11169a0) {
            return false;
        }
        if (i11 == 3 && bottomSheetBehavior.Y == i10) {
            WeakReference weakReference = bottomSheetBehavior.V;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        if (weakReference2 == null || weakReference2.get() != view) {
            return false;
        }
        return true;
    }

    @Override // al.d
    public final int u0() {
        BottomSheetBehavior bottomSheetBehavior = this.f2646b;
        if (bottomSheetBehavior.I) {
            return bottomSheetBehavior.T;
        }
        return bottomSheetBehavior.G;
    }
}

package uo;

import al.d;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import hl.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ll.o;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f37316b;

    public a(SideSheetBehavior sideSheetBehavior) {
        this.f37316b = sideSheetBehavior;
    }

    @Override // al.d
    public final void H0(int i10) {
        if (i10 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f37316b;
            if (sideSheetBehavior.f11416g) {
                sideSheetBehavior.s(1);
            }
        }
    }

    @Override // al.d
    public final void I0(View view, int i10, int i11) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f37316b;
        WeakReference weakReference = sideSheetBehavior.f11425p;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            o oVar = sideSheetBehavior.f11410a;
            int left = view.getLeft();
            view.getRight();
            int i12 = ((SideSheetBehavior) oVar.f24937b).f11422m;
            if (left <= i12) {
                marginLayoutParams.rightMargin = i12 - left;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f11429t;
        if (!linkedHashSet.isEmpty()) {
            o oVar2 = sideSheetBehavior.f11410a;
            oVar2.h();
            oVar2.g();
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                a3.a.u(it.next());
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r7.getLeft() > ((r1.h() - r1.g()) / 2)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (java.lang.Math.abs(r8 - r1.g()) < java.lang.Math.abs(r8 - r1.h())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r9 > 500) goto L14;
     */
    @Override // al.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r6.f37316b
            ll.o r1 = r0.f11410a
            r1.getClass()
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r4 = 3
            if (r3 >= 0) goto Lf
            goto L86
        Lf:
            int r3 = r7.getRight()
            float r3 = (float) r3
            java.lang.Object r5 = r1.f24937b
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            float r5 = r5.f11420k
            float r5 = r5 * r8
            float r5 = r5 + r3
            float r3 = java.lang.Math.abs(r5)
            java.lang.Object r5 = r1.f24937b
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            r5.getClass()
            r5 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 5
            if (r3 <= 0) goto L5c
            float r8 = java.lang.Math.abs(r8)
            float r2 = java.lang.Math.abs(r9)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L49
            java.lang.Object r8 = r1.f24937b
            com.google.android.material.sidesheet.SideSheetBehavior r8 = (com.google.android.material.sidesheet.SideSheetBehavior) r8
            r8.getClass()
            r8 = 500(0x1f4, float:7.0E-43)
            float r8 = (float) r8
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 <= 0) goto L49
            goto L5a
        L49:
            int r8 = r7.getLeft()
            int r9 = r1.h()
            int r1 = r1.g()
            int r9 = r9 - r1
            int r9 = r9 / 2
            if (r8 <= r9) goto L86
        L5a:
            r4 = r5
            goto L86
        L5c:
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 == 0) goto L6d
            float r8 = java.lang.Math.abs(r8)
            float r9 = java.lang.Math.abs(r9)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L6d
            goto L5a
        L6d:
            int r8 = r7.getLeft()
            int r9 = r1.g()
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r1 = r1.h()
            int r8 = r8 - r1
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto L5a
        L86:
            r8 = 1
            r0.u(r7, r4, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.a.J0(android.view.View, float, float):void");
    }

    @Override // al.d
    public final int Y(View view, int i10) {
        SideSheetBehavior sideSheetBehavior = this.f37316b;
        return f.F(i10, sideSheetBehavior.f11410a.g(), sideSheetBehavior.f11422m);
    }

    @Override // al.d
    public final int Z(View view, int i10) {
        return view.getTop();
    }

    @Override // al.d
    public final boolean h1(View view, int i10) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f37316b;
        if (sideSheetBehavior.f11417h == 1 || (weakReference = sideSheetBehavior.f11424o) == null || weakReference.get() != view) {
            return false;
        }
        return true;
    }

    @Override // al.d
    public final int t0(View view) {
        return this.f37316b.f11422m;
    }
}

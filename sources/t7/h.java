package t7;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f35474y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x, reason: collision with root package name */
    public int f35475x;

    public h(int i10) {
        this.f35475x = 3;
        if ((i10 & (-4)) == 0) {
            this.f35475x = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public static void I(w wVar) {
        int visibility = wVar.f35536b.getVisibility();
        HashMap hashMap = wVar.f35535a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = wVar.f35536b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t7.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t7.h0 K(t7.w r8, t7.w r9) {
        /*
            t7.h0 r0 = new t7.h0
            r0.<init>()
            r1 = 0
            r0.f35476a = r1
            r0.f35477b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f35535a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f35478c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f35480e = r6
            goto L33
        L2f:
            r0.f35478c = r3
            r0.f35480e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f35535a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f35479d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f35481f = r2
            goto L56
        L52:
            r0.f35479d = r3
            r0.f35481f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f35478c
            int r9 = r0.f35479d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f35480e
            android.view.ViewGroup r4 = r0.f35481f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f35477b = r1
            r0.f35476a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f35477b = r2
            r0.f35476a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f35481f
            if (r8 != 0) goto L81
            r0.f35477b = r1
            r0.f35476a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f35480e
            if (r8 != 0) goto L9f
            r0.f35477b = r2
            r0.f35476a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f35479d
            if (r8 != 0) goto L95
            r0.f35477b = r2
            r0.f35476a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f35478c
            if (r8 != 0) goto L9f
            r0.f35477b = r1
            r0.f35476a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.h.K(t7.w, t7.w):t7.h0");
    }

    public final ObjectAnimator J(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        y.f35540a.u(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y.f35541b, f11);
        ofFloat.addListener(new k7.z(view));
        a(new g(0, this, view));
        return ofFloat;
    }

    @Override // t7.p
    public final void d(w wVar) {
        I(wVar);
    }

    @Override // t7.p
    public final void g(w wVar) {
        I(wVar);
        wVar.f35535a.put("android:fade:transitionAlpha", Float.valueOf(y.f35540a.t(wVar.f35536b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (K(n(r3, false), q(r3, false)).f35476a != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f3  */
    @Override // t7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r23, t7.w r24, t7.w r25) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.h.k(android.view.ViewGroup, t7.w, t7.w):android.animation.Animator");
    }

    @Override // t7.p
    public final /* bridge */ /* synthetic */ String[] p() {
        return f35474y;
    }

    @Override // t7.p
    public final boolean r(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f35535a.containsKey("android:visibility:visibility") != wVar.f35535a.containsKey("android:visibility:visibility")) {
            return false;
        }
        h0 K = K(wVar, wVar2);
        if (!K.f35476a) {
            return false;
        }
        if (K.f35478c != 0 && K.f35479d != 0) {
            return false;
        }
        return true;
    }
}

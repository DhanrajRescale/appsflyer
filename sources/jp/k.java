package jp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class k extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f21539a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f21540b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = jp.x.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            r2 = 3
            android.content.Context r1 = r8.createPackageContext(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            goto Lc
        Lb:
            r1 = r0
        Lc:
            if (r1 == 0) goto L1f
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r2 = jp.x.a(r8)
            java.lang.String r3 = "clientTheme"
            java.lang.String r4 = "style"
            int r1 = r1.getIdentifier(r3, r4, r2)
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 != 0) goto L25
            r1 = 16974120(0x1030128, float:2.406173E-38)
        L25:
            r7.<init>(r8, r0, r1)
            j8.m r0 = new j8.m
            r0.<init>(r8)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setBackgroundColor(r1)
            android.widget.ProgressBar r1 = new android.widget.ProgressBar
            r1.<init>(r8)
            r7.f21539a = r1
            r2 = 8
            r1.setVisibility(r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r5 = 17
            r3.<init>(r4, r4, r5)
            r7.addView(r1, r3)
            android.content.res.Resources r1 = r8.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r3
            int r1 = (int) r1
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            r7.f21540b = r3
            r6 = 16973894(0x1030046, float:2.4061096E-38)
            r3.setTextAppearance(r8, r6)
            r8 = -1
            r3.setTextColor(r8)
            r3.setVisibility(r2)
            r3.setPadding(r1, r1, r1, r1)
            r3.setGravity(r5)
            java.lang.Object r8 = r0.f21093a
            java.lang.String r8 = (java.lang.String) r8
            r3.setText(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r4, r4, r5)
            r7.addView(r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.k.<init>(android.content.Context):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = (int) (size / 1.777f);
            } else {
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                    f10 = size2;
                } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    f10 = size2;
                    float f11 = size / 1.777f;
                    if (f10 >= f11) {
                        size2 = (int) f11;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f10 * 1.777f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.resolveSize(size, i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.resolveSize(size2, i11), 1073741824));
    }
}

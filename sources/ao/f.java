package ao;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d4.b1;
import d4.e2;
import d4.f2;
import d4.n1;
import h.g0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.h2;

/* loaded from: classes2.dex */
public final class f extends g0 {

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f2661f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f2662g;

    /* renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f2663h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f2664i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2665j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2666k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2667l;

    /* renamed from: m, reason: collision with root package name */
    public e f2668m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2669n;

    /* renamed from: o, reason: collision with root package name */
    public final hc.h f2670o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968713(0x7f040089, float:1.7546087E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132083420(0x7f1502dc, float:1.9806982E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f2665j = r0
            r3.f2666k = r0
            hc.h r4 = new hc.h
            r4.<init>(r3, r0)
            r3.f2670o = r4
            h.q r4 = r3.e()
            r4.g(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130969060(0x7f0401e4, float:1.7546791E38)
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r4 = r4.getBoolean(r5, r5)
            r3.f2669n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.f.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        i();
        super.cancel();
    }

    public final void h() {
        if (this.f2662g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f2662g = frameLayout;
            this.f2663h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f2662g.findViewById(R.id.design_bottom_sheet);
            this.f2664i = frameLayout2;
            BottomSheetBehavior w10 = BottomSheetBehavior.w(frameLayout2);
            this.f2661f = w10;
            hc.h hVar = this.f2670o;
            ArrayList arrayList = w10.W;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
            }
            this.f2661f.B(this.f2665j);
        }
    }

    public final BottomSheetBehavior i() {
        if (this.f2661f == null) {
            h();
        }
        return this.f2661f;
    }

    public final FrameLayout k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2662g.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f2669n) {
            FrameLayout frameLayout = this.f2664i;
            eb.f fVar = new eb.f(this, 4);
            WeakHashMap weakHashMap = n1.f13788a;
            b1.u(frameLayout, fVar);
        }
        this.f2664i.removeAllViews();
        if (layoutParams == null) {
            this.f2664i.addView(view);
        } else {
            this.f2664i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new h.b(this, 5));
        int i11 = 1;
        n1.n(this.f2664i, new x7.e(this, i11));
        this.f2664i.setOnTouchListener(new h2(this, i11));
        return this.f2662g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f2669n && Color.alpha(window.getNavigationBarColor()) < 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.f2662g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f2663h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            boolean z11 = !z10;
            if (Build.VERSION.SDK_INT >= 30) {
                f2.a(window, z11);
            } else {
                e2.a(window, z11);
            }
            e eVar = this.f2668m;
            if (eVar != null) {
                eVar.b(window);
            }
        }
    }

    @Override // h.g0, androidx.activity.o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        e eVar = this.f2668m;
        if (eVar != null) {
            eVar.b(null);
        }
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f2661f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 5) {
            bottomSheetBehavior.D(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f2665j != z10) {
            this.f2665j = z10;
            BottomSheetBehavior bottomSheetBehavior = this.f2661f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.B(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f2665j) {
            this.f2665j = true;
        }
        this.f2666k = z10;
        this.f2667l = true;
    }

    @Override // h.g0, androidx.activity.o, android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(k(null, i10, null));
    }

    @Override // h.g0, androidx.activity.o, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(k(view, 0, null));
    }

    @Override // h.g0, androidx.activity.o, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(k(view, 0, layoutParams));
    }
}

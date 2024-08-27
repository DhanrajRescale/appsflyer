package ao;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d4.n1;
import d4.v0;
import h.q0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2652a;

    /* renamed from: b, reason: collision with root package name */
    public int f2653b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2654c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f2655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o3.b f2656e;

    public d(SideSheetBehavior sideSheetBehavior) {
        this.f2652a = 1;
        this.f2656e = sideSheetBehavior;
        this.f2655d = new bl.d(this, 12);
    }

    public final void a(int i10) {
        int i11 = this.f2652a;
        Runnable runnable = this.f2655d;
        o3.b bVar = this.f2656e;
        switch (i11) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bVar;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f2653b = i10;
                    if (!this.f2654c) {
                        View view = (View) bottomSheetBehavior.U.get();
                        WeakHashMap weakHashMap = n1.f13788a;
                        v0.m(view, runnable);
                        this.f2654c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bVar;
                WeakReference weakReference2 = sideSheetBehavior.f11424o;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f2653b = i10;
                    if (!this.f2654c) {
                        View view2 = (View) sideSheetBehavior.f11424o.get();
                        WeakHashMap weakHashMap2 = n1.f13788a;
                        v0.m(view2, runnable);
                        this.f2654c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public d(BottomSheetBehavior bottomSheetBehavior) {
        this.f2652a = 0;
        this.f2656e = bottomSheetBehavior;
        this.f2655d = new q0(this, 23);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this(bottomSheetBehavior);
        this.f2652a = 0;
    }
}

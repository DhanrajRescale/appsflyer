package oo;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f30195g;

    public j(int i10) {
        this.f30195g = i10;
    }

    @Override // vl.b
    public final float E(Object obj) {
        int i10 = this.f30195g;
        switch (i10) {
            case 0:
                return ((k) obj).f30200o * 10000.0f;
            case 1:
                View view = (View) obj;
                switch (i10) {
                    case 1:
                        Intrinsics.e(view, "view");
                        return view.getX();
                    default:
                        Intrinsics.e(view, "view");
                        return view.getY();
                }
            default:
                View view2 = (View) obj;
                switch (i10) {
                    case 1:
                        Intrinsics.e(view2, "view");
                        return view2.getX();
                    default:
                        Intrinsics.e(view2, "view");
                        return view2.getY();
                }
        }
    }

    @Override // vl.b
    public final void m0(float f10, Object obj) {
        int i10 = this.f30195g;
        switch (i10) {
            case 0:
                k kVar = (k) obj;
                kVar.f30200o = f10 / 10000.0f;
                kVar.invalidateSelf();
                return;
            case 1:
                View view = (View) obj;
                switch (i10) {
                    case 1:
                        Intrinsics.e(view, "view");
                        view.setX(f10);
                        return;
                    default:
                        Intrinsics.e(view, "view");
                        view.setY(f10);
                        return;
                }
            default:
                View view2 = (View) obj;
                switch (i10) {
                    case 1:
                        Intrinsics.e(view2, "view");
                        view2.setX(f10);
                        return;
                    default:
                        Intrinsics.e(view2, "view");
                        view2.setY(f10);
                        return;
                }
        }
    }
}

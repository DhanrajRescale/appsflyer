package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import d4.d2;
import d4.n1;
import d4.z0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17747b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f17746a = i10;
        this.f17747b = obj;
    }

    @Override // d4.d2, d4.c2
    public final void b() {
        int i10 = this.f17746a;
        Object obj = this.f17747b;
        switch (i10) {
            case 0:
                ((r) obj).f17733b.f17653v.setVisibility(0);
                return;
            case 1:
                e0 e0Var = (e0) obj;
                e0Var.f17653v.setVisibility(0);
                if (e0Var.f17653v.getParent() instanceof View) {
                    View view = (View) e0Var.f17653v.getParent();
                    WeakHashMap weakHashMap = n1.f13788a;
                    z0.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // d4.c2
    public final void c() {
        int i10 = this.f17746a;
        Object obj = this.f17747b;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                rVar.f17733b.f17653v.setAlpha(1.0f);
                e0 e0Var = rVar.f17733b;
                e0Var.f17659y.d(null);
                e0Var.f17659y = null;
                return;
            case 1:
                e0 e0Var2 = (e0) obj;
                e0Var2.f17653v.setAlpha(1.0f);
                e0Var2.f17659y.d(null);
                e0Var2.f17659y = null;
                return;
            default:
                u uVar = (u) obj;
                uVar.f17753b.f17653v.setVisibility(8);
                e0 e0Var3 = uVar.f17753b;
                PopupWindow popupWindow = e0Var3.f17655w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (e0Var3.f17653v.getParent() instanceof View) {
                    View view = (View) e0Var3.f17653v.getParent();
                    WeakHashMap weakHashMap = n1.f13788a;
                    z0.c(view);
                }
                e0Var3.f17653v.e();
                e0Var3.f17659y.d(null);
                e0Var3.f17659y = null;
                ViewGroup viewGroup = e0Var3.B;
                WeakHashMap weakHashMap2 = n1.f13788a;
                z0.c(viewGroup);
                return;
        }
    }
}

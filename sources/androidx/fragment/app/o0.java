package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1784a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f1785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1786c;

    public o0(p0 p0Var, l1 l1Var) {
        this.f1786c = p0Var;
        this.f1785b = l1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f1784a;
        Object obj = this.f1786c;
        switch (i10) {
            case 0:
                l1 l1Var = this.f1785b;
                g0 g0Var = l1Var.f1754c;
                l1Var.k();
                n.l((ViewGroup) g0Var.mView.getParent(), ((p0) obj).f1797a).k();
                return;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = d4.n1.f13788a;
                d4.z0.c(view2);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public o0(l1 l1Var, View view) {
        this.f1785b = l1Var;
        this.f1786c = view;
    }
}

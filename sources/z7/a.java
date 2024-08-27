package z7;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.fragment.app.x0;

/* loaded from: classes.dex */
public final class a extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f42152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f42153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f42154c;

    public a(e eVar, g0 g0Var, FrameLayout frameLayout) {
        this.f42154c = eVar;
        this.f42152a = g0Var;
        this.f42153b = frameLayout;
    }

    @Override // androidx.fragment.app.x0
    public final void c(d1 d1Var, g0 g0Var, View view) {
        if (g0Var == this.f42152a) {
            d1Var.g0(this);
            this.f42154c.getClass();
            e.p(view, this.f42153b);
        }
    }
}

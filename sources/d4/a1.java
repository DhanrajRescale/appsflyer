package d4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public d3 f13717a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f13719c;

    public a1(View view, d0 d0Var) {
        this.f13718b = view;
        this.f13719c = d0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        d3 g10 = d3.g(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        d0 d0Var = this.f13719c;
        if (i10 < 30) {
            b1.a(windowInsets, this.f13718b);
            if (g10.equals(this.f13717a)) {
                return d0Var.g(view, g10).f();
            }
        }
        this.f13717a = g10;
        d3 g11 = d0Var.g(view, g10);
        if (i10 >= 30) {
            return g11.f();
        }
        WeakHashMap weakHashMap = n1.f13788a;
        z0.c(view);
        return g11.f();
    }
}

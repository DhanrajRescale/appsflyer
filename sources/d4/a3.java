package d4;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class a3 extends z2 {

    /* renamed from: q, reason: collision with root package name */
    public static final d3 f13720q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f13720q = d3.g(null, windowInsets);
    }

    public a3(@NonNull d3 d3Var, @NonNull WindowInsets windowInsets) {
        super(d3Var, windowInsets);
    }

    @Override // d4.v2, d4.b3
    public final void d(@NonNull View view) {
    }

    @Override // d4.v2, d4.b3
    @NonNull
    public u3.c f(int i10) {
        Insets insets;
        insets = this.f13855c.getInsets(c3.a(i10));
        return u3.c.c(insets);
    }

    @Override // d4.v2, d4.b3
    @NonNull
    public u3.c g(int i10) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f13855c.getInsetsIgnoringVisibility(c3.a(i10));
        return u3.c.c(insetsIgnoringVisibility);
    }

    @Override // d4.v2, d4.b3
    public boolean p(int i10) {
        boolean isVisible;
        isVisible = this.f13855c.isVisible(c3.a(i10));
        return isVisible;
    }
}

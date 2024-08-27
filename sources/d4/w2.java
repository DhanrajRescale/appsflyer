package d4;

import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class w2 extends v2 {

    /* renamed from: m, reason: collision with root package name */
    public u3.c f13861m;

    public w2(@NonNull d3 d3Var, @NonNull WindowInsets windowInsets) {
        super(d3Var, windowInsets);
        this.f13861m = null;
    }

    @Override // d4.b3
    @NonNull
    public d3 b() {
        return d3.g(null, this.f13855c.consumeStableInsets());
    }

    @Override // d4.b3
    @NonNull
    public d3 c() {
        return d3.g(null, this.f13855c.consumeSystemWindowInsets());
    }

    @Override // d4.b3
    @NonNull
    public final u3.c i() {
        if (this.f13861m == null) {
            WindowInsets windowInsets = this.f13855c;
            this.f13861m = u3.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f13861m;
    }

    @Override // d4.b3
    public boolean n() {
        return this.f13855c.isConsumed();
    }

    @Override // d4.b3
    public void s(u3.c cVar) {
        this.f13861m = cVar;
    }
}

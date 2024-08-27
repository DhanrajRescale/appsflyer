package d4;

import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class z2 extends x2 {

    /* renamed from: n, reason: collision with root package name */
    public u3.c f13874n;

    /* renamed from: o, reason: collision with root package name */
    public u3.c f13875o;

    /* renamed from: p, reason: collision with root package name */
    public u3.c f13876p;

    public z2(@NonNull d3 d3Var, @NonNull WindowInsets windowInsets) {
        super(d3Var, windowInsets);
        this.f13874n = null;
        this.f13875o = null;
        this.f13876p = null;
    }

    @Override // d4.b3
    @NonNull
    public u3.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f13875o == null) {
            mandatorySystemGestureInsets = this.f13855c.getMandatorySystemGestureInsets();
            this.f13875o = u3.c.c(mandatorySystemGestureInsets);
        }
        return this.f13875o;
    }

    @Override // d4.b3
    @NonNull
    public u3.c j() {
        Insets systemGestureInsets;
        if (this.f13874n == null) {
            systemGestureInsets = this.f13855c.getSystemGestureInsets();
            this.f13874n = u3.c.c(systemGestureInsets);
        }
        return this.f13874n;
    }

    @Override // d4.b3
    @NonNull
    public u3.c l() {
        Insets tappableElementInsets;
        if (this.f13876p == null) {
            tappableElementInsets = this.f13855c.getTappableElementInsets();
            this.f13876p = u3.c.c(tappableElementInsets);
        }
        return this.f13876p;
    }

    @Override // d4.v2, d4.b3
    @NonNull
    public d3 m(int i10, int i11, int i12, int i13) {
        WindowInsets inset;
        inset = this.f13855c.inset(i10, i11, i12, i13);
        return d3.g(null, inset);
    }

    @Override // d4.w2, d4.b3
    public void s(u3.c cVar) {
    }
}

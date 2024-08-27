package d4;

import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class s2 extends u2 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f13822c;

    public s2() {
        this.f13822c = a4.b.b();
    }

    @Override // d4.u2
    @NonNull
    public d3 b() {
        WindowInsets build;
        a();
        build = this.f13822c.build();
        d3 g10 = d3.g(null, build);
        g10.f13731a.q(this.f13843b);
        return g10;
    }

    @Override // d4.u2
    public void d(@NonNull u3.c cVar) {
        this.f13822c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // d4.u2
    public void e(@NonNull u3.c cVar) {
        this.f13822c.setStableInsets(cVar.d());
    }

    @Override // d4.u2
    public void f(@NonNull u3.c cVar) {
        this.f13822c.setSystemGestureInsets(cVar.d());
    }

    @Override // d4.u2
    public void g(@NonNull u3.c cVar) {
        this.f13822c.setSystemWindowInsets(cVar.d());
    }

    @Override // d4.u2
    public void h(@NonNull u3.c cVar) {
        this.f13822c.setTappableElementInsets(cVar.d());
    }

    public s2(@NonNull d3 d3Var) {
        super(d3Var);
        WindowInsets.Builder b10;
        WindowInsets f10 = d3Var.f();
        if (f10 != null) {
            b10 = d2.t2.g(f10);
        } else {
            b10 = a4.b.b();
        }
        this.f13822c = b10;
    }
}

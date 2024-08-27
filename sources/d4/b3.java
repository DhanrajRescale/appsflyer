package d4;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class b3 {

    /* renamed from: b, reason: collision with root package name */
    public static final d3 f13722b = new e.l(13).K().f13731a.a().f13731a.b().f13731a.c();

    /* renamed from: a, reason: collision with root package name */
    public final d3 f13723a;

    public b3(@NonNull d3 d3Var) {
        this.f13723a = d3Var;
    }

    @NonNull
    public d3 a() {
        return this.f13723a;
    }

    @NonNull
    public d3 b() {
        return this.f13723a;
    }

    @NonNull
    public d3 c() {
        return this.f13723a;
    }

    public void d(@NonNull View view) {
    }

    public m e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        if (o() == b3Var.o() && n() == b3Var.n() && c4.c.a(k(), b3Var.k()) && c4.c.a(i(), b3Var.i()) && c4.c.a(e(), b3Var.e())) {
            return true;
        }
        return false;
    }

    @NonNull
    public u3.c f(int i10) {
        return u3.c.f36703e;
    }

    @NonNull
    public u3.c g(int i10) {
        if ((i10 & 8) == 0) {
            return u3.c.f36703e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    @NonNull
    public u3.c h() {
        return k();
    }

    public int hashCode() {
        return c4.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    @NonNull
    public u3.c i() {
        return u3.c.f36703e;
    }

    @NonNull
    public u3.c j() {
        return k();
    }

    @NonNull
    public u3.c k() {
        return u3.c.f36703e;
    }

    @NonNull
    public u3.c l() {
        return k();
    }

    @NonNull
    public d3 m(int i10, int i11, int i12, int i13) {
        return f13722b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void q(u3.c[] cVarArr) {
    }

    public void r(d3 d3Var) {
    }

    public void s(u3.c cVar) {
    }
}

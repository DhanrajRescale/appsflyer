package nv;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class i0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final String f29217b;

    /* renamed from: c, reason: collision with root package name */
    public final o f29218c;

    public i0(String str) {
        d dVar = d.f29195a;
        Objects.requireNonNull(str, "name == null");
        this.f29217b = str;
        this.f29218c = dVar;
    }

    @Override // bl.j
    public final void k(s0 s0Var, Object obj) {
        String str;
        if (obj == null || (str = (String) this.f29218c.e(obj)) == null) {
            return;
        }
        s0Var.a(this.f29217b, str);
    }
}

package jn;

import java.util.Set;

/* loaded from: classes2.dex */
public final class o implements gn.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f21513a;

    /* renamed from: b, reason: collision with root package name */
    public final i f21514b;

    /* renamed from: c, reason: collision with root package name */
    public final q f21515c;

    public o(Set set, i iVar, q qVar) {
        this.f21513a = set;
        this.f21514b = iVar;
        this.f21515c = qVar;
    }

    public final p a(String str, gn.b bVar, gn.d dVar) {
        Set set = this.f21513a;
        if (set.contains(bVar)) {
            return new p(this.f21514b, str, bVar, dVar, this.f21515c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }
}

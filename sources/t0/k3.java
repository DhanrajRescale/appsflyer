package t0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k3 implements Iterable, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f35076a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35077b;

    /* renamed from: c, reason: collision with root package name */
    public final t f35078c;

    public k3(o2 o2Var, int i10, s0 s0Var, e eVar) {
        this.f35076a = o2Var;
        this.f35077b = i10;
        this.f35078c = eVar;
        s0Var.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j3(this.f35076a, this.f35077b, null, this.f35078c);
    }
}

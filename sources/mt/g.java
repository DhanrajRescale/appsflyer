package mt;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g implements ht.a {

    /* renamed from: a, reason: collision with root package name */
    public final at.g f28011a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f28012b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f28013c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28014d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28015e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28016f;

    public g(at.g gVar, Iterator it) {
        this.f28011a = gVar;
        this.f28012b = it;
    }

    @Override // ct.b
    public final void a() {
        this.f28013c = true;
    }

    @Override // ht.c
    public final void clear() {
        this.f28015e = true;
    }

    @Override // ht.b
    public final int d() {
        this.f28014d = true;
        return 1;
    }

    @Override // ht.c
    public final Object i() {
        if (this.f28015e) {
            return null;
        }
        boolean z10 = this.f28016f;
        Iterator it = this.f28012b;
        if (z10) {
            if (!it.hasNext()) {
                this.f28015e = true;
                return null;
            }
        } else {
            this.f28016f = true;
        }
        Object next = it.next();
        gt.e.a(next, "The iterator returned a null value");
        return next;
    }

    @Override // ht.c
    public final boolean isEmpty() {
        return this.f28015e;
    }

    @Override // ht.c
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }
}

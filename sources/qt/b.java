package qt;

import at.d;

/* loaded from: classes2.dex */
public final class b extends a {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: a, reason: collision with root package name */
    public final d f32173a;

    /* renamed from: b, reason: collision with root package name */
    public Object f32174b;

    public b(d dVar) {
        this.f32173a = dVar;
    }

    @Override // gv.a
    public final void cancel() {
        set(4);
        this.f32174b = null;
    }

    @Override // ht.c
    public final void clear() {
        lazySet(32);
        this.f32174b = null;
    }

    @Override // ht.c
    public final Object i() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f32174b;
        this.f32174b = null;
        return obj;
    }

    @Override // ht.c
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // gv.a
    public final void request() {
        Object obj;
        do {
            int i10 = get();
            if ((i10 & (-2)) != 0) {
                return;
            }
            if (i10 == 1) {
                if (compareAndSet(1, 3) && (obj = this.f32174b) != null) {
                    this.f32174b = null;
                    d dVar = this.f32173a;
                    dVar.b(obj);
                    if (get() != 4) {
                        dVar.onComplete();
                        return;
                    }
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }
}

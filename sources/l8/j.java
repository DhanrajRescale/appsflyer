package l8;

/* loaded from: classes.dex */
public final class j extends h {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = h.f24226g;
        }
        if (h.f24225f.s(this, null, obj)) {
            h.c(this);
            return true;
        }
        return false;
    }

    public final boolean k(Throwable th2) {
        th2.getClass();
        if (h.f24225f.s(this, null, new b(th2))) {
            h.c(this);
            return true;
        }
        return false;
    }

    public final boolean l(op.a aVar) {
        b bVar;
        aVar.getClass();
        Object obj = this.f24227a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!h.f24225f.s(this, null, h.f(aVar))) {
                    return false;
                }
                h.c(this);
            } else {
                e eVar = new e(this, aVar);
                if (h.f24225f.s(this, null, eVar)) {
                    try {
                        aVar.a(eVar, i.f24230a);
                    } catch (Throwable th2) {
                        try {
                            bVar = new b(th2);
                        } catch (Throwable unused) {
                            bVar = b.f24207b;
                        }
                        h.f24225f.s(this, eVar, bVar);
                    }
                } else {
                    obj = this.f24227a;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        aVar.cancel(((a) obj).f24205a);
        return false;
    }
}

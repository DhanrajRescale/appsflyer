package l8;

/* loaded from: classes.dex */
public final class f extends bl.j {
    @Override // bl.j
    public final void U(g gVar, g gVar2) {
        gVar.f24222b = gVar2;
    }

    @Override // bl.j
    public final void W(g gVar, Thread thread) {
        gVar.f24221a = thread;
    }

    @Override // bl.j
    public final boolean q(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f24228b == cVar) {
                    hVar.f24228b = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bl.j
    public final boolean s(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f24227a == obj) {
                    hVar.f24227a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bl.j
    public final boolean u(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f24229c == gVar) {
                    hVar.f24229c = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

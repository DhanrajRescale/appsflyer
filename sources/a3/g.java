package a3;

/* loaded from: classes.dex */
public final class g extends bl.j {
    @Override // bl.j
    public final void T(h hVar, h hVar2) {
        hVar.f151b = hVar2;
    }

    @Override // bl.j
    public final void V(h hVar, Thread thread) {
        hVar.f150a = thread;
    }

    @Override // bl.j
    public final boolean p(i iVar, e eVar, e eVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f157b == eVar) {
                    iVar.f157b = eVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bl.j
    public final boolean r(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f156a == obj) {
                    iVar.f156a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bl.j
    public final boolean t(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f158c == hVar) {
                    iVar.f158c = hVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

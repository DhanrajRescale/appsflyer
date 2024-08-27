package at;

/* loaded from: classes2.dex */
public abstract class m<T> implements o {
    public final void a(n nVar) {
        if (nVar != null) {
            try {
                b(nVar);
                return;
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th2) {
                zq.f.l0(th2);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th2);
                throw nullPointerException;
            }
        }
        throw new NullPointerException("observer is null");
    }

    public abstract void b(n nVar);

    public final nt.h c(l lVar) {
        if (lVar != null) {
            return new nt.h(this, lVar, 1);
        }
        throw new NullPointerException("scheduler is null");
    }
}

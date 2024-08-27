package at;

/* loaded from: classes2.dex */
public abstract class a {
    public final void a(b bVar) {
        if (bVar != null) {
            try {
                b(bVar);
                return;
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th2) {
                zq.f.l0(th2);
                yk.g.M(th2);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th2);
                throw nullPointerException;
            }
        }
        throw new NullPointerException("observer is null");
    }

    public abstract void b(b bVar);
}

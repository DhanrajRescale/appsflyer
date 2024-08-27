package at;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2779a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public final void a(d dVar) {
        try {
            b(dVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            zq.f.l0(th2);
            yk.g.M(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void b(d dVar);
}

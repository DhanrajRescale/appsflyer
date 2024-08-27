package w;

/* loaded from: classes.dex */
public interface j {
    boolean a();

    long b();

    y1 c();

    t d(long j10);

    default boolean e(long j10) {
        if (j10 >= b()) {
            return true;
        }
        return false;
    }

    Object f(long j10);

    Object g();
}

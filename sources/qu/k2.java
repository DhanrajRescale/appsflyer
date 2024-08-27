package qu;

/* loaded from: classes2.dex */
public abstract class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f32232a = new ThreadLocal();

    public static b1 a() {
        ThreadLocal threadLocal = f32232a;
        b1 b1Var = (b1) threadLocal.get();
        if (b1Var == null) {
            e eVar = new e(Thread.currentThread());
            threadLocal.set(eVar);
            return eVar;
        }
        return b1Var;
    }
}

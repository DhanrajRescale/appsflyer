package qu;

/* loaded from: classes2.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f32230a;

    static {
        String str;
        n0 n0Var;
        int i10 = vu.b0.f38357a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null && Boolean.parseBoolean(str)) {
            xu.e eVar = r0.f32255a;
            kotlin.coroutines.f fVar = vu.u.f38408a;
            ru.d dVar = ((ru.d) fVar).f34006f;
            if (!(fVar instanceof n0)) {
                n0Var = j0.f32226j;
            } else {
                n0Var = (n0) fVar;
            }
        } else {
            n0Var = j0.f32226j;
        }
        f32230a = n0Var;
    }
}

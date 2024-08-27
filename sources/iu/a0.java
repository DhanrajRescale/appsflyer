package iu;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f20536a;

    static {
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b0Var == null) {
            b0Var = new b0();
        }
        f20536a = b0Var;
    }

    public static e a(Class cls) {
        f20536a.getClass();
        return new e(cls);
    }
}

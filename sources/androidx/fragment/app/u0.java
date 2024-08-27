package androidx.fragment.app;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t.j0 f1841b = new t.j0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f1842a;

    public u0(d1 d1Var) {
        this.f1842a = d1Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        t.j0 j0Var = f1841b;
        t.j0 j0Var2 = (t.j0) j0Var.get(classLoader);
        if (j0Var2 == null) {
            j0Var2 = new t.j0();
            j0Var.put(classLoader, j0Var2);
        }
        Class cls = (Class) j0Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            j0Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new RuntimeException(nn.d.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(nn.d.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final g0 a(String str) {
        return g0.instantiate(this.f1842a.f1665v.f1775b, str, null);
    }
}

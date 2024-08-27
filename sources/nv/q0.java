package nv;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class q0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f29240c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29241a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f29242b;

    static {
        q0 q0Var;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            q0Var = new q0();
        } else {
            q0Var = new q0();
        }
        f29240c = q0Var;
    }

    public q0() {
        Constructor constructor = null;
        try {
            constructor = n1.z.f().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.f29242b = constructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Class cls, Object obj, Method method, Object... objArr) {
        MethodHandles.Lookup lookup;
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = this.f29242b;
        if (constructor == null) {
            lookup = MethodHandles.lookup();
        } else {
            lookup = n1.z.k(constructor.newInstance(cls, -1));
        }
        unreflectSpecial = lookup.unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }
}

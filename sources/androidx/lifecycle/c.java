package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f1890c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1891a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1892b = new HashMap();

    public static void c(HashMap hashMap, b bVar, m mVar, Class cls) {
        m mVar2 = (m) hashMap.get(bVar);
        if (mVar2 != null && mVar != mVar2) {
            throw new IllegalArgumentException("Method " + bVar.f1880b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + mVar2 + ", new value " + mVar);
        }
        if (mVar2 == null) {
            hashMap.put(bVar, mVar);
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1875b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f1875b.entrySet()) {
                c(hashMap, (b) entry.getKey(), (m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            g0 g0Var = (g0) method.getAnnotation(g0.class);
            if (g0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (t.class.isAssignableFrom(parameterTypes[0])) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                m value = g0Var.value();
                if (parameterTypes.length > 1) {
                    if (m.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == m.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(method, i10), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f1891a.put(cls, aVar);
        this.f1892b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final a b(Class cls) {
        a aVar = (a) this.f1891a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }
}

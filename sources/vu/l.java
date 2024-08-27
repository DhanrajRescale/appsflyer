package vu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38387a = b(-1, Throwable.class);

    static {
        try {
            int i10 = m.f38388a;
            i0 i0Var = i0.f38383b;
        } catch (Throwable unused) {
            i0 i0Var2 = i0.f38383b;
        }
    }

    public static final Function1 a(Class cls) {
        Object obj;
        Function1 function1;
        Pair pair;
        k kVar = k.f38386a;
        if (f38387a == b(0, cls)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                obj = null;
                if (i10 >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i10];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                int i11 = 27;
                if (length2 != 0) {
                    if (length2 != 1) {
                        if (length2 != 2) {
                            pair = new Pair(null, -1);
                        } else if (Intrinsics.a(parameterTypes[0], String.class) && Intrinsics.a(parameterTypes[1], Throwable.class)) {
                            pair = new Pair(new v.c0(i11, new j(constructor, 0)), 3);
                        } else {
                            pair = new Pair(null, -1);
                        }
                    } else {
                        Class<?> cls2 = parameterTypes[0];
                        if (Intrinsics.a(cls2, String.class)) {
                            pair = new Pair(new v.c0(i11, new j(constructor, 1)), 2);
                        } else if (Intrinsics.a(cls2, Throwable.class)) {
                            pair = new Pair(new v.c0(i11, new j(constructor, 2)), 1);
                        } else {
                            pair = new Pair(null, -1);
                        }
                    }
                } else {
                    pair = new Pair(new v.c0(i11, new j(constructor, 3)), 0);
                }
                arrayList.add(pair);
                i10++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((Pair) obj).f23354b).intValue();
                    do {
                        Object next = it.next();
                        int intValue2 = ((Number) ((Pair) next).f23354b).intValue();
                        if (intValue < intValue2) {
                            obj = next;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair2 = (Pair) obj;
            if (pair2 != null && (function1 = (Function1) pair2.f23353a) != null) {
                return function1;
            }
            return kVar;
        }
        return kVar;
    }

    public static final int b(int i10, Class cls) {
        Object a10;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        iu.a0.a(cls);
        try {
            l.Companion companion = ut.l.INSTANCE;
            int i11 = 0;
            do {
                int length = cls.getDeclaredFields().length;
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    if (!Modifier.isStatic(r2[i13].getModifiers())) {
                        i12++;
                    }
                }
                i11 += i12;
                cls = cls.getSuperclass();
            } while (cls != null);
            a10 = Integer.valueOf(i11);
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        Object valueOf = Integer.valueOf(i10);
        l.Companion companion3 = ut.l.INSTANCE;
        if (a10 instanceof ut.m) {
            a10 = valueOf;
        }
        return ((Number) a10).intValue();
    }
}

package qv;

import ek.u;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile u[] f32311a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f32312b;

    static {
        new ArrayList();
        f32311a = new u[0];
        f32312b = new u(23);
    }

    public static void a(Object... objArr) {
        f32312b.getClass();
        u.k(objArr);
    }

    public static u b(String str) {
        for (u uVar : f32311a) {
            ((ThreadLocal) uVar.f15627b).set(str);
        }
        return f32312b;
    }
}

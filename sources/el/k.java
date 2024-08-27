package el;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static k f15688g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f15689h = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final Class f15690a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f15691b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f15692c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f15693d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f15694e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f15695f;

    public k(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.f15690a = skuDetailsParamsClazz;
        this.f15691b = builderClazz;
        this.f15692c = newBuilderMethod;
        this.f15693d = setTypeMethod;
        this.f15694e = setSkusListMethod;
        this.f15695f = buildMethod;
    }

    public final Object a(ArrayList arrayList) {
        Object n0;
        Object n02;
        Class cls = this.f15691b;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Object n03 = l.n0(this.f15690a, null, this.f15692c, new Object[0]);
            if (n03 != null && (n0 = l.n0(cls, n03, this.f15693d, "inapp")) != null && (n02 = l.n0(cls, n0, this.f15694e, arrayList)) != null) {
                return l.n0(cls, n02, this.f15695f, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }
}

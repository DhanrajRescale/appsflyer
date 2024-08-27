package androidx.navigation;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements ut.g {

    /* renamed from: a, reason: collision with root package name */
    public final ou.b f2212a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f2213b;

    /* renamed from: c, reason: collision with root package name */
    public h f2214c;

    public i(iu.e navArgsClass, Function0 argumentProducer) {
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        this.f2212a = navArgsClass;
        this.f2213b = argumentProducer;
    }

    @Override // ut.g
    public final Object getValue() {
        h hVar = this.f2214c;
        if (hVar == null) {
            Bundle bundle = (Bundle) this.f2213b.mo2invoke();
            t.f fVar = j.f2219b;
            ou.b bVar = this.f2212a;
            Method method = (Method) fVar.get(bVar);
            if (method == null) {
                method = yk.g.y(bVar).getMethod("fromBundle", (Class[]) Arrays.copyOf(j.f2218a, 1));
                fVar.put(bVar, method);
                Intrinsics.checkNotNullExpressionValue(method, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke = method.invoke(null, bundle);
            Intrinsics.d(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
            h hVar2 = (h) invoke;
            this.f2214c = hVar2;
            return hVar2;
        }
        return hVar;
    }
}

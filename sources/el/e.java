package el;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;

/* loaded from: classes.dex */
public final class e implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15648a;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method m10, Object[] objArr) {
        switch (this.f15648a) {
            case 0:
                if (!sl.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(m10, "m");
                        if (Intrinsics.a(m10.getName(), "onBillingSetupFinished")) {
                            ek.h hVar = g.f15652s;
                            ek.h.y().set(true);
                        } else {
                            String name = m10.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "m.name");
                            if (s.i(name, "onBillingServiceDisconnected", false)) {
                                ek.h hVar2 = g.f15652s;
                                ek.h.y().set(false);
                            }
                        }
                    } catch (Throwable th2) {
                        sl.a.a(this, th2);
                    }
                }
                return null;
            default:
                if (!sl.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(m10, "m");
                    } catch (Throwable th3) {
                        sl.a.a(this, th3);
                    }
                }
                return null;
        }
    }
}

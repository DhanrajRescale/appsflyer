package m;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public Method f25517a;

    /* renamed from: b, reason: collision with root package name */
    public Method f25518b;

    /* renamed from: c, reason: collision with root package name */
    public Method f25519c;

    public e3(Method method, Method method2, Method method3) {
        this.f25517a = method;
        this.f25518b = method2;
        this.f25519c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}

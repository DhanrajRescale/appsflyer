package cu;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu/a;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f13076a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Method f13077b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, cu.a] */
    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        Intrinsics.c(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            Class<?> cls = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (Intrinsics.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                }
                if (Intrinsics.a(cls, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f13077b = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !Intrinsics.a(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}

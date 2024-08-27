package nv;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Method f29300a;

    /* renamed from: b, reason: collision with root package name */
    public final List f29301b;

    public v(Method method, ArrayList arrayList) {
        this.f29300a = method;
        this.f29301b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f29300a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f29301b);
    }
}

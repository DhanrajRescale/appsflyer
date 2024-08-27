package nv;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class p0 extends q0 {
    @Override // nv.q0
    public final Executor a() {
        return new y3.i(2);
    }

    @Override // nv.q0
    public final Object b(Class cls, Object obj, Method method, Object... objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.b(cls, obj, method, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }
}

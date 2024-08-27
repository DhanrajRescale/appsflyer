package gl;

import android.util.Log;
import com.assetgro.stockgro.data.remote.NetworkService;
import iu.z;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import nv.c0;
import nv.q0;
import nv.u;
import nv.x0;

/* loaded from: classes.dex */
public final class j implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17472a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17473b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f17474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f17475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17476e;

    public j(Object obj, z zVar, ReentrantLock reentrantLock, Condition condition) {
        this.f17472a = 0;
        this.f17473b = obj;
        this.f17474c = zVar;
        this.f17475d = reentrantLock;
        this.f17476e = condition;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objects) {
        int i10 = this.f17472a;
        Object obj2 = this.f17476e;
        Serializable serializable = this.f17475d;
        Object obj3 = this.f17473b;
        Object obj4 = this.f17474c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(objects, "objects");
                try {
                    if (Intrinsics.a(method.getName(), "onChecksumsReady") && objects.length == 1) {
                        Object obj5 = objects[0];
                        if (obj5 instanceof List) {
                            for (Object obj6 : (List) obj5) {
                                if (obj6 != null) {
                                    Method method2 = obj6.getClass().getMethod("getSplitName", new Class[0]);
                                    Intrinsics.checkNotNullExpressionValue(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                    Method method3 = obj6.getClass().getMethod("getType", new Class[0]);
                                    Intrinsics.checkNotNullExpressionValue(method3, "c.javaClass.getMethod(\"getType\")");
                                    if (method2.invoke(obj6, new Object[0]) == null && Intrinsics.a(method3.invoke(obj6, new Object[0]), obj3)) {
                                        Method method4 = obj6.getClass().getMethod("getValue", new Class[0]);
                                        Intrinsics.checkNotNullExpressionValue(method4, "c.javaClass.getMethod(\"getValue\")");
                                        Object invoke = method4.invoke(obj6, new Object[0]);
                                        if (invoke != null) {
                                            ((z) obj4).f20560a = new BigInteger(1, (byte[]) invoke).toString(16);
                                            ((ReentrantLock) serializable).lock();
                                            try {
                                                ((Condition) obj2).signalAll();
                                                ((ReentrantLock) serializable).unlock();
                                                return null;
                                            } catch (Throwable th2) {
                                                ((ReentrantLock) serializable).unlock();
                                                throw th2;
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                    }
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th3) {
                    Log.d("k", "Can't fetch checksum.", th3);
                    return null;
                }
            default:
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objects);
                }
                if (objects == null) {
                    objects = (Object[]) obj4;
                }
                q0 q0Var = (q0) obj3;
                if (q0Var.f29241a && method.isDefault()) {
                    return q0Var.b((Class) serializable, obj, method, objects);
                }
                u uVar = (u) ((x0) obj2).c(method);
                return uVar.b(new c0(uVar.f29286a, objects, uVar.f29287b, uVar.f29288c), objects);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[], java.io.Serializable] */
    public j(x0 x0Var) {
        this.f17472a = 1;
        this.f17476e = x0Var;
        this.f17475d = NetworkService.class;
        this.f17473b = q0.f29240c;
        this.f17474c = new Object[0];
    }
}

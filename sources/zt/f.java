package zt;

import au.g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static yt.a a(Object obj, yt.a completion, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof au.a) {
            return ((au.a) function2).create(obj, completion);
        }
        CoroutineContext context = completion.getContext();
        if (context == k.f23369a) {
            return new b(obj, completion, function2);
        }
        return new c(completion, context, function2, obj);
    }

    public static yt.a b(yt.a aVar) {
        au.c cVar;
        yt.a<Object> intercepted;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof au.c) {
            cVar = (au.c) aVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (intercepted = cVar.intercepted()) != null) {
            return intercepted;
        }
        return aVar;
    }

    public static Object c(Object obj, yt.a completion, Function2 function2) {
        Object cVar;
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        if (context == k.f23369a) {
            cVar = new g(completion);
        } else {
            cVar = new au.c(completion, context);
        }
        zq.f.z(2, function2);
        return function2.invoke(obj, cVar);
    }
}

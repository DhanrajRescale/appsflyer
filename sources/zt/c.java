package zt;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ut.n;

/* loaded from: classes2.dex */
public final class c extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public int f42830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f42831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yt.a aVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
        super(aVar, coroutineContext);
        this.f42831b = function2;
        this.f42832c = obj;
        Intrinsics.d(aVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f42830a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f42830a = 2;
                n.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f42830a = 1;
        n.b(obj);
        Function2 function2 = this.f42831b;
        Intrinsics.d(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        zq.f.z(2, function2);
        return function2.invoke(this.f42832c, this);
    }
}

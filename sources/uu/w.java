package uu;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends au.c implements tu.g {

    /* renamed from: a, reason: collision with root package name */
    public final tu.g f37467a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f37468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37469c;

    /* renamed from: d, reason: collision with root package name */
    public CoroutineContext f37470d;

    /* renamed from: e, reason: collision with root package name */
    public yt.a f37471e;

    public w(tu.g gVar, CoroutineContext coroutineContext) {
        super(s.f37462a, kotlin.coroutines.k.f23369a);
        this.f37467a = gVar;
        this.f37468b = coroutineContext;
        this.f37469c = ((Number) coroutineContext.R(0, v.f37466a)).intValue();
    }

    @Override // tu.g
    public final Object a(Object obj, yt.a frame) {
        try {
            Object i10 = i(frame, obj);
            zt.a aVar = zt.a.f42823a;
            if (i10 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (i10 == aVar) {
                return i10;
            }
            return Unit.f23355a;
        } catch (Throwable th2) {
            this.f37470d = new q(frame.getContext(), th2);
            throw th2;
        }
    }

    @Override // au.a, au.d
    public final au.d getCallerFrame() {
        yt.a aVar = this.f37471e;
        if (aVar instanceof au.d) {
            return (au.d) aVar;
        }
        return null;
    }

    @Override // au.c, yt.a
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f37470d;
        return coroutineContext == null ? kotlin.coroutines.k.f23369a : coroutineContext;
    }

    @Override // au.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object i(yt.a aVar, Object obj) {
        CoroutineContext context = aVar.getContext();
        hl.f.W(context);
        CoroutineContext coroutineContext = this.f37470d;
        if (coroutineContext != context) {
            if (!(coroutineContext instanceof q)) {
                if (((Number) context.R(0, new z(this))).intValue() == this.f37469c) {
                    this.f37470d = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f37468b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(kotlin.text.l.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) coroutineContext).f37460a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f37471e = aVar;
        hu.c cVar = y.f37473a;
        tu.g gVar = this.f37467a;
        Intrinsics.d(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b10 = cVar.b(gVar, obj, this);
        if (!Intrinsics.a(b10, zt.a.f42823a)) {
            this.f37471e = null;
        }
        return b10;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = ut.l.a(obj);
        if (a10 != null) {
            this.f37470d = new q(getContext(), a10);
        }
        yt.a aVar = this.f37471e;
        if (aVar != null) {
            aVar.resumeWith(obj);
        }
        return zt.a.f42823a;
    }

    @Override // au.c, au.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}

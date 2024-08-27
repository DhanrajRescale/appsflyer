package id;

import c0.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f19849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, yt.a aVar) {
        super(2, aVar);
        this.f19849b = gVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f19849b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19848a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            m0 m0Var = this.f19849b.f19857i;
            if (m0Var != null) {
                this.f19848a = 1;
                if (m0.i(m0Var, 0, this) == aVar) {
                    return aVar;
                }
            } else {
                Intrinsics.k("scrollState");
                throw null;
            }
        }
        return Unit.f23355a;
    }
}

package uu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes2.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37421a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tu.g f37423c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f37424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yt.a aVar, tu.g gVar, f fVar) {
        super(2, aVar);
        this.f37423c = gVar;
        this.f37424d = fVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        d dVar = new d(aVar, this.f37423c, this.f37424d);
        dVar.f37422b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f37421a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            su.o k10 = this.f37424d.k((f0) this.f37422b);
            this.f37421a = 1;
            Object O = el.l.O(this.f37423c, k10, true, this);
            if (O != obj2) {
                O = Unit.f23355a;
            }
            if (O == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}

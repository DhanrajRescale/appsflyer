package androidx.work;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public p f2572a;

    /* renamed from: b, reason: collision with root package name */
    public int f2573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f2574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f2575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, CoroutineWorker coroutineWorker, yt.a aVar) {
        super(2, aVar);
        this.f2574c = pVar;
        this.f2575d = coroutineWorker;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f2574c, this.f2575d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f2573b;
        if (i10 != 0) {
            if (i10 == 1) {
                pVar = this.f2572a;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            p pVar2 = this.f2574c;
            this.f2572a = pVar2;
            this.f2573b = 1;
            Object foregroundInfo = this.f2575d.getForegroundInfo(this);
            if (foregroundInfo == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = foregroundInfo;
        }
        pVar.f2633a.j(obj);
        return Unit.f23355a;
    }
}

package y2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f41078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f41080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f41081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z10, k kVar, long j10, yt.a aVar) {
        super(2, aVar);
        this.f41079b = z10;
        this.f41080c = kVar;
        this.f41081d = j10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f41079b, this.f41080c, this.f41081d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f41078a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            boolean z10 = this.f41079b;
            k kVar = this.f41080c;
            if (!z10) {
                w1.d dVar = kVar.f41092a;
                int i11 = w2.o.f38809c;
                long j10 = w2.o.f38808b;
                long j11 = this.f41081d;
                this.f41078a = 1;
                if (dVar.a(j10, j11, this) == aVar) {
                    return aVar;
                }
            } else {
                w1.d dVar2 = kVar.f41092a;
                long j12 = this.f41081d;
                int i12 = w2.o.f38809c;
                long j13 = w2.o.f38808b;
                this.f41078a = 2;
                if (dVar2.a(j12, j13, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}

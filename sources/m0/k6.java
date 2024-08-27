package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k6 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f26414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w.n f26416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(w.d dVar, boolean z10, w.n nVar, yt.a aVar) {
        super(2, aVar);
        this.f26414b = dVar;
        this.f26415c = z10;
        this.f26416d = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k6(this.f26414b, this.f26415c, this.f26416d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k6) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26413a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            if (this.f26415c) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            Float f11 = new Float(f10);
            this.f26413a = 1;
            if (w.d.c(this.f26414b, f11, this.f26416d, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}

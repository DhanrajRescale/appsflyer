package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j6 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f26338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26339c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w.n f26340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f26341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(w.d dVar, boolean z10, w.n nVar, Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f26338b = dVar;
        this.f26339c = z10;
        this.f26340d = nVar;
        this.f26341e = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j6(this.f26338b, this.f26339c, this.f26340d, this.f26341e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j6) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26337a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            if (this.f26339c) {
                f10 = 1.0f;
            } else {
                f10 = s0.g.f34069a;
            }
            Float f11 = new Float(f10);
            this.f26337a = 1;
            if (w.d.c(this.f26338b, f11, this.f26340d, this) == aVar) {
                return aVar;
            }
        }
        this.f26341e.mo2invoke();
        return Unit.f23355a;
    }
}

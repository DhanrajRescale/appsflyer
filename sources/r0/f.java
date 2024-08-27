package r0;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f32390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f32392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function2 function2, Object obj, qu.f0 f0Var, yt.a aVar) {
        super(2, aVar);
        this.f32390b = function2;
        this.f32391c = obj;
        this.f32392d = f0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f32390b, this.f32391c, this.f32392d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32389a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f32389a = 1;
            if (this.f32390b.invoke(this.f32391c, this) == aVar) {
                return aVar;
            }
        }
        hl.f.A(this.f32392d, new CancellationException());
        return Unit.f23355a;
    }
}

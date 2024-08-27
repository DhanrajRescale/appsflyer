package x4;

import au.i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import t0.e3;
import t0.t1;
import tu.f;
import ut.n;
import yk.g;

/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f39954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f39955c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f39956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CoroutineContext coroutineContext, f fVar, t1 t1Var, yt.a aVar) {
        super(2, aVar);
        this.f39954b = coroutineContext;
        this.f39955c = fVar;
        this.f39956d = t1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f39954b, this.f39955c, this.f39956d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39953a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            k kVar = k.f23369a;
            CoroutineContext coroutineContext = this.f39954b;
            boolean a10 = Intrinsics.a(coroutineContext, kVar);
            t1 t1Var = this.f39956d;
            f fVar = this.f39955c;
            if (a10) {
                e3 e3Var = new e3(t1Var, 2);
                this.f39953a = 1;
                if (fVar.c(e3Var, this) == aVar) {
                    return aVar;
                }
            } else {
                a aVar2 = new a(fVar, t1Var, null);
                this.f39953a = 2;
                if (g.e0(coroutineContext, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}

package m0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26566a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.k f26568c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j3 f26569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(a0.k kVar, j3 j3Var, yt.a aVar) {
        super(2, aVar);
        this.f26568c = kVar;
        this.f26569d = j3Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        o1 o1Var = new o1(this.f26568c, this.f26569d, aVar);
        o1Var.f26567b = obj;
        return o1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26566a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f26567b;
            ArrayList arrayList = new ArrayList();
            tu.w0 w0Var = ((a0.l) this.f26568c).f16a;
            v.j jVar = new v.j(1, arrayList, f0Var, this.f26569d);
            this.f26566a = 1;
            w0Var.getClass();
            if (tu.w0.n(w0Var, jVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}

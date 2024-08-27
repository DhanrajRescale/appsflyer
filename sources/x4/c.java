package x4;

import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import au.i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import t0.t1;
import tu.f;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39957a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f39959c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f39960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f39961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f39962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, n nVar, CoroutineContext coroutineContext, f fVar, yt.a aVar) {
        super(2, aVar);
        this.f39959c = oVar;
        this.f39960d = nVar;
        this.f39961e = coroutineContext;
        this.f39962f = fVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        c cVar = new c(this.f39959c, this.f39960d, this.f39961e, this.f39962f, aVar);
        cVar.f39958b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((t1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object P;
        Object obj2 = zt.a.f42823a;
        int i10 = this.f39957a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            b bVar = new b(this.f39961e, this.f39962f, (t1) this.f39958b, null);
            this.f39957a = 1;
            n nVar = n.f1948b;
            n nVar2 = this.f39960d;
            if (nVar2 != nVar) {
                o oVar = this.f39959c;
                if (oVar.b() == n.f1947a) {
                    P = Unit.f23355a;
                } else {
                    P = hl.f.P(new m0(oVar, nVar2, bVar, null), this);
                    if (P != obj2) {
                        P = Unit.f23355a;
                    }
                }
                if (P == obj2) {
                    return obj2;
                }
            } else {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
            }
        }
        return Unit.f23355a;
    }
}

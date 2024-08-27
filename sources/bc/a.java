package bc;

import ai.b;
import au.i;
import hu.c;
import ka.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import s0.g;
import t0.g1;
import ut.n;
import w.e;
import w.x1;

/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f6932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6933c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f6934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f6936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f6937g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f6938h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x1 x1Var, boolean z10, c cVar, boolean z11, g1 g1Var, g1 g1Var2, g1 g1Var3, yt.a aVar) {
        super(2, aVar);
        this.f6932b = x1Var;
        this.f6933c = z10;
        this.f6934d = cVar;
        this.f6935e = z11;
        this.f6936f = g1Var;
        this.f6937g = g1Var2;
        this.f6938h = g1Var3;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f6932b, this.f6933c, this.f6934d, this.f6935e, this.f6936f, this.f6937g, this.f6938h, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f6931a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            x1 x1Var = this.f6932b;
            a1 a1Var = new a1(this.f6936f, 1);
            this.f6931a = 1;
            if (e.e(g.f34069a, 1.0f, x1Var, a1Var, this, 4) == aVar) {
                return aVar;
            }
        }
        if (this.f6933c) {
            obj2 = new Object();
        } else {
            obj2 = ai.a.f440b;
        }
        g1 g1Var = this.f6937g;
        g1Var.setValue(obj2);
        c cVar = this.f6934d;
        if (cVar != null) {
            cVar.b((b) g1Var.getValue(), Boolean.valueOf(this.f6935e), Boolean.valueOf(((Boolean) this.f6938h.getValue()).booleanValue()));
        }
        return Unit.f23355a;
    }
}

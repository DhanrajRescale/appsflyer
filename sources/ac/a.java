package ac;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;
import ut.n;
import w.d0;
import w.x1;

/* loaded from: classes.dex */
public final class a extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w.d dVar, float f10, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f311b = dVar;
        this.f312c = f10;
        this.f313d = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f311b, this.f312c, this.f313d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [w.d0, java.lang.Object] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        zt.a aVar = zt.a.f42823a;
        int i11 = this.f310a;
        if (i11 != 0) {
            if (i11 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            g1 g1Var = this.f313d;
            if (((Boolean) g1Var.getValue()).booleanValue()) {
                i10 = 0;
            } else {
                i10 = 300;
            }
            g1Var.setValue(Boolean.FALSE);
            Float f10 = new Float(this.f312c);
            x1 x1Var = new x1(i10, (d0) new Object(), 2);
            this.f310a = 1;
            if (w.d.c(this.f311b, f10, x1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}

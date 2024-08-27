package y;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public iu.w f40950a;

    /* renamed from: b, reason: collision with root package name */
    public w.o f40951b;

    /* renamed from: c, reason: collision with root package name */
    public int f40952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f40953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f40954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q1 f40955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(float f10, u uVar, q1 q1Var, yt.a aVar) {
        super(2, aVar);
        this.f40953d = f10;
        this.f40954e = uVar;
        this.f40955f = q1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t(this.f40953d, this.f40954e, this.f40955f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [iu.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [iu.w] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        iu.w obj2;
        w.o oVar;
        iu.w wVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40952c;
        if (i10 != 0) {
            if (i10 == 1) {
                oVar = this.f40951b;
                obj2 = this.f40950a;
                try {
                    ut.n.b(obj);
                    wVar = obj2;
                } catch (CancellationException unused) {
                    obj2.f20557a = ((Number) oVar.b()).floatValue();
                    wVar = obj2;
                    f10 = wVar.f20557a;
                    return new Float(f10);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            f10 = this.f40953d;
            if (Math.abs(f10) > 1.0f) {
                obj2 = new Object();
                obj2.f20557a = f10;
                Object obj3 = new Object();
                w.o b10 = w.e.b(s0.g.f34069a, f10);
                try {
                    u uVar = this.f40954e;
                    w.b0 b0Var = uVar.f40965a;
                    w.a aVar2 = new w.a(obj3, this.f40955f, obj2, uVar, 2);
                    this.f40950a = obj2;
                    this.f40951b = b10;
                    this.f40952c = 1;
                    wVar = obj2;
                    if (w.e.f(b10, b0Var, false, aVar2, this) == aVar) {
                        return aVar;
                    }
                } catch (CancellationException unused2) {
                    oVar = b10;
                    obj2.f20557a = ((Number) oVar.b()).floatValue();
                    wVar = obj2;
                    f10 = wVar.f20557a;
                    return new Float(f10);
                }
            }
            return new Float(f10);
        }
        f10 = wVar.f20557a;
        return new Float(f10);
    }
}

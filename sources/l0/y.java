package l0;

import i0.a2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23868b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23869c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f23870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f23871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2 f23872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m mVar, j jVar, a2 a2Var, yt.a aVar) {
        super(aVar);
        this.f23870d = mVar;
        this.f23871e = jVar;
        this.f23872f = a2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        y yVar = new y(this.f23870d, this.f23871e, this.f23872f, aVar);
        yVar.f23869c = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        x1.m0 m0Var;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23868b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.n.b(obj);
                return Unit.f23355a;
            }
            m0Var = (x1.m0) this.f23869c;
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            m0Var = (x1.m0) this.f23869c;
            this.f23869c = m0Var;
            this.f23868b = 1;
            obj = dp.b.A0(m0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        x1.k kVar = (x1.k) obj;
        if (dp.b.v1(kVar) && (kVar.f39872c & 33) != 0) {
            int size = kVar.f39870a.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!((x1.t) r5.get(i11)).b()) {
                }
            }
            this.f23869c = null;
            this.f23868b = 2;
            if (dp.b.I0(m0Var, this.f23870d, this.f23871e, kVar, this) == aVar) {
                return aVar;
            }
            return Unit.f23355a;
        }
        if (!dp.b.v1(kVar)) {
            this.f23869c = null;
            this.f23868b = 3;
            if (dp.b.M0(m0Var, this.f23872f, kVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}

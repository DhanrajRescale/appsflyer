package f0;

import a2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class l extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f15897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f15898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f15899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f15900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, u uVar, Function0 function0, Function0 function02, yt.a aVar) {
        super(2, aVar);
        this.f15897b = mVar;
        this.f15898c = uVar;
        this.f15899d = function0;
        this.f15900e = function02;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        l lVar = new l(this.f15897b, this.f15898c, this.f15899d, this.f15900e, aVar);
        lVar.f15896a = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        f0 f0Var = (f0) this.f15896a;
        m mVar = this.f15897b;
        yk.g.H(f0Var, null, null, new j(mVar, this.f15898c, this.f15899d, null), 3);
        return yk.g.H(f0Var, null, null, new k(mVar, this.f15900e, null), 3);
    }
}

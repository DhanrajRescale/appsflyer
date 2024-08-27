package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c8 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.k f26008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f26009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(a0.k kVar, s1 s1Var, boolean z10, boolean z11) {
        super(2);
        this.f26006a = z10;
        this.f26007b = z11;
        this.f26008c = kVar;
        this.f26009d = s1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g8.f26217a.a(this.f26006a, this.f26007b, this.f26008c, this.f26009d, null, s0.g.f34069a, s0.g.f34069a, nVar, 12582912, 112);
        return Unit.f23355a;
    }
}

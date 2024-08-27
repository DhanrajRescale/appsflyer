package tb;

import c0.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f35799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f35800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f35801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(m0 m0Var, Function0 function0, int i10, int i11) {
        super(2);
        this.f35798a = i11;
        this.f35799b = m0Var;
        this.f35800c = function0;
        this.f35801d = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f35801d;
        m0 m0Var = this.f35799b;
        Function0 function0 = this.f35800c;
        int i11 = this.f35798a;
        switch (i11) {
            case 0:
                t0.n nVar = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        yk.j.V(m0Var, function0, nVar, t0.t.H0(i10 | 1));
                        break;
                    default:
                        kp.j.r(m0Var, function0, nVar, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
            default:
                t0.n nVar2 = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        yk.j.V(m0Var, function0, nVar2, t0.t.H0(i10 | 1));
                        break;
                    default:
                        kp.j.r(m0Var, function0, nVar2, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
        }
    }
}

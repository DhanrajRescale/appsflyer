package yb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f41472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i10, int i11, Function1 function1) {
        super(2);
        this.f41471a = i11;
        this.f41472b = function1;
        this.f41473c = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f41473c;
        Function1 function1 = this.f41472b;
        int i11 = this.f41471a;
        switch (i11) {
            case 0:
                t0.n nVar = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        u.e(function1, nVar, t0.t.H0(i10 | 1));
                        break;
                    default:
                        kp.j.f(function1, nVar, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
            default:
                t0.n nVar2 = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        u.e(function1, nVar2, t0.t.H0(i10 | 1));
                        break;
                    default:
                        kp.j.f(function1, nVar2, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
        }
    }
}

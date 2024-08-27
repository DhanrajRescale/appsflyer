package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f22780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Function1 function1, int i10, int i11, int i12) {
        super(2);
        this.f22779a = i12;
        this.f22780b = function1;
        this.f22781c = i10;
        this.f22782d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f22781c;
        int i11 = this.f22782d;
        Function1 function1 = this.f22780b;
        int i12 = this.f22779a;
        switch (i12) {
            case 0:
                t0.n nVar = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i12) {
                    case 0:
                        yk.o.u(function1, nVar, t0.t.H0(i10 | 1), i11);
                        break;
                    default:
                        zq.f.h(function1, nVar, t0.t.H0(i10 | 1), i11);
                        break;
                }
                return Unit.f23355a;
            default:
                t0.n nVar2 = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i12) {
                    case 0:
                        yk.o.u(function1, nVar2, t0.t.H0(i10 | 1), i11);
                        break;
                    default:
                        zq.f.h(function1, nVar2, t0.t.H0(i10 | 1), i11);
                        break;
                }
                return Unit.f23355a;
        }
    }
}

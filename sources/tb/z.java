package tb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f35808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i10, int i11, Function0 function0) {
        super(2);
        this.f35807a = i11;
        this.f35808b = function0;
        this.f35809c = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f35809c;
        Function0 function0 = this.f35808b;
        int i11 = this.f35807a;
        switch (i11) {
            case 0:
                t0.n nVar = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        yk.o.q(function0, nVar, t0.t.H0(i10 | 1));
                        break;
                    default:
                        zq.f.g(function0, nVar, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
            default:
                t0.n nVar2 = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        yk.o.q(function0, nVar2, t0.t.H0(i10 | 1));
                        break;
                    default:
                        zq.f.g(function0, nVar2, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
        }
    }
}

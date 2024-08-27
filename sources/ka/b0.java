package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i10, int i11, Function0 function0) {
        super(2);
        this.f22745a = 2;
        this.f22746b = i10;
        this.f22748d = function0;
        this.f22747c = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f22745a;
        int i12 = this.f22747c;
        int i13 = this.f22746b;
        Object obj = this.f22748d;
        switch (i11) {
            case 0:
                yk.j.T((String) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
            case 1:
                yk.j.U((g1) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
            case 2:
                yk.o.b(i13, (Function0) obj, nVar, t0.t.H0(i12 | 1));
                return;
            default:
                dp.b.k0((Boolean) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f22745a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, int i10, int i11, int i12) {
        super(2);
        this.f22745a = i12;
        this.f22748d = obj;
        this.f22746b = i10;
        this.f22747c = i11;
    }
}

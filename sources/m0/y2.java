package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut.d f27136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(Object obj, boolean z10, ut.d dVar, int i10, int i11, int i12) {
        super(2);
        this.f27131a = i12;
        this.f27135e = obj;
        this.f27132b = z10;
        this.f27136f = dVar;
        this.f27133c = i10;
        this.f27134d = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f27131a;
        int i12 = this.f27133c;
        ut.d dVar = this.f27136f;
        Object obj = this.f27135e;
        switch (i11) {
            case 0:
                ((z2) obj).a(this.f27132b, (Function0) dVar, nVar, t0.t.H0(i12 | 1), this.f27134d);
                return;
            case 1:
                yk.j.W((Function1) obj, (Function1) dVar, this.f27132b, nVar, t0.t.H0(i12 | 1), this.f27134d);
                return;
            default:
                yk.j.L((g1.o) obj, this.f27132b, (Function1) dVar, nVar, t0.t.H0(i12 | 1), this.f27134d);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27131a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Function1 function1, Function1 function12, boolean z10, int i10, int i11) {
        super(2);
        this.f27131a = 1;
        this.f27135e = function1;
        this.f27136f = function12;
        this.f27132b = z10;
        this.f27133c = i10;
        this.f27134d = i11;
    }
}

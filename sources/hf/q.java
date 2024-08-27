package hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f18394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Function1 function1, j jVar, int i10, int i11, int i12) {
        super(2);
        this.f18392a = i12;
        this.f18393b = function1;
        this.f18394c = jVar;
        this.f18395d = i10;
        this.f18396e = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f18392a;
        j jVar = this.f18394c;
        Function1 function1 = this.f18393b;
        int i12 = this.f18396e;
        int i13 = this.f18395d;
        switch (i11) {
            case 0:
                z.e(function1, jVar, nVar, t0.t.H0(i13 | 1), i12);
                return;
            default:
                dp.b.y(function1, jVar, nVar, t0.t.H0(i13 | 1), i12);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f18392a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}

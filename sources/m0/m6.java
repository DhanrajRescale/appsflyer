package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m6 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f26496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f26497c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(Function2 function2, Function2 function22, int i10, int i11) {
        super(2);
        this.f26495a = i11;
        this.f26496b = function2;
        this.f26497c = function22;
        this.f26498d = i10;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26495a;
        Function2 function2 = this.f26497c;
        Function2 function22 = this.f26496b;
        int i12 = this.f26498d;
        switch (i11) {
            case 0:
                t6.b(function22, function2, nVar, t0.t.H0(i12 | 1));
                return;
            case 1:
                t6.c(function22, function2, nVar, t0.t.H0(i12 | 1));
                return;
            default:
                m7.d(function22, function2, nVar, t0.t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26495a) {
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
}

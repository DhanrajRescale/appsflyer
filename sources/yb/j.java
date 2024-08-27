package yb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, int i10, int i11) {
        super(2);
        this.f41440a = i11;
        this.f41441b = str;
        this.f41442c = i10;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f41440a;
        String str = this.f41441b;
        int i12 = this.f41442c;
        switch (i11) {
            case 0:
                u.b(t0.t.H0(i12 | 1), nVar, str);
                return;
            case 1:
                zq.f.n(t0.t.H0(i12 | 1), nVar, str);
                return;
            case 2:
                dp.b.W(t0.t.H0(i12 | 1), nVar, str);
                return;
            default:
                dp.b.X(t0.t.H0(i12 | 1), nVar, str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f41440a) {
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
}

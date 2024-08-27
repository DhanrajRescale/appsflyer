package vh;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.t;

/* loaded from: classes.dex */
public final class d extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ th.b f38063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f38064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f38065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(th.b bVar, boolean z10, Function1 function1, int i10, int i11, int i12) {
        super(2);
        this.f38062a = i12;
        this.f38063b = bVar;
        this.f38064c = z10;
        this.f38065d = function1;
        this.f38066e = i10;
        this.f38067f = i11;
    }

    public final void a(n nVar, int i10) {
        int i11 = this.f38062a;
        int i12 = this.f38066e;
        switch (i11) {
            case 0:
                zq.f.o(this.f38063b, this.f38064c, this.f38065d, nVar, t.H0(i12 | 1), this.f38067f);
                return;
            default:
                zq.f.r(this.f38063b, this.f38064c, this.f38065d, nVar, t.H0(i12 | 1), this.f38067f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f38062a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}

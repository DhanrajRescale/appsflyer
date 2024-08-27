package dd;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.t;
import yk.j;

/* loaded from: classes.dex */
public final class c extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14306a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, int i10, String str2, int i11) {
        super(2);
        this.f14307b = str;
        this.f14309d = i10;
        this.f14308c = str2;
        this.f14310e = i11;
    }

    public final void a(n nVar, int i10) {
        int i11 = this.f14306a;
        String str = this.f14308c;
        String str2 = this.f14307b;
        int i12 = this.f14310e;
        int i13 = this.f14309d;
        switch (i11) {
            case 0:
                j.X(i13, t.H0(i12 | 1), nVar, str2, str);
                return;
            default:
                zq.f.b(t.H0(i13 | 1), i12, nVar, str2, str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f14306a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, int i10, int i11) {
        super(2);
        this.f14307b = str;
        this.f14308c = str2;
        this.f14309d = i10;
        this.f14310e = i11;
    }
}

package pb;

import g1.o;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.t;
import yb.u;

/* loaded from: classes.dex */
public final class b extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30825a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30827c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, int i12, o oVar, Function0 function0) {
        super(2);
        this.f30827c = i10;
        this.f30826b = oVar;
        this.f30830f = function0;
        this.f30828d = i11;
        this.f30829e = i12;
    }

    public final void a(n nVar, int i10) {
        int i11 = this.f30825a;
        int i12 = this.f30828d;
        Object obj = this.f30830f;
        switch (i11) {
            case 0:
                yk.o.e(this.f30827c, this.f30826b, (Function0) obj, nVar, t.H0(i12 | 1), this.f30829e);
                return;
            default:
                u.a((String) obj, this.f30826b, this.f30827c, nVar, t.H0(i12 | 1), this.f30829e);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30825a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, o oVar, int i10, int i11, int i12) {
        super(2);
        this.f30830f = str;
        this.f30826b = oVar;
        this.f30827c = i10;
        this.f30828d = i11;
        this.f30829e = i12;
    }
}

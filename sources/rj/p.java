package rj;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import x.d0;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f33910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f33912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f33913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f33914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f33915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33916h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(g1.o oVar, boolean z10, d0 d0Var, String str, Function0 function0, int i10, int i11, int i12) {
        super(2);
        this.f33909a = i12;
        this.f33910b = oVar;
        this.f33911c = z10;
        this.f33912d = d0Var;
        this.f33913e = str;
        this.f33914f = function0;
        this.f33915g = i10;
        this.f33916h = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f33909a;
        int i12 = this.f33915g;
        switch (i11) {
            case 0:
                al.d.m(this.f33910b, this.f33911c, this.f33912d, this.f33913e, this.f33914f, nVar, t0.t.H0(i12 | 1), this.f33916h);
                return;
            default:
                al.d.n(this.f33910b, this.f33911c, this.f33912d, this.f33913e, this.f33914f, nVar, t0.t.H0(i12 | 1), this.f33916h);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f33909a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}

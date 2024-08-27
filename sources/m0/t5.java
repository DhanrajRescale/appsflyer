package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t5 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f26842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.c f26843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f26844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f26845g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f26846h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f26847i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26848j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(boolean z10, int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, b0.x1 x1Var, Function2 function24, int i11, int i12) {
        super(2);
        this.f26839a = i12;
        this.f26840b = z10;
        this.f26841c = i10;
        this.f26842d = function2;
        this.f26843e = cVar;
        this.f26844f = function22;
        this.f26845g = function23;
        this.f26846h = x1Var;
        this.f26847i = function24;
        this.f26848j = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26839a;
        int i12 = this.f26848j;
        switch (i11) {
            case 0:
                z5.a(this.f26840b, this.f26841c, this.f26842d, this.f26843e, this.f26844f, this.f26845g, this.f26846h, this.f26847i, nVar, t0.t.H0(i12 | 1));
                return;
            case 1:
                z5.e(this.f26840b, this.f26841c, this.f26842d, this.f26843e, this.f26844f, this.f26845g, this.f26846h, this.f26847i, nVar, t0.t.H0(i12 | 1));
                return;
            default:
                z5.d(this.f26840b, this.f26841c, this.f26842d, this.f26843e, this.f26844f, this.f26845g, this.f26846h, this.f26847i, nVar, t0.t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26839a) {
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

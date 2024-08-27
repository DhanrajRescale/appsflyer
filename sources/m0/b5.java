package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b5 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.l0 f25932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.l f25933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f25934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f25935h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f25936i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f25937j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f25938k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s1 f25939l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f25940m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5(String str, boolean z10, boolean z11, p2.l0 l0Var, a0.l lVar, boolean z12, Function2 function2, Function2 function22, Function2 function23, Function2 function24, s1 s1Var, Object obj, int i10) {
        super(3);
        this.f25928a = i10;
        this.f25929b = str;
        this.f25930c = z10;
        this.f25931d = z11;
        this.f25932e = l0Var;
        this.f25933f = lVar;
        this.f25934g = z12;
        this.f25935h = function2;
        this.f25936i = function22;
        this.f25937j = function23;
        this.f25938k = function24;
        this.f25939l = s1Var;
        this.f25940m = obj;
    }

    public final void a(Function2 innerTextField, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13 = this.f25928a;
        Object obj = this.f25940m;
        int i14 = 2;
        switch (i13) {
            case 0:
                if ((i10 & 6) == 0) {
                    if (((t0.r) nVar).j(innerTextField)) {
                        i14 = 4;
                    }
                    i11 = i10 | i14;
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g8 g8Var = g8.f26217a;
                String str = this.f25929b;
                boolean z10 = this.f25930c;
                boolean z11 = this.f25931d;
                p2.l0 l0Var = this.f25932e;
                a0.l lVar = this.f25933f;
                boolean z12 = this.f25934g;
                Function2 function2 = this.f25935h;
                Function2 function22 = this.f25936i;
                Function2 function23 = this.f25937j;
                Function2 function24 = this.f25938k;
                s1 s1Var = this.f25939l;
                g8Var.b(str, innerTextField, z10, z11, l0Var, lVar, z12, function2, function22, function23, function24, s1Var, null, b1.d.b(nVar, -1823843281, new a5(z10, z12, lVar, s1Var, (n1.x0) obj)), nVar, (i11 << 3) & 112, 27648, 4096);
                return;
            default:
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                if ((i10 & 14) == 0) {
                    if (((t0.r) nVar).j(innerTextField)) {
                        i14 = 4;
                    }
                    i12 = i10 | i14;
                } else {
                    i12 = i10;
                }
                if ((i12 & 91) == 18) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                g8.f26217a.c(this.f25929b, innerTextField, this.f25930c, this.f25931d, this.f25932e, this.f25933f, this.f25934g, this.f25935h, this.f25936i, this.f25937j, this.f25938k, this.f25939l, (b0.h1) obj, nVar, (i12 << 3) & 112, 3072, 0);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f25928a) {
            case 0:
                a((Function2) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((Function2) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}

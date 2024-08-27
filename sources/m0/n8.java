package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n8 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.l0 f26551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.l f26552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f26553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f26554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f26555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f26556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f26557j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s1 f26558k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(String str, boolean z10, boolean z11, p2.l0 l0Var, a0.l lVar, boolean z12, Function2 function2, Function2 function22, Function2 function23, Function2 function24, s1 s1Var) {
        super(3);
        this.f26548a = str;
        this.f26549b = z10;
        this.f26550c = z11;
        this.f26551d = l0Var;
        this.f26552e = lVar;
        this.f26553f = z12;
        this.f26554g = function2;
        this.f26555h = function22;
        this.f26556i = function23;
        this.f26557j = function24;
        this.f26558k = s1Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10;
        Function2 function2 = (Function2) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((t0.r) nVar).j(function2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        int i11 = intValue;
        if ((i11 & 19) == 18) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g8.f26217a.c(this.f26548a, function2, this.f26549b, this.f26550c, this.f26551d, this.f26552e, this.f26553f, this.f26554g, this.f26555h, this.f26556i, this.f26557j, this.f26558k, null, nVar, (i11 << 3) & 112, 3072, 4096);
        return Unit.f23355a;
    }
}

package ug;

import g1.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.t;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f37173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f37174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37176h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, int i10, String str, String str2, String str3, Function0 function0, int i11, int i12) {
        super(2);
        this.f37169a = oVar;
        this.f37170b = i10;
        this.f37171c = str;
        this.f37172d = str2;
        this.f37173e = str3;
        this.f37174f = function0;
        this.f37175g = i11;
        this.f37176h = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dp.b.u(this.f37169a, this.f37170b, this.f37171c, this.f37172d, this.f37173e, this.f37174f, (n) obj, t.H0(this.f37175g | 1), this.f37176h);
        return Unit.f23355a;
    }
}

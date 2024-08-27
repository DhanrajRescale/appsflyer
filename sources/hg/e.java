package hg;

import g1.o;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.t;

/* loaded from: classes.dex */
public final class e extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f18450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, int i11, o oVar, int i12, int i13) {
        super(2);
        this.f18448a = i10;
        this.f18449b = i11;
        this.f18450c = oVar;
        this.f18451d = i12;
        this.f18452e = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dp.b.C(this.f18448a, this.f18449b, this.f18450c, (n) obj, t.H0(this.f18451d | 1), this.f18452e);
        return Unit.f23355a;
    }
}

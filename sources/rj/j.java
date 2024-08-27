package rj;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f33884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f33885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f33886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, float f10, Function0 function0, int i10) {
        super(2);
        this.f33883a = str;
        this.f33884b = f10;
        this.f33885c = function0;
        this.f33886d = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int H0 = t0.t.H0(this.f33886d | 1);
        float f10 = this.f33884b;
        Function0 function0 = this.f33885c;
        el.l.a(this.f33883a, f10, function0, (t0.n) obj, H0);
        return Unit.f23355a;
    }
}

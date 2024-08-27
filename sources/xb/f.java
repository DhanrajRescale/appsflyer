package xb;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kp.j;
import t0.n;
import t0.t;

/* loaded from: classes.dex */
public final class f extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, int i11, int i12) {
        super(2);
        this.f40163a = i10;
        this.f40164b = i11;
        this.f40165c = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int H0 = t.H0(this.f40164b | 1);
        int i10 = this.f40165c;
        j.j(this.f40163a, (n) obj, H0, i10);
        return Unit.f23355a;
    }
}

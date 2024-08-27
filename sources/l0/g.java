package l0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f23752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f23753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j10, Function0 function0, boolean z10) {
        super(1);
        this.f23752a = j10;
        this.f23753b = function0;
        this.f23754c = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k1.d dVar = (k1.d) obj;
        return dVar.a(new c0.z(this.f23753b, this.f23754c, dp.b.e1(dVar, m1.f.e(dVar.f21893a.d()) / 2.0f), kq.e.P(5, this.f23752a)));
    }
}

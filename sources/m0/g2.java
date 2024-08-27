package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f26195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f26196c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(boolean z10, Function0 function0, Function0 function02, long j10, int i10) {
        super(2);
        this.f26194a = z10;
        this.f26195b = function0;
        this.f26196c = function02;
        this.f26197d = j10;
        this.f26198e = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        m2.b(this.f26194a, this.f26195b, this.f26196c, this.f26197d, (t0.n) obj, t0.t.H0(this.f26198e | 1));
        return Unit.f23355a;
    }
}

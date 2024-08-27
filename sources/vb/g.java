package vb;

import hb.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.t;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f37877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f37879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, boolean z10, y yVar, boolean z11, Function1 function1, int i10) {
        super(2);
        this.f37875a = str;
        this.f37876b = z10;
        this.f37877c = yVar;
        this.f37878d = z11;
        this.f37879e = function1;
        this.f37880f = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.o.i(this.f37875a, this.f37876b, this.f37877c, this.f37878d, this.f37879e, (t0.n) obj, t.H0(this.f37880f | 1));
        return Unit.f23355a;
    }
}

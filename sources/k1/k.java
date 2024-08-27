package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n1.f0;
import n1.u0;
import n1.x0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f21908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f21909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f21911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f21912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(float f10, x0 x0Var, boolean z10, long j10, long j11) {
        super(1);
        this.f21908a = f10;
        this.f21909b = x0Var;
        this.f21910c = z10;
        this.f21911d = j10;
        this.f21912e = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u0 u0Var = (u0) ((f0) obj);
        u0Var.l(u0Var.f28199s.b() * this.f21908a);
        u0Var.m(this.f21909b);
        boolean z10 = u0Var.f28196p;
        boolean z11 = this.f21910c;
        if (z10 != z11) {
            u0Var.f28181a |= Http2.INITIAL_MAX_FRAME_SIZE;
            u0Var.f28196p = z11;
        }
        u0Var.c(this.f21911d);
        u0Var.n(this.f21912e);
        return Unit.f23355a;
    }
}

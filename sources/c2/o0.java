package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, int i10, long j10) {
        super(0);
        this.f7802a = i10;
        this.f7804c = obj;
        this.f7803b = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f7802a;
        long j10 = this.f7803b;
        Object obj = this.f7804c;
        switch (i10) {
            case 0:
                v0 U0 = ((q0) obj).a().U0();
                Intrinsics.c(U0);
                ((w) U0).E(j10);
                return Unit.f23355a;
            default:
                return ((n1.v0) ((n1.p) obj)).b(j10);
        }
    }
}

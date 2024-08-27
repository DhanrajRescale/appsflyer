package c0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.l3;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f7567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(l3 l3Var, int i10) {
        super(0);
        this.f7566a = i10;
        this.f7567b = l3Var;
    }

    public final Integer a() {
        int i10;
        int i11 = this.f7566a;
        l3 l3Var = this.f7567b;
        switch (i11) {
            case 6:
                return Integer.valueOf(((Number) l3Var.getValue()).intValue());
            case 7:
                return Integer.valueOf(((Number) l3Var.getValue()).intValue());
            case 8:
                return Integer.valueOf(((Number) l3Var.getValue()).intValue());
            default:
                if (Intrinsics.a(((sb.d) l3Var.getValue()).f34443a, "FEED_STREAM_POST_DETAILS")) {
                    i10 = 1;
                } else {
                    i10 = 5;
                }
                return Integer.valueOf(i10);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        int i10 = this.f7566a;
        l3 l3Var = this.f7567b;
        switch (i10) {
            case 2:
                return Boolean.valueOf(((Boolean) l3Var.getValue()).booleanValue());
            case 10:
                return (Boolean) l3Var.getValue();
            default:
                return (Boolean) l3Var.getValue();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        long j10;
        long j11;
        int i10 = this.f7566a;
        l3 l3Var = this.f7567b;
        switch (i10) {
            case 0:
                return new j((Function1) l3Var.getValue());
            case 1:
                return (d0.u) ((Function0) l3Var.getValue()).mo2invoke();
            case 2:
                return mo2invoke();
            case 3:
                switch (i10) {
                    case 3:
                        j10 = ((m1.c) l3Var.getValue()).f27237a;
                        break;
                    default:
                        w.q qVar = l0.k0.f23783a;
                        j10 = ((m1.c) l3Var.getValue()).f27237a;
                        break;
                }
                return new m1.c(j10);
            case 4:
                switch (i10) {
                    case 3:
                        j11 = ((m1.c) l3Var.getValue()).f27237a;
                        break;
                    default:
                        w.q qVar2 = l0.k0.f23783a;
                        j11 = ((m1.c) l3Var.getValue()).f27237a;
                        break;
                }
                return new m1.c(j11);
            case 5:
                return (q0.i) l3Var.getValue();
            case 6:
                return a();
            case 7:
                return a();
            case 8:
                return a();
            case 9:
                return a();
            case 10:
                return mo2invoke();
            default:
                return mo2invoke();
        }
    }
}

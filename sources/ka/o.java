package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(g1 g1Var, g1 g1Var2, int i10) {
        super(1);
        this.f22865a = i10;
        this.f22866b = g1Var;
        this.f22867c = g1Var2;
    }

    public final void a(String it) {
        int i10 = this.f22865a;
        g1 g1Var = this.f22867c;
        g1 g1Var2 = this.f22866b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(Double.valueOf(Double.parseDouble(it)));
                g1Var.setValue(it);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var2.setValue(it);
                int length = it.length();
                boolean z10 = true;
                if ((1 > length || length >= 3) && it.length() < 30) {
                    z10 = false;
                }
                g1Var.setValue(Boolean.valueOf(z10));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22865a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            case 4:
                a((String) obj);
                return Unit.f23355a;
            case 5:
                a((String) obj);
                return Unit.f23355a;
            case 6:
                a((String) obj);
                return Unit.f23355a;
            case 7:
                a((String) obj);
                return Unit.f23355a;
            case 8:
                a((String) obj);
                return Unit.f23355a;
            case 9:
                a((String) obj);
                return Unit.f23355a;
            case 10:
                a((String) obj);
                return Unit.f23355a;
            case 11:
                a((String) obj);
                return Unit.f23355a;
            case 12:
                long j10 = ((w2.j) obj).f38798a;
                this.f22866b.setValue(new w2.e(kj.f.i((int) (j10 >> 32))));
                this.f22867c.setValue(new w2.e(kj.f.i((int) (j10 & 4294967295L))));
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}

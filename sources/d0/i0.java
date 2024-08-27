package d0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f13168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Function0 function0, int i10) {
        super(1);
        this.f13167a = i10;
        this.f13168b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f13167a;
        Function0 function0 = this.f13168b;
        switch (i10) {
            case 0:
                u uVar = (u) function0.mo2invoke();
                int c10 = uVar.c();
                int i11 = 0;
                while (true) {
                    if (i11 < c10) {
                        if (!Intrinsics.a(uVar.a(i11), obj)) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                }
                return Integer.valueOf(i11);
            case 1:
                return new m1.c(((m1.c) function0.mo2invoke()).f27237a);
            case 2:
                hb.y it = (hb.y) obj;
                switch (i10) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it, "it");
                        function0.mo2invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        function0.mo2invoke();
                        break;
                }
                return Unit.f23355a;
            default:
                hb.y it2 = (hb.y) obj;
                switch (i10) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        function0.mo2invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        function0.mo2invoke();
                        break;
                }
                return Unit.f23355a;
        }
    }
}

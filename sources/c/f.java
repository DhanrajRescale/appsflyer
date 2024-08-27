package c;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l1.o;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, boolean z10) {
        super(0);
        this.f7416a = 0;
        this.f7418c = iVar;
        this.f7417b = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        boolean z10;
        l1.h hVar = l1.h.f23896e;
        Object obj = this.f7418c;
        boolean z11 = this.f7417b;
        int i10 = this.f7416a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        ((i) obj).setEnabled(z11);
                        break;
                    default:
                        if (z11) {
                            ((o) obj).a(hVar);
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            case 1:
                switch (i10) {
                    case 0:
                        ((i) obj).setEnabled(z11);
                        break;
                    default:
                        if (z11) {
                            ((o) obj).a(hVar);
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            default:
                if (!z11 && ((p0.o) obj).f30484e.i() <= 0.5f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(boolean z10, Object obj, int i10) {
        super(0);
        this.f7416a = i10;
        this.f7417b = z10;
        this.f7418c = obj;
    }
}

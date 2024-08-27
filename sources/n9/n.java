package n9;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f28520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(0);
        this.f28519a = i10;
        this.f28520b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        int i10 = this.f28519a;
        o oVar = this.f28520b;
        switch (i10) {
            case 0:
                return Boolean.valueOf((((j9.i) oVar.f28522b.getValue()) == null && ((Throwable) oVar.f28523c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) oVar.f28523c.getValue()) != null);
            case 2:
                if (((j9.i) oVar.f28522b.getValue()) == null && ((Throwable) oVar.f28523c.getValue()) == null) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                return Boolean.valueOf(((j9.i) oVar.f28522b.getValue()) != null);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f28519a) {
            case 0:
                return mo2invoke();
            case 1:
                return mo2invoke();
            case 2:
                return mo2invoke();
            default:
                return mo2invoke();
        }
    }
}

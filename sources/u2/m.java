package u2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f36691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i10) {
        super(0);
        this.f36690a = i10;
        this.f36691b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f36690a;
        n nVar = this.f36691b;
        switch (i10) {
            case 0:
                return Float.valueOf(nVar.c());
            default:
                return nVar;
        }
    }
}

package d1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f13267a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(1);
        this.f13267a = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        n nVar = this.f13267a.f13278c;
        if (nVar != null) {
            z10 = nVar.a(obj);
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}

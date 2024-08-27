package d1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f13253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f13253a = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        d dVar = this.f13253a;
        r rVar = dVar.f13254a;
        Object obj = dVar.f13257d;
        if (obj != null) {
            return rVar.f13289a.invoke(dVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }
}

package yb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb.u f41454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f41455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(hb.u uVar, Function2 function2) {
        super(0);
        this.f41454a = uVar;
        this.f41455b = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        hb.u uVar = this.f41454a;
        if (uVar.f18230a.f18224a.length() > 0) {
            hb.s sVar = uVar.f18230a;
            if (sVar.f18227d.f18218e.length() > 0) {
                this.f41455b.invoke(sVar.f18224a, sVar.f18227d.f18218e);
            }
        }
        return Unit.f23355a;
    }
}

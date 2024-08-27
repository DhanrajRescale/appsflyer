package fv;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class b extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i10) {
        super(0);
        this.f16272a = i10;
        this.f16273b = eVar;
    }

    public final void a() {
        int i10 = this.f16272a;
        e eVar = this.f16273b;
        switch (i10) {
            case 0:
                if (eVar.f16289j.c()) {
                    e.f(eVar);
                    return;
                }
                return;
            default:
                eVar.f16287h.a();
                if (eVar.f16280a == 2) {
                    e.f(eVar);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f16272a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}

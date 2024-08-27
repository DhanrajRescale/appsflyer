package d0;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1.n f13179b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(d1.n nVar, int i10) {
        super(1);
        this.f13178a = i10;
        this.f13179b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f13178a;
        d1.n nVar = this.f13179b;
        switch (i10) {
            case 0:
                if (nVar != null) {
                    z10 = nVar.a(obj);
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                return new o0(nVar, (Map) obj);
        }
    }
}

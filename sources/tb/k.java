package tb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f35714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hb.u f35715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(hu.c cVar, hb.u uVar, int i10) {
        super(2);
        this.f35713a = i10;
        this.f35714b = cVar;
        this.f35715c = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f35713a;
        hu.c cVar = this.f35714b;
        hb.u uVar = this.f35715c;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String url = (String) obj2;
                Intrinsics.checkNotNullParameter(url, "url");
                cVar.b(uVar.f18230a.f18224a, Boolean.valueOf(booleanValue), url);
                return Unit.f23355a;
            default:
                cVar.b((String) obj, (String) obj2, uVar.f18230a.f18228e.f18195e);
                return Unit.f23355a;
        }
    }
}

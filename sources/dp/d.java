package dp;

import android.content.Context;

/* loaded from: classes2.dex */
public final class d implements ep.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14442a;

    /* renamed from: b, reason: collision with root package name */
    public final ep.c f14443b;

    public /* synthetic */ d(ep.c cVar, int i10) {
        this.f14442a = i10;
        this.f14443b = cVar;
    }

    @Override // ep.c
    public final Object zza() {
        int i10 = this.f14442a;
        ep.c cVar = this.f14443b;
        switch (i10) {
            case 0:
                Context context = ((f) cVar).f14447a.f15616b;
                if (context != null) {
                    return new c(context);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                e eVar = (e) cVar.zza();
                if (eVar != null) {
                    return eVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}

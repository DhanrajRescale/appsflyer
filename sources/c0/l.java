package c0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class l implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0.w f7519b;

    public /* synthetic */ l(d0.w wVar, int i10) {
        this.f7518a = i10;
        this.f7519b = wVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f7518a;
        d0.w wVar = this.f7519b;
        switch (i10) {
            case 0:
                return xt.a.a(Integer.valueOf(wVar.b(((b0) obj).f7473j)), Integer.valueOf(wVar.b(((b0) obj2).f7473j)));
            case 1:
                return xt.a.a(Integer.valueOf(wVar.b(((b0) obj).f7473j)), Integer.valueOf(wVar.b(((b0) obj2).f7473j)));
            case 2:
                return xt.a.a(Integer.valueOf(wVar.b(((b0) obj2).f7473j)), Integer.valueOf(wVar.b(((b0) obj).f7473j)));
            default:
                return xt.a.a(Integer.valueOf(wVar.b(((b0) obj2).f7473j)), Integer.valueOf(wVar.b(((b0) obj).f7473j)));
        }
    }
}

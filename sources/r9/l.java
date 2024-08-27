package r9;

import android.graphics.Path;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import j9.y;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33516a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f33517b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33518c;

    /* renamed from: d, reason: collision with root package name */
    public final bk.c f33519d;

    /* renamed from: e, reason: collision with root package name */
    public final bk.c f33520e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33521f;

    public l(String str, boolean z10, Path.FillType fillType, bk.c cVar, bk.c cVar2, boolean z11) {
        this.f33518c = str;
        this.f33516a = z10;
        this.f33517b = fillType;
        this.f33519d = cVar;
        this.f33520e = cVar2;
        this.f33521f = z11;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        return new l9.h(yVar, bVar, this);
    }

    public final String toString() {
        return v.e.k(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f33516a, UrlTreeKt.componentParamSuffixChar);
    }
}

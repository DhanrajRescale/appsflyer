package r9;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import j9.y;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33522a;

    /* renamed from: b, reason: collision with root package name */
    public final List f33523b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33524c;

    public m(List list, String str, boolean z10) {
        this.f33522a = str;
        this.f33523b = list;
        this.f33524c = z10;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        return new l9.e(yVar, bVar, this, iVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f33522a + "' Shapes: " + Arrays.toString(this.f33523b.toArray()) + UrlTreeKt.componentParamSuffixChar;
    }
}

package r9;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import j9.y;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f33493a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33494b;

    public g(String str, int i10, boolean z10) {
        this.f33493a = i10;
        this.f33494b = z10;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        if (!yVar.f21235l) {
            w9.b.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new l9.m(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + nn.d.y(this.f33493a) + UrlTreeKt.componentParamSuffixChar;
    }
}

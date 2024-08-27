package qu;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class v0 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32282a;

    public v0(boolean z10) {
        this.f32282a = z10;
    }

    @Override // qu.i1
    public final boolean b() {
        return this.f32282a;
    }

    @Override // qu.i1
    public final c2 d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f32282a) {
            str = "Active";
        } else {
            str = "New";
        }
        return nn.d.n(sb2, str, UrlTreeKt.componentParamSuffixChar);
    }
}

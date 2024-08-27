package hf;

import com.assetgro.stockgro.data.AnalyticEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f18368a;

    /* renamed from: b, reason: collision with root package name */
    public final AnalyticEvent f18369b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18370c;

    public g(String deeplink, AnalyticEvent analyticEvent, String str) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f18368a = deeplink;
        this.f18369b = analyticEvent;
        this.f18370c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f18368a, gVar.f18368a) && Intrinsics.a(this.f18369b, gVar.f18369b) && Intrinsics.a(this.f18370c, gVar.f18370c);
    }

    public final int hashCode() {
        int hashCode = this.f18368a.hashCode() * 31;
        AnalyticEvent analyticEvent = this.f18369b;
        int hashCode2 = (hashCode + (analyticEvent == null ? 0 : analyticEvent.hashCode())) * 31;
        String str = this.f18370c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeeplinkActionClicked(deeplink=");
        sb2.append(this.f18368a);
        sb2.append(", analyticEvent=");
        sb2.append(this.f18369b);
        sb2.append(", sectionId=");
        return nn.d.o(sb2, this.f18370c, ")");
    }
}

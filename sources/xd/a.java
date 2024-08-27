package xd;

import jr.h;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f40173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40174b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40175c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40176d;

    public a(String displayName, String optionName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "userId");
        Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "userName");
        this.f40173a = displayName;
        this.f40174b = optionName;
        this.f40175c = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f40176d = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f40173a, aVar.f40173a) && Intrinsics.a(this.f40174b, aVar.f40174b) && Intrinsics.a(this.f40175c, aVar.f40175c) && Intrinsics.a(this.f40176d, aVar.f40176d);
    }

    public final int hashCode() {
        return this.f40176d.hashCode() + h.g(this.f40175c, h.g(this.f40174b, this.f40173a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatBottomSheetItem(displayName=");
        sb2.append(this.f40173a);
        sb2.append(", optionName=");
        sb2.append(this.f40174b);
        sb2.append(", userId=");
        sb2.append(this.f40175c);
        sb2.append(", userName=");
        return nn.d.o(sb2, this.f40176d, ")");
    }
}

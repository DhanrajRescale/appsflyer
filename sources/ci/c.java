package ci;

import android.text.SpannableString;
import java.io.Serializable;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import nn.d;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f8155a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8156b;

    /* renamed from: c, reason: collision with root package name */
    public final SpannableString f8157c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8158d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8159e;

    public c(int i10, String header, SpannableString message, String primaryButtonText, String secondaryButtonText) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f8155a = i10;
        this.f8156b = header;
        this.f8157c = message;
        this.f8158d = primaryButtonText;
        this.f8159e = secondaryButtonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8155a == cVar.f8155a && Intrinsics.a(this.f8156b, cVar.f8156b) && Intrinsics.a(this.f8157c, cVar.f8157c) && Intrinsics.a(this.f8158d, cVar.f8158d) && Intrinsics.a(this.f8159e, cVar.f8159e);
    }

    public final int hashCode() {
        return this.f8159e.hashCode() + h.g(this.f8158d, (this.f8157c.hashCode() + h.g(this.f8156b, Integer.hashCode(this.f8155a) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SocialBottomSheetData(icon=");
        sb2.append(this.f8155a);
        sb2.append(", header=");
        sb2.append(this.f8156b);
        sb2.append(", message=");
        sb2.append((Object) this.f8157c);
        sb2.append(", primaryButtonText=");
        sb2.append(this.f8158d);
        sb2.append(", secondaryButtonText=");
        return d.o(sb2, this.f8159e, ")");
    }
}

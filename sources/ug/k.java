package ug;

import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: c, reason: collision with root package name */
    public final String f37189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String unknownStatus) {
        super(kj.f.c(unknownStatus), R.color.red_new);
        Intrinsics.checkNotNullParameter(unknownStatus, "unknownStatus");
        this.f37189c = unknownStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.a(this.f37189c, ((k) obj).f37189c);
    }

    public final int hashCode() {
        return this.f37189c.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("Unknown(unknownStatus="), this.f37189c, ")");
    }
}

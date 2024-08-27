package uh;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final th.c f37200b;

    public f(th.c scratchCardsData) {
        Intrinsics.checkNotNullParameter(scratchCardsData, "scratchCardsData");
        this.f37200b = scratchCardsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.a(this.f37200b, ((f) obj).f37200b);
    }

    public final int hashCode() {
        return this.f37200b.hashCode();
    }

    public final String toString() {
        return "Data(scratchCardsData=" + this.f37200b + ")";
    }
}

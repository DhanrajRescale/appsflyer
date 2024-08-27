package uh;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final String f37199b;

    public e(String scratchCardId) {
        Intrinsics.checkNotNullParameter(scratchCardId, "scratchCardId");
        this.f37199b = scratchCardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f37199b, ((e) obj).f37199b);
    }

    public final int hashCode() {
        return this.f37199b.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ClaimScratchCardReward(scratchCardId="), this.f37199b, ")");
    }
}

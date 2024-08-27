package gb;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("groups")
    @NotNull
    private final List<e> f17202a;

    public c(ArrayList groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f17202a = groups;
    }

    public final List a() {
        return this.f17202a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.a(this.f17202a, ((c) obj).f17202a);
    }

    public final int hashCode() {
        return this.f17202a.hashCode();
    }

    public final String toString() {
        return a3.a.h("FeedStoryResponse(groups=", this.f17202a, ")");
    }
}

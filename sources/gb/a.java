package gb;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("categories")
    @NotNull
    private final List<b> f17196a;

    public a(ArrayList categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f17196a = categories;
    }

    public final List a() {
        return this.f17196a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.a(this.f17196a, ((a) obj).f17196a);
    }

    public final int hashCode() {
        return this.f17196a.hashCode();
    }

    public final String toString() {
        return a3.a.h("FeedCategoriesResponse(categories=", this.f17196a, ")");
    }
}

package gb;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("sub_category_id")
    @NotNull
    private final String f17203a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String f17204b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("category_id")
    @NotNull
    private final String f17205c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("logo_url")
    @NotNull
    private final String f17206d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("is_liked")
    private final boolean f17207e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("is_full_width")
    private final boolean f17208f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("description")
    @NotNull
    private final String f17209g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17210h;

    public d(String subCategoryId, String name, String categoryId, String logoUrl, boolean z10, boolean z11, String description, String borderColor) {
        Intrinsics.checkNotNullParameter(subCategoryId, "subCategoryId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.f17203a = subCategoryId;
        this.f17204b = name;
        this.f17205c = categoryId;
        this.f17206d = logoUrl;
        this.f17207e = z10;
        this.f17208f = z11;
        this.f17209g = description;
        this.f17210h = borderColor;
    }

    public static d a(d dVar, boolean z10) {
        String subCategoryId = dVar.f17203a;
        String name = dVar.f17204b;
        String categoryId = dVar.f17205c;
        String logoUrl = dVar.f17206d;
        boolean z11 = dVar.f17208f;
        String description = dVar.f17209g;
        String borderColor = dVar.f17210h;
        Intrinsics.checkNotNullParameter(subCategoryId, "subCategoryId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        return new d(subCategoryId, name, categoryId, logoUrl, z10, z11, description, borderColor);
    }

    public final String b() {
        return this.f17206d;
    }

    public final String c() {
        return this.f17204b;
    }

    public final String d() {
        return this.f17203a;
    }

    public final boolean e() {
        return this.f17208f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f17203a, dVar.f17203a) && Intrinsics.a(this.f17204b, dVar.f17204b) && Intrinsics.a(this.f17205c, dVar.f17205c) && Intrinsics.a(this.f17206d, dVar.f17206d) && this.f17207e == dVar.f17207e && this.f17208f == dVar.f17208f && Intrinsics.a(this.f17209g, dVar.f17209g) && Intrinsics.a(this.f17210h, dVar.f17210h);
    }

    public final boolean f() {
        return this.f17207e;
    }

    public final int hashCode() {
        return this.f17210h.hashCode() + h.g(this.f17209g, v.e.d(this.f17208f, v.e.d(this.f17207e, h.g(this.f17206d, h.g(this.f17205c, h.g(this.f17204b, this.f17203a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = this.f17203a;
        String str2 = this.f17204b;
        String str3 = this.f17205c;
        String str4 = this.f17206d;
        boolean z10 = this.f17207e;
        boolean z11 = this.f17208f;
        String str5 = this.f17209g;
        StringBuilder l10 = v.e.l("FeedSubCategory(subCategoryId=", str, ", name=", str2, ", categoryId=");
        v.e.v(l10, str3, ", logoUrl=", str4, ", isLiked=");
        l10.append(z10);
        l10.append(", isFullWidth=");
        l10.append(z11);
        l10.append(", description=");
        l10.append(str5);
        l10.append(", borderColor=");
        return nn.d.o(l10, this.f17210h, ")");
    }
}

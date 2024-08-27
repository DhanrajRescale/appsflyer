package gb;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("category_id")
    @NotNull
    private final String f17197a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String f17198b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("description")
    @NotNull
    private final String f17199c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("border_color")
    @NotNull
    private final String f17200d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("sub_categories")
    @NotNull
    private final ArrayList<d> f17201e;

    public b(String categoryId, String name, String description, String borderColor, ArrayList subCategories) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(subCategories, "subCategories");
        this.f17197a = categoryId;
        this.f17198b = name;
        this.f17199c = description;
        this.f17200d = borderColor;
        this.f17201e = subCategories;
    }

    public static b a(b bVar, ArrayList subCategories) {
        String categoryId = bVar.f17197a;
        String name = bVar.f17198b;
        String description = bVar.f17199c;
        String borderColor = bVar.f17200d;
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(subCategories, "subCategories");
        return new b(categoryId, name, description, borderColor, subCategories);
    }

    public final String b() {
        return this.f17197a;
    }

    public final String c() {
        return this.f17199c;
    }

    public final String d() {
        return this.f17198b;
    }

    public final ArrayList e() {
        return this.f17201e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f17197a, bVar.f17197a) && Intrinsics.a(this.f17198b, bVar.f17198b) && Intrinsics.a(this.f17199c, bVar.f17199c) && Intrinsics.a(this.f17200d, bVar.f17200d) && Intrinsics.a(this.f17201e, bVar.f17201e);
    }

    public final int hashCode() {
        return this.f17201e.hashCode() + h.g(this.f17200d, h.g(this.f17199c, h.g(this.f17198b, this.f17197a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = this.f17197a;
        String str2 = this.f17198b;
        String str3 = this.f17199c;
        String str4 = this.f17200d;
        ArrayList<d> arrayList = this.f17201e;
        StringBuilder l10 = v.e.l("FeedCategory(categoryId=", str, ", name=", str2, ", description=");
        v.e.v(l10, str3, ", borderColor=", str4, ", subCategories=");
        l10.append(arrayList);
        l10.append(")");
        return l10.toString();
    }
}

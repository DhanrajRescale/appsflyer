package cl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8217b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8218c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8219d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8220e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8221f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8222g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8223h;

    public e(JSONObject component) {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f8216a = string;
        this.f8217b = component.optInt("index", -1);
        this.f8218c = component.optInt("id");
        String optString = component.optString("text");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PATH_TEXT_KEY)");
        this.f8219d = optString;
        String optString2 = component.optString("tag");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(PATH_TAG_KEY)");
        this.f8220e = optString2;
        String optString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f8221f = optString3;
        String optString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(optString4, "component.optString(PATH_HINT_KEY)");
        this.f8222g = optString4;
        this.f8223h = component.optInt("match_bitmask");
    }
}

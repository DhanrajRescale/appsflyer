package ss;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f34767b;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f34768a;

    static {
        a aVar = new a();
        aVar.a(1, "controls");
        f34767b = new b(aVar.f34766a);
    }

    public b(JSONObject jSONObject) {
        this.f34768a = jSONObject;
    }

    public final String toString() {
        String jSONObject = this.f34768a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "playerOptions.toString()");
        return jSONObject;
    }
}

package fv;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("ref")
    @NotNull
    private final String f16290a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("topic")
    @NotNull
    private final String f16291b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("event")
    @NotNull
    private final String f16292c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName(PaymentConstants.PAYLOAD)
    @NotNull
    private final Map<String, Object> f16293d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("join_ref")
    private final String f16294e;

    public f(String ref, String topic, String event, String str, Map payload) {
        Intrinsics.e(ref, "ref");
        Intrinsics.e(topic, "topic");
        Intrinsics.e(event, "event");
        Intrinsics.e(payload, "payload");
        this.f16290a = ref;
        this.f16291b = topic;
        this.f16292c = event;
        this.f16293d = payload;
        this.f16294e = str;
    }

    public final String a() {
        return this.f16292c;
    }

    public final String b() {
        return this.f16294e;
    }

    public final Map c() {
        return this.f16293d;
    }

    public final String d() {
        return this.f16290a;
    }

    public final String e() {
        Object obj = this.f16293d.get("status");
        if (!(obj instanceof String)) {
            obj = null;
        }
        return (String) obj;
    }

    public final String f() {
        return this.f16291b;
    }
}

package ut;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000 \u0004*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0005\u0006\u0088\u0001\u0007\u0092\u0001\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lut/l;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "b", "a", "ut/m", AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class l<T> implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f37395a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lut/l$a;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ut.l$a, reason: from kotlin metadata */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).f37396a;
        }
        return null;
    }

    public static final boolean b(Serializable serializable) {
        return serializable instanceof m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (!Intrinsics.a(this.f37395a, ((l) obj).f37395a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f37395a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f37395a;
        if (obj instanceof m) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}

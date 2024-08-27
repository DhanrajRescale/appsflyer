package qq;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f32128a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return Objects.equal(this.f32128a, ((b) obj).f32128a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f32128a);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("token", this.f32128a).toString();
    }
}

package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new e(13);

    /* renamed from: a, reason: collision with root package name */
    public final s f18230a;

    public u(s post) {
        Intrinsics.checkNotNullParameter(post, "post");
        this.f18230a = post;
    }

    public static u a(s post) {
        Intrinsics.checkNotNullParameter(post, "post");
        return new u(post);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.a(this.f18230a, ((u) obj).f18230a);
    }

    public final int hashCode() {
        return this.f18230a.hashCode();
    }

    public final String toString() {
        return "FeedStreamElement(post=" + this.f18230a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f18230a.writeToParcel(out, i10);
    }
}

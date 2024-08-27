package wl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new zi.j(10);

    /* renamed from: a, reason: collision with root package name */
    public String f39184a;

    /* renamed from: b, reason: collision with root package name */
    public String f39185b;

    /* renamed from: c, reason: collision with root package name */
    public String f39186c;

    /* renamed from: d, reason: collision with root package name */
    public long f39187d;

    /* renamed from: e, reason: collision with root package name */
    public long f39188e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f39184a);
        dest.writeString(this.f39185b);
        dest.writeString(this.f39186c);
        dest.writeLong(this.f39187d);
        dest.writeLong(this.f39188e);
    }
}

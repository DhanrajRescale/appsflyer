package yh;

import android.os.Parcel;
import android.os.Parcelable;
import hb.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new e(27);

    /* renamed from: a, reason: collision with root package name */
    public String f41636a;

    /* renamed from: b, reason: collision with root package name */
    public String f41637b;

    /* renamed from: c, reason: collision with root package name */
    public String f41638c;

    /* renamed from: d, reason: collision with root package name */
    public String f41639d;

    /* renamed from: e, reason: collision with root package name */
    public String f41640e;

    /* renamed from: f, reason: collision with root package name */
    public String f41641f;

    /* renamed from: g, reason: collision with root package name */
    public long f41642g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f41636a);
        dest.writeString(this.f41637b);
        dest.writeString(this.f41638c);
        dest.writeString(this.f41639d);
        dest.writeString(this.f41640e);
        dest.writeString(this.f41641f);
        dest.writeLong(this.f41642g);
    }
}

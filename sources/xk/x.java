package xk;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class x implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<x> CREATOR = new zi.j(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f40469a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f40470b;

    public x(Parcelable parcelable) {
        this.f40469a = "image/png";
        this.f40470b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f40469a);
        out.writeParcelable(this.f40470b, i10);
    }

    public x(Parcel parcel) {
        this.f40469a = parcel.readString();
        this.f40470b = parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
    }
}

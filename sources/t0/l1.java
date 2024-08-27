package t0;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l1 extends u2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<l1> CREATOR = new android.support.v4.media.a(11);

    public l1(int i10) {
        this.f35217b = new t2(i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(i());
    }
}

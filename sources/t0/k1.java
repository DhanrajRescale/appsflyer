package t0;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k1 extends s2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k1> CREATOR = new android.support.v4.media.a(10);

    public k1(float f10) {
        this.f35200b = new r2(f10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(i());
    }
}

package t0;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m1 extends w2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<m1> CREATOR = new android.support.v4.media.a(12);

    public m1(long j10) {
        this.f35229b = new v2(j10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(((v2) e1.p.r(this.f35229b, this)).f35223c);
    }
}

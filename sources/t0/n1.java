package t0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n1 extends y2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<n1> CREATOR = new m.f3(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        h1 h1Var = h1.f35033a;
        z2 z2Var = this.f35274b;
        if (Intrinsics.a(z2Var, h1Var)) {
            i11 = 0;
        } else if (Intrinsics.a(z2Var, o3.f35116a)) {
            i11 = 1;
        } else if (Intrinsics.a(z2Var, g2.f35024a)) {
            i11 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i11);
    }
}

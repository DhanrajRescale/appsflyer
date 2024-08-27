package k7;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e2 implements Parcelable {
    public static final Parcelable.Creator<e2> CREATOR = new k6.d(20);

    /* renamed from: a, reason: collision with root package name */
    public int f22337a;

    /* renamed from: b, reason: collision with root package name */
    public int f22338b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f22339c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22340d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f22337a + ", mGapDir=" + this.f22338b + ", mHasUnwantedGapAfter=" + this.f22340d + ", mGapPerSpan=" + Arrays.toString(this.f22339c) + UrlTreeKt.componentParamSuffixChar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22337a);
        parcel.writeInt(this.f22338b);
        parcel.writeInt(this.f22340d ? 1 : 0);
        int[] iArr = this.f22339c;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f22339c);
        } else {
            parcel.writeInt(0);
        }
    }
}

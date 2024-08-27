package xo;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import k4.b;
import m.f3;
import t.j0;

/* loaded from: classes2.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new f3(16);

    /* renamed from: c, reason: collision with root package name */
    public final j0 f40537c;

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f40537c = new j0(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f40537c + UrlTreeKt.componentParamSuffix;
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        j0 j0Var = this.f40537c;
        int i11 = j0Var.f34873c;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = (String) j0Var.f(i12);
            bundleArr[i12] = (Bundle) j0Var.j(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f40537c = new j0(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f40537c.put(strArr[i10], bundleArr[i10]);
        }
    }
}

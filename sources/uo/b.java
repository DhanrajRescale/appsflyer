package uo;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import m.f3;

/* loaded from: classes2.dex */
public final class b extends k4.b {
    public static final Parcelable.Creator<b> CREATOR = new f3(15);

    /* renamed from: c, reason: collision with root package name */
    public final int f37317c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f37317c = parcel.readInt();
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeInt(this.f37317c);
    }

    public b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f37317c = sideSheetBehavior.f11417h;
    }
}

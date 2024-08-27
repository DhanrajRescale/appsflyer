package ao;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import m.f3;

/* loaded from: classes2.dex */
public final class c extends k4.b {
    public static final Parcelable.Creator<c> CREATOR = new f3(9);

    /* renamed from: c, reason: collision with root package name */
    public final int f2647c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2648d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2649e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2650f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2651g;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2647c = parcel.readInt();
        this.f2648d = parcel.readInt();
        this.f2649e = parcel.readInt() == 1;
        this.f2650f = parcel.readInt() == 1;
        this.f2651g = parcel.readInt() == 1;
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeInt(this.f2647c);
        parcel.writeInt(this.f2648d);
        parcel.writeInt(this.f2649e ? 1 : 0);
        parcel.writeInt(this.f2650f ? 1 : 0);
        parcel.writeInt(this.f2651g ? 1 : 0);
    }

    public c(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f2647c = bottomSheetBehavior.L;
        this.f2648d = bottomSheetBehavior.f11176e;
        this.f2649e = bottomSheetBehavior.f11170b;
        this.f2650f = bottomSheetBehavior.I;
        this.f2651g = bottomSheetBehavior.J;
    }
}

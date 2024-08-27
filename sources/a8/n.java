package a8;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import m.f3;

/* loaded from: classes.dex */
public final class n extends View.BaseSavedState {
    public static final Parcelable.Creator<n> CREATOR = new f3(8);

    /* renamed from: a, reason: collision with root package name */
    public int f277a;

    /* renamed from: b, reason: collision with root package name */
    public int f278b;

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f279c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f277a);
        parcel.writeInt(this.f278b);
        parcel.writeParcelable(this.f279c, i10);
    }
}

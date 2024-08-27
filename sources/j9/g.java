package j9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new k6.d(24);

    /* renamed from: a, reason: collision with root package name */
    public String f21148a;

    /* renamed from: b, reason: collision with root package name */
    public int f21149b;

    /* renamed from: c, reason: collision with root package name */
    public float f21150c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21151d;

    /* renamed from: e, reason: collision with root package name */
    public String f21152e;

    /* renamed from: f, reason: collision with root package name */
    public int f21153f;

    /* renamed from: g, reason: collision with root package name */
    public int f21154g;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f21148a);
        parcel.writeFloat(this.f21150c);
        parcel.writeInt(this.f21151d ? 1 : 0);
        parcel.writeString(this.f21152e);
        parcel.writeInt(this.f21153f);
        parcel.writeInt(this.f21154g);
    }
}

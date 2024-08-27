package pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new zi.j(25);

    /* renamed from: a, reason: collision with root package name */
    public float f31172a;

    /* renamed from: b, reason: collision with root package name */
    public float f31173b;

    /* renamed from: c, reason: collision with root package name */
    public float f31174c;

    /* renamed from: d, reason: collision with root package name */
    public int f31175d;

    /* renamed from: e, reason: collision with root package name */
    public int f31176e;

    /* renamed from: f, reason: collision with root package name */
    public int f31177f;

    /* renamed from: g, reason: collision with root package name */
    public int f31178g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31179h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31180i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31181j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31182k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31183l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31184m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31185n;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f31172a);
        parcel.writeFloat(this.f31173b);
        parcel.writeInt(this.f31179h ? 1 : 0);
        parcel.writeFloat(this.f31174c);
        parcel.writeInt(this.f31175d);
        parcel.writeInt(this.f31176e);
        parcel.writeInt(this.f31177f);
        parcel.writeInt(this.f31178g);
        parcel.writeInt(this.f31180i ? 1 : 0);
        parcel.writeInt(this.f31181j ? 1 : 0);
        parcel.writeInt(this.f31182k ? 1 : 0);
        parcel.writeInt(this.f31183l ? 1 : 0);
        parcel.writeInt(this.f31184m ? 1 : 0);
        parcel.writeInt(this.f31185n ? 1 : 0);
    }
}

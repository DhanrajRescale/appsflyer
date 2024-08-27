package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final List f1642a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1643b;

    public d(ArrayList arrayList, ArrayList arrayList2) {
        this.f1642a = arrayList;
        this.f1643b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1642a);
        parcel.writeTypedList(this.f1643b);
    }

    public d(Parcel parcel) {
        this.f1642a = parcel.createStringArrayList();
        this.f1643b = parcel.createTypedArrayList(c.CREATOR);
    }
}

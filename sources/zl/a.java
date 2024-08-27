package zl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import zi.j;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new j(19);

    /* renamed from: a, reason: collision with root package name */
    public int f42552a;

    /* renamed from: b, reason: collision with root package name */
    public int f42553b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f42554c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42552a);
        parcel.writeInt(this.f42553b);
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f42554c;
        for (String str : hashMap.keySet()) {
            bundle.putInt(str, ((Integer) hashMap.get(str)).intValue());
        }
        parcel.writeBundle(bundle);
    }
}
